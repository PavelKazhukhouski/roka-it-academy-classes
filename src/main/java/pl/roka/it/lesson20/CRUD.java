package pl.roka.it.lesson20;

import java.io.PrintWriter;
import java.sql.*;

public class CRUD {

    public static void createData(Connection connection, PrintWriter pw) throws SQLException {
        PreparedStatement ps = connection.prepareStatement(
                "INSERT INTO books (title, genre, author) VALUES (?, ?, ?)");

        ps.setString(1, "The Old Man and the Sea");
        ps.setString(2, "Literary");
        ps.setString(3, "Ernest Hemingway");

        int modifiedEntries = ps.executeUpdate();

        if (modifiedEntries > 0) {
            pw.println("Data created successfully");
        } else {
            pw.println("No records updated");
        }
        ps.close();
    }

    public static void readData(Connection connection, PrintWriter pw) throws SQLException {
        Statement statement = connection.createStatement();
        ResultSet rs = statement.executeQuery("SELECT * FROM books");
        while (rs.next()) {
            pw.println("<br/>" + rs.getInt("bookID") + ", " + rs.getString("title" )
                    + ", " + rs.getString("genre") + ", " + rs.getString("author"));
        }
    }

    public static void updateData(Connection connection, PrintWriter pw) throws SQLException {
        String sql = "UPDATE books SET author = 'Nikolo Makiavelli' WHERE genre = 'Literary'";
        PreparedStatement ps = connection.prepareStatement(sql);
        int modifiedEntries = ps.executeUpdate();
        if (modifiedEntries > 0) {
            pw.println("Data updated successfully");
        } else {
            pw.println("No records updated");
        }
        ps.close();

    }

    public static void deleteData(Connection connection, PrintWriter pw) throws SQLException {
        PreparedStatement ps = connection.prepareStatement("DELETE FROM books WHERE genre LIKE ?");
        ps.setString(1, "Literary");
        int modifiedEntries = ps.executeUpdate();
        if (modifiedEntries > 0) {
            pw.println("Data delete successfully");
        } else {
            pw.println("No records updated");
        }
        ps.close();
    }
}
