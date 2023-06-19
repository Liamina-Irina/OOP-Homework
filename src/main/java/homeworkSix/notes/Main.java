package homeworkSix.notes;

import homeworkSix.notes.model.FileOperation;
import homeworkSix.notes.model.FileOperationImpl;
import homeworkSix.notes.model.Repository;
import homeworkSix.notes.model.RepositoryFile;
import homeworkSix.notes.views.ViewNote;
import homeworkSix.notes.controllers.NoteController;

public class Main {
    public static void main(String[] args) {
        FileOperation fileOperation = new FileOperationImpl("notes.txt");
        Repository repository = new RepositoryFile(fileOperation);
        NoteController controller = new NoteController(repository);
        ViewNote view = new ViewNote(controller);
        view.run();
    }
}