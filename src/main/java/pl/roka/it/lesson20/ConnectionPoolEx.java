package pl.roka.it.lesson20;

import javax.naming.Context;
import javax.naming.InitialContext;
import javax.naming.NamingException;
import javax.sql.DataSource;
import java.sql.Connection;
import java.sql.SQLException;

public class ConnectionPoolEx {

    private static ConnectionPoolEx instance = null;


    private ConnectionPoolEx() {
    }

    public static ConnectionPoolEx getInstance() {
        if (instance == null) {
            instance = new ConnectionPoolEx();
        }
        return instance;
    }

    public Connection getConnection() {
        Context context = null;
        DataSource dataSource = null;
        Connection connection = null;
        try {
            context = new InitialContext();
            dataSource = (DataSource) context.lookup("java:comp/env/jdbc/testpool");
            connection = dataSource.getConnection();
            System.out.println("Connection have been got");

        } catch (SQLException e) {
            e.printStackTrace();
        } catch (NamingException e) {
            e.printStackTrace();
        }

        return connection;
    }
}