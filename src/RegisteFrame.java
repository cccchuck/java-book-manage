import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JOptionPane;
import javax.swing.JPasswordField;

import java.awt.Dimension;
import java.awt.Toolkit;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class RegisteFrame extends JFrame {
  private DataBase db;
  private PreparedStatement ps;
  private Connection con;

  public RegisteFrame() {
    db = new DataBase();
    con = db.getConnection();

    Dimension screensize = Toolkit.getDefaultToolkit().getScreenSize();
    int screenWidth = (int) screensize.getWidth();
    int screenHeight = (int) screensize.getHeight();

    setTitle("Register");
    setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    setBounds((screenWidth - 200) / 2, (screenHeight - 150) / 2, 400, 300);
    setVisible(true);
    setLayout(null);
    setResizable(true);

    JLabel lUsername = new JLabel("账号: ");
    lUsername.setBounds(100, 50, 50, 30);
    add(lUsername);

    JTextField tUsername = new JTextField();
    tUsername.setBounds(160, 50, 150, 30);
    add(tUsername);

    JLabel lPassword = new JLabel("密码: ");
    lPassword.setBounds(100, 100, 50, 30);
    add(lPassword);

    JPasswordField tPassword = new JPasswordField();
    tPassword.setBounds(160, 100, 150, 30);
    add(tPassword);

    JButton btnRegister = new JButton("注册");
    btnRegister.setBounds(150, 150, 100, 30);
    add(btnRegister);

    btnRegister.addActionListener(e -> {
      String username = tUsername.getText();
      String password = new String(tPassword.getPassword());

      if (username.equals("") || password.equals("")) {
        JOptionPane.showMessageDialog(null, "账号或密码不能为空");
        return;
      }

      try {
        ps = con.prepareStatement("select * from cuser where username = ?");
        ps.setString(1, username);
        con.setAutoCommit(false);
        ResultSet rs = ps.executeQuery();
        if (rs.next()) {
          JOptionPane.showMessageDialog(null, "账号已存在");
          return;
        }
      } catch (Exception e1) {
        e1.printStackTrace();
      }

      try {
        ps = con.prepareStatement("insert into cuser(username, password) values(?, ?)");
        ps.setString(1, username);
        ps.setString(2, password);
        ps.executeUpdate();
        con.commit();
        JOptionPane.showMessageDialog(null, "注册成功");
        new MainFrame();
        setVisible(false);
      } catch (Exception e1) {
        e1.printStackTrace();
      }
    });
  }

  public static void main(String[] args) {
    new RegisteFrame();
  }
}
