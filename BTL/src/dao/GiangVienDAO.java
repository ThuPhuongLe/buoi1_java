package dao;

import model.GiangVien;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class GiangVienDAO {
    public void add(GiangVien gv, String username) throws SQLException {
        String sql = "INSERT INTO GV VALUES(? , ? , ? , ? , ?, ? , ? )";

        PreparedStatement preparedStatement = JDBCConnection.getJDBCConnection().prepareStatement(sql);
        preparedStatement.setString(1, gv.getId());
        preparedStatement.setString(2, gv.getHoTen());
        preparedStatement.setInt(3, gv.getTuoi());
        preparedStatement.setString(4, gv.getGioiTinh());
        preparedStatement.setString(5, gv.getKhoa());
        preparedStatement.setString(6, gv.getTrinhDo());
        preparedStatement.setString(7, gv.getUsername());
        preparedStatement.executeUpdate();
    }

    public void addUsername(String Id, String username) throws SQLException{
        String sql = "UPDATE GV SET username = ? WHERE Id = ?";
        PreparedStatement preparedStatement = JDBCConnection.getJDBCConnection().prepareStatement(sql);

        preparedStatement.setString(1,username);
        preparedStatement.setString(2,Id);
        preparedStatement.executeUpdate();
    }

    public void update(GiangVien gv, String username) throws SQLException {
        String sql = "UPDATE GV SET HoTen = ? , Tuoi = ? , GioiTinh = ? , Khoa = ? , TrinhDo = ? WHERE username = ?";
        PreparedStatement preparedStatement = JDBCConnection.getJDBCConnection().prepareStatement(sql);

        preparedStatement.setString(1, gv.getHoTen());
        preparedStatement.setInt(2, gv.getTuoi());
        preparedStatement.setString(3, gv.getGioiTinh());
        preparedStatement.setString(4, gv.getKhoa());
        preparedStatement.setString(5, gv.getTrinhDo());
        preparedStatement.setString(6, username);
        preparedStatement.executeUpdate();
    }


    public void delete(String Id) {

        try {
            String sql = "DELETE FROM GV WHERE Id = ?";
            PreparedStatement preparedStatement;
            preparedStatement = JDBCConnection.getJDBCConnection().prepareStatement(sql);
            preparedStatement.setString(1, Id);
            preparedStatement.executeUpdate();
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
    }

    public List<GiangVien> findAll() throws SQLException {
        List<GiangVien> listGV = new ArrayList<>();
        String sql = "SELECT * FROM GV";

        PreparedStatement preparedStatement = JDBCConnection.getJDBCConnection().prepareStatement(sql);
        ResultSet resultSet = preparedStatement.executeQuery();
        while (resultSet.next()) {
            GiangVien a = new GiangVien();
            a.setId(resultSet.getString("Id"));
            a.setHoTen(resultSet.getString("HoTen"));
            a.setTuoi(resultSet.getInt("Tuoi"));
            a.setGioiTinh(resultSet.getString("GioiTinh"));
            a.setKhoa(resultSet.getString("Khoa"));
            a.setTrinhDo(resultSet.getString("TrinhDo"));
            a.setUsername(resultSet.getString("username"));
            listGV.add(a);
        }
        return listGV;
    }

    public static GiangVien find(String Id) throws SQLException {
        String sql = "SELECT * FROM GV WHERE Id = ?";

        PreparedStatement preparedStatement = JDBCConnection.getJDBCConnection().prepareStatement(sql);
        preparedStatement.setString(1, Id);
        ResultSet resultSet = preparedStatement.executeQuery();
        GiangVien a = new GiangVien();
        while (resultSet.next()) {
            a.setId(resultSet.getString("Id"));
            a.setHoTen(resultSet.getString("HoTen"));
            a.setTuoi(resultSet.getInt("Tuoi"));
            a.setGioiTinh(resultSet.getString("GioiTinh"));
            a.setKhoa(resultSet.getString("Khoa"));
            a.setTrinhDo(resultSet.getString("TrinhDo"));
            a.setUsername(resultSet.getString("username"));
            return a;
        }
        return null;
    }

    public List<GiangVien> findGvByName(String name) throws SQLException {
        List<GiangVien> listGVname = new ArrayList<>();
        String sql = "SELECT * FROM GV WHERE HoTen LIKE ?";

        PreparedStatement preparedStatement = JDBCConnection.getJDBCConnection().prepareStatement(sql);
        preparedStatement.setString(1, "%" + name + "%");
        ResultSet resultSet = preparedStatement.executeQuery();
        while (resultSet.next()) {
            GiangVien gv = new GiangVien();
            gv.setId(resultSet.getString("Id"));
            gv.setHoTen(resultSet.getString("HoTen"));
            gv.setTuoi(resultSet.getInt("Tuoi"));
            gv.setGioiTinh(resultSet.getString("GioiTinh"));
            gv.setKhoa(resultSet.getString("Khoa"));
            gv.setTrinhDo(resultSet.getString("TrinhDo"));
            gv.setUsername(resultSet.getString("username"));
            listGVname.add(gv);
        }
        return listGVname;
    }

    public static String getName(String username) {
        try {
            String sql = "SELECT HoTen FROM GV WHERE " +
                    "username = ?";
            PreparedStatement statement = JDBCConnection.getJDBCConnection().prepareStatement(sql);

            statement.setString(1, username);
            ResultSet resultSet = statement.executeQuery();
            while (resultSet.next()) {
                return resultSet.getString("HoTen");
            }
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
        return null;
    }

    public static String getId(String username) {
        try {
            String sql = "SELECT Id FROM GV WHERE username = ?";
            PreparedStatement statement = JDBCConnection.getJDBCConnection().prepareStatement(sql);
            statement.setString(1, username);
            ResultSet resultSet = statement.executeQuery();
            while (resultSet.next()) {
                return resultSet.getString("Id");
            }
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
        return null;
    }

    public static void updatePassword(String username, String password) {
        String sql = "UPDATE Account SET password = ? WHERE username = ?";
        try {
            PreparedStatement preparedStatement = JDBCConnection.getJDBCConnection().prepareStatement(sql);
            preparedStatement.setString(1, password);
            preparedStatement.setString(2, username);
            int rs = preparedStatement.executeUpdate();
            if (rs == 1) System.out.println("Update success");
            else System.out.println("Check username again");
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
    }
}
