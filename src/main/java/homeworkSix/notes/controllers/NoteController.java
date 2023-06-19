package homeworkSix.notes.controllers;

import homeworkSix.notes.model.Repository;
import homeworkSix.notes.model.Note;

import java.util.List;

public class NoteController {
    private final Repository repository;

    public NoteController(Repository repository) {
        this.repository = repository;
    }

    public void saveNote(Note note) {
        repository.CreateNote(note);
    }

    public Note readNote(String noteId) throws Exception {
        List<Note> notes = repository.getAllNotes();
        for (Note note : notes) {
            if (note.getId().equals(noteId)) {
                return note;
            }
        }

        throw new Exception("Note not found");
    }

    public List<Note> readAllNotes (){
        return repository.getAllNotes();
    }

    public Note updateNote(Note note) {
        return repository.updateNote(note);
    }

    public void deleteNote(Note note) {
        repository.deleteNote(note);
    }
}