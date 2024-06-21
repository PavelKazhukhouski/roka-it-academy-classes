package pl.roka.it.lesson20;

import jakarta.servlet.http.HttpServletRequest;
import java.sql.*;
import java.util.concurrent.CopyOnWriteArrayList;

public class CRUD {


    public static void createData(Connection connection, HttpServletRequest req) throws SQLException {
        String title = req.getParameter("title");
        String genre = req.getParameter("genre");
        String author = req.getParameter("author");

        PreparedStatement checkStmt = connection.prepareStatement(
                "SELECT COUNT(*) FROM books WHERE title = ? AND genre = ? AND author = ?");
        checkStmt.setString(1, title);
        checkStmt.setString(2, genre);
        checkStmt.setString(3, author);

        ResultSet rs = checkStmt.executeQuery();
        int count = 0;
        if (rs.next()) {
            count = rs.getInt(1);
        }
        rs.close();
        checkStmt.close();

        if (count > 0) {
            System.out.println("Record already exists. No new data created.");
        } else {
            PreparedStatement ps = connection.prepareStatement(
                    "INSERT INTO books (title, genre, author) VALUES (?, ?, ?)");
            ps.setString(1, title);
            ps.setString(2, genre);
            ps.setString(3, author);

            int modifiedEntries = ps.executeUpdate();
            ps.close();

            if (modifiedEntries > 0) {
                System.out.println("Data created successfully");
            } else {
                System.out.println("No records updated");
            }
        }
    }

    public static void readData(Connection connection, CopyOnWriteArrayList<Book> books) throws SQLException {
        Statement statement = connection.createStatement();
        ResultSet rs = statement.executeQuery("SELECT * FROM books");
        while (rs.next()) {
            Book book = new Book(rs.getInt("bookID"), rs.getString("title"),
                    rs.getString("genre"), rs.getString("author"));

            if (!books.contains(book)) {
                books.add(book);
            }
        }
        statement.close();
        rs.close();
    }

    public static void updateData(Connection connection, String title, String genre, String author, int bookId) throws SQLException {
        String sql = "UPDATE books SET title = ?, genre = ?, author = ? WHERE bookID = ?";
        PreparedStatement ps = connection.prepareStatement(sql);
        ps.setString(1,title);
        ps.setString(2,genre);
        ps.setString(3,author);
        ps.setInt(4,bookId);
        int modifiedEntries = ps.executeUpdate();
        if (modifiedEntries > 0) {
            System.out.println("Data updated successfully");
        } else {
            System.out.println("No records updated");
        }
        ps.close();

    }

    public static void deleteData(Connection connection, String title) throws SQLException {
        String sql = "DELETE FROM books WHERE title LIKE ?";
        try (PreparedStatement ps = connection.prepareStatement(sql)) {
            ps.setString(1, title);
            int modifiedEntries = ps.executeUpdate();
            if (modifiedEntries > 0) {
                System.out.println("Data delete successfully");
            } else {
                System.out.println("No records updated");
            }
        }
    }
}
