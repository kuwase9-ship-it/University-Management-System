package Lab2;

import Lab1.Student;
import Lab1.Undergraduate;
import Lab1.Graduates;
import java.sql.*;
import java.util.*;

public class StudentDAO {

    // Lab 2.2 - Insert student
    public void insertStudent(String regNo, String name, String email, String type) throws SQLException {
        String sql = "INSERT INTO students(reg_no, full_name, email, student_type) VALUES(?,?,?,?)";
        try (Connection c = DBConnection.getConnection();
             PreparedStatement ps = c.prepareStatement(sql)) { // Lab 2.3 PreparedStatement
            ps.setString(1, regNo);
            ps.setString(2, name);
            ps.setString(3, email);
            ps.setString(4, type);
            ps.executeUpdate();
        }
    }

    public List<Student> listAll() throws SQLException {
        List<Student> list = new ArrayList<>();
        String sql = "SELECT * FROM students";
        try (Connection c = DBConnection.getConnection();
             Statement st = c.createStatement();
             ResultSet rs = st.executeQuery(sql)) {
            while(rs.next()) {
                String type = rs.getString("student_type");
                if("GRADUATE".equals(type))
                    list.add(new Graduates(rs.getInt("id"), rs.getString("reg_no"), rs.getString("full_name"), rs.getString("email"), 0));
                else
                    list.add(new Undergraduate(rs.getInt("id"), rs.getString("reg_no"), rs.getString("full_name"), rs.getString("email"), 0));
            }
        }
        return list;
    }

    public void deleteStudent(String regNo) throws SQLException {
        String sql = "DELETE FROM students WHERE reg_no=?";
        try (Connection c = DBConnection.getConnection();
             PreparedStatement ps = c.prepareStatement(sql)) {
            ps.setString(1, regNo);
            ps.executeUpdate();
        }
    }
}