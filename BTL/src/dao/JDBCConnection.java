//package dao;
//
//import com.microsoft.sqlserver.jdbc.SQLServerDataSource;
//import com.microsoft.sqlserver.jdbc.SQLServerException;
//
//import java.sql.Connection;
//import java.sql.SQLException;
//
//public class JDBCConnection {
//    public static void main(String[] args) {
//        SQLServerDataSource ds = new SQLServerDataSource();
//        ds.setUser("sa");
//        ds.setPassword("123");
//        ds.setServerName("DESKTOP-8JELR3I");
//        ds.setPortNumber(1433);
//        ds.setDatabaseName("GiangVien");
//
//        try(Connection conn = ds.getConnection()){
//            System.out.println("Connection success!");
//            System.out.println(conn.getCatalog());
//        } catch(SQLServerException throwables){
//            throwables.printStackTrace();
//        } catch (SQLException throwables){
//            throwables.printStackTrace();
//        }
//    }
//}
package dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class JDBCConnection {
    public static Connection getJDBCConnection() {
        Connection c=null;
        final String user = "sa";
        final String password = "123";

        final String url = "jdbc:sqlserver://localhost:1433;databaseName=GiangVien;user=" + user + ";password=" + password;

        try {
            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
            c=DriverManager.getConnection(url);
            return c;
        } catch (ClassNotFoundException | SQLException e) {
            e.printStackTrace();
        }
        return null;
    }

    public static void closeConnection(Connection c){
        try{
            if(c!=null){
                c.close();
            }
        } catch (Exception e){
            e.printStackTrace();
        }
    }
}