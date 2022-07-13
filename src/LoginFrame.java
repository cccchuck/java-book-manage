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

public class LoginFrame extends JFrame {
  private DataBase db;
  private Connection con;
  private PreparedStatement ps;

  public LoginFrame() {
    db = new DataBase();
    con = db.getConnection();

    Dimension screensize = Toolkit.getDefaultToolkit().getScreenSize();
    int screenWidth = (int) screensize.getWidth();
    int screenHeight = (int) screensize.getHeight();

    setTitle("Log in");
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

    JButton btnLogin = new JButton("登录");
    btnLogin.setBounds(100, 150, 100, 30);
    add(btnLogin);

    JButton btnRegister = new JButton("注册");
    btnRegister.setBounds(200, 150, 100, 30);
    add(btnRegister);

    btnLogin.addActionListener(e -> {
      String username = tUsername.getText();
      String password = new String(tPassword.getPassword());
      try {
        ps = con.prepareStatement("select * from cuser where username = ? and password = ?");
        ps.setString(1, username);
        ps.setString(2, password);
        con.setAutoCommit(false);
        ResultSet rs = ps.executeQuery();
        if (rs.next()) {
          JOptionPane.showMessageDialog(null, "登录成功，即将自动登录");
          new MainFrame();
          setVisible(false);
        } else {
          JOptionPane.showMessageDialog(null, "账号或密码不正确");
        }
      } catch (Exception err) {
        JOptionPane.showMessageDialog(null, "登录失败");
      }
    });

    btnRegister.addActionListener(e -> {
      new RegisteFrame();
      setVisible(false);
    });
  }

  public static void main(String[] args) {
    new LoginFrame();
  }
}
