package notes.project.Controller.Controllers;

import notes.project.Connection.DBConnection;
import notes.project.Controller.MainController;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class GetNote extends MainController {

    public void get(DBConnection conn, int id) {
        ControllerInterface func = (Connection connection) -> {
            PreparedStatement stmt = connection.prepareStatement("SELECT title, content FROM note WHERE id = ?");
            stmt.setInt(1, id);
            ResultSet rs = stmt.executeQuery();
            while (rs.next()) {
                System.out.println(rs.getString("title") + ": " + rs.getString("content"));
            }
            rs.close();
            stmt.close();
        };
        conn.request(func);
    }
}

