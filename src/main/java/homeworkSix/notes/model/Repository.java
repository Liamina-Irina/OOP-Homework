package homeworkSix.notes.model;

import java.util.List;

public interface Repository {
    List<Note> getAllNotes();
    String CreateNote(Note note);
    Note updateNote(Note note);
    void deleteNote(Note note);
}