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

    private Connection connection;

    @Override
    public void init() throws ServletException {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            DriverManager.registerDriver(new com.mysql.cj.jdbc.Driver());
            connection = DriverManager.getConnection(USER_URL, USER_NAME, USER_PASS);
        } catch (ClassNotFoundException | SQLException e) {
            throw new ServletException("Failed to register MySQL driver or establish connection", e);
        }
    }

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        resp.setContentType("text/html;charset=UTF-8");

        try (PrintWriter pw = resp.getWriter()) {
            pw.println("<h3>It is test servlet!!!</h3>");

            String command = req.getParameter("command");
            if (command != null) {
                dataBaseСommand(command, connection, pw);
            } else {
                pw.write("No command provided");
            }
        } catch (SQLException e) {
            throw new ServletException("Database error", e);
        }
    }

    private void dataBaseСommand(String command, Connection connection, PrintWriter pw) throws SQLException {
        switch (command) {
            case "read":

                CRUD.readData(connection, pw);
                break;
            case "create":
                CRUD.createData(connection, pw);
                break;
            case "update":
                CRUD.updateData(connection, pw);
                break;
            case "delete":
                CRUD.deleteData(connection, pw);
                break;
            default:
                pw.write("Invalid command");
                break;
        }
    }

    @Override
    public void destroy() {
        try {
            connection.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }

    }


}
