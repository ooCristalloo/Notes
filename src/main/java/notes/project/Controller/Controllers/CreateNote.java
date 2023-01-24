package notes.project.Controller.Controllers;

import notes.project.Connection.DBConnection;
import notes.project.Controller.MainController;

import java.sql.Connection;
import java.sql.PreparedStatement;

public class CreateNote extends MainController {

    public void create(DBConnection conn, String title, String content) {
        ControllerInterface func = (Connection connection) -> {
            PreparedStatement stmt = connection.prepareStatement("INSERT INTO note (title, content) VALUES (?, ?)");
            stmt.setString(1, title);
            stmt.setString(2,  content);
            stmt.executeUpdate();
            stmt.close();
        };
        conn.request(func);
    }
}
