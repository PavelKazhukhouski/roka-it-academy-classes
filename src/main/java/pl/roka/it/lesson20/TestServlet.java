package pl.roka.it.lesson20;

import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class TestServlet extends HttpServlet {
    private static final String USER_URL = "jdbc:mysql://localhost:3306/demo_mysql";
    private static final String USER_NAME = "root";
    private static final String USER_PASS = "root";

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            DriverManager.registerDriver(new com.mysql.cj.jdbc.Driver());
        } catch (ClassNotFoundException | SQLException e) {
            throw new RuntimeException(e);
        }
        try (Connection connection = DriverManager.getConnection(USER_URL, USER_NAME, USER_PASS);
             PrintWriter pw = resp.getWriter()) {

            switch (req.getParameter("command")) {
                case "read" -> CRUD.readData(connection, pw);
                case "create" -> CRUD.createData(connection, pw);
                case "update" -> CRUD.updateData(connection, pw);
                case "delete" -> CRUD.deleteData(connection, pw);
                default -> pw.write("Invalid command");
            }

        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }


}
