package notes.project.Controller.Controllers;

import java.sql.Connection;
import java.sql.SQLException;

public interface ControllerInterface {
    void proccess(Connection connection) throws SQLException;
}
