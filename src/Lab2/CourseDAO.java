package Lab2;
import java.sql.*;
public class CourseDAO {
    public void insertCourse(String code, String title, int credits) throws SQLException {
        String sql = "INSERT INTO courses(code, title, credits) VALUES(?,?,?)";
        try (Connection c = DBConnection.getConnection(); PreparedStatement ps = c.prepareStatement(sql)) {
            ps.setString(1, code); ps.setString(2, title); ps.setInt(3, credits); ps.executeUpdate();
        }
    }
    public void enrollStudent(int studentId, int courseId) throws SQLException {
        String sql = "INSERT INTO enrollments(student_id, course_id) VALUES(?,?)";
        try (Connection c = DBConnection.getConnection(); PreparedStatement ps = c.prepareStatement(sql)) {
            ps.setInt(1, studentId); ps.setInt(2, courseId); ps.executeUpdate();
            System.out.println("Enrolled successfully!");
        }
    }
    public void listCourses() throws SQLException {
        String sql = "SELECT * FROM courses";
        try (Connection c = DBConnection.getConnection(); Statement st = c.createStatement(); ResultSet rs = st.executeQuery(sql)) {
            while(rs.next()) System.out.println(rs.getInt("id") + " | " + rs.getString("code") + " - " + rs.getString("title"));
        }
    }
}
