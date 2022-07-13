import java.sql.*;

public class DataBase {
  private String URL = "jdbc:mysql://127.0.0.1:3306/BOOK";// 数据库（test为存放cbook表的数据库）
  private String USER = "root";
  private String PWD = "123456";

  public DataBase() {
    try {
      // 加载数据库驱动程序
      Class.forName("com.mysql.jdbc.Driver");
    } catch (ClassNotFoundException exception) {
      exception.printStackTrace();
    }
  }

  // 获取数据库连接
  public Connection getConnection() {
    Connection connection = null;
    try {
      // 建立数据库连接
      connection = DriverManager.getConnection(URL, USER, PWD);
      System.out.println("Connection_success");
    } catch (SQLException exception) {
      exception.printStackTrace();
    }
    return connection;
  }

  // 关闭数据库连接
  public void closeConnection(Connection connection) {
    try {
      if (connection != null) {
        connection.close();
      }
    } catch (Exception e) {
      e.printStackTrace();
    }
  }

  public static void main(String args[]) {
  }
}
