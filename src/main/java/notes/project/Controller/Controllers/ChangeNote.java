package notes.project.Controller.Controllers;

import notes.project.Connection.DBConnection;
import notes.project.Controller.MainController;

import java.sql.Connection;
import java.sql.PreparedStatement;

public class ChangeNote extends MainController {

    public void change(DBConnection con, String title, String content, int id) {
        ControllerInterface func = (Connection connection) -> {
            PreparedStatement stmt = connection.prepareStatement("UPDATE note set title = ?, content = ? WHERE id = ?");
            stmt.setString(1, title);
            stmt.setString(2, content);
            stmt.setInt(3, id);
            stmt.executeUpdate();
            stmt.close();
        };
        con.request(func);
    }
}
