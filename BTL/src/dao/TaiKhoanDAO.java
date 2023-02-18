package dao;

import model.TaiKhoan;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class TaiKhoanDAO {
    public void add(TaiKhoan tk) throws SQLException {
        do {
            String sql = "INSERT INTO Account VALUES(? , ? , ?)";
            PreparedStatement preparedStatement = JDBCConnection.getJDBCConnection().prepareStatement(sql);
            preparedStatement.setString(1, tk.getUsername());
            preparedStatement.setString(2, tk.getPassword());
            preparedStatement.setString(3, tk.getRole());
            preparedStatement.executeUpdate();
        } while (false);
    }

    public List<TaiKhoan> getAccount() {
        try {
            List<TaiKhoan> listTk = new ArrayList<>();
            String sql = "SELECT * FROM Account";
            PreparedStatement preparedStatement = JDBCConnection.getJDBCConnection().prepareStatement(sql);
            ResultSet resultSet = preparedStatement.executeQuery();
            while (resultSet.next()) {
                TaiKhoan tk = new TaiKhoan();
                tk.setUsername(resultSet.getString("username"));
                tk.setPassword(resultSet.getString("password"));
                tk.setRole(resultSet.getString("role"));
                listTk.add(tk);
            }
            return listTk;
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
        return null;
    }

    public void deleteAccount(String username) {
        try {
            String sql = "DELETE FROM Account WHERE username = ?";
            PreparedStatement preparedStatement = JDBCConnection.getJDBCConnection().prepareStatement(sql);
            preparedStatement.setString(1, username);
            preparedStatement.executeUpdate();
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
    }

    public void updatePassword(String username, String password) {
        String sql = "UPDATE Account SET password = ? WHERE username = ?";
        try {
            PreparedStatement preparedStatement = JDBCConnection.getJDBCConnection().prepareStatement(sql);
            preparedStatement.setString(1, password);
            preparedStatement.setString(2, username);
            preparedStatement.executeUpdate();
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
    }
}
