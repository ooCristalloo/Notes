package notes.project.Controller;

import notes.project.Connection.DBConnection;
import notes.project.Controller.Controllers.ChangeNote;
import notes.project.Controller.Controllers.CreateNote;
import notes.project.Controller.Controllers.DeleteNote;
import notes.project.Controller.Controllers.GetNote;

public class MainController {

    public MainController() {
    }

    private ChangeNote changeController;
    private CreateNote createController;
    private DeleteNote deleteController;
    private GetNote getController;

    public void run() {
        this.initControllers();
        //this.getDeleteController().delete(new DBConnection(), 1); удаляет значения
        //this.getGetController().get(new DBConnection(), 1); возвращает значение
        //this.getCreateController().create(new DBConnection(), "тайтл", "текст"); создает значение
        //this.getChangeController().change(new DBConnection(), "тайтл", "текст", 1); меняет значение
    }

    private void initControllers() {
        this.changeController = new ChangeNote();
        this.createController = new CreateNote();
        this.deleteController = new DeleteNote();
        this.getController = new GetNote();
    }

    public ChangeNote getChangeController() {
        return changeController;
    }

    public CreateNote getCreateController() {
        return createController;
    }

    public DeleteNote getDeleteController() {
        return deleteController;
    }

    public GetNote getGetController() {
        return getController;
    }
}
