package notes.project.Connection;

import notes.project.Controller.Controllers.ControllerInterface;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBConnection {

    private final String URL = "jdbc:mysql://localhost:3306/notes";
    private final String USERNAME = "пользователь";
    private final String PASSWORD = "пароль";

    private Connection connection;

    public DBConnection() {
    }

    public void request(ControllerInterface func) {
        try (Connection connection = DriverManager.getConnection(URL, USERNAME, PASSWORD)) {
            func.proccess(connection);
        } catch (SQLException e) {
            System.out.println("CПодключение к базе данных не установлено!");
            e.printStackTrace();
        }
    }

    public Connection getConnection() {
        return this.connection;
    }
}
