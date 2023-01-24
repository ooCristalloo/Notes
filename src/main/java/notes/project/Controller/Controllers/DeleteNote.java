package notes.project.Controller.Controllers;

import notes.project.Connection.DBConnection;
import notes.project.Controller.MainController;

import java.sql.Connection;
import java.sql.PreparedStatement;

public class DeleteNote extends MainController {

    public void delete(DBConnection con, int id) {
        ControllerInterface func = (Connection connection) -> {
            PreparedStatement stmt = connection.prepareStatement("DELETE FROM note WHERE id = ?");
            stmt.setInt(1, id);
            stmt.executeUpdate();
            stmt.close();
        };
        con.request(func);
    }
}
