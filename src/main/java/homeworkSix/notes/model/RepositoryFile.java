package homeworkSix.notes.model;

import java.util.ArrayList;
import java.util.List;

public class RepositoryFile implements Repository {
    private NoteMapper mapper = new NoteMapper();
    private FileOperation fileOperation;

    public RepositoryFile(FileOperation fileOperation) {
        this.fileOperation = fileOperation;
    }

    @Override
    public List<Note> getAllNotes() {
        List<String> lines = fileOperation.readAllLines();
        List<Note> notes = new ArrayList<>();
        for (String line : lines) {
            notes.add(mapper.map(line));
        }
        return notes;
    }

    @Override
    public String CreateNote(Note note) {

        List<Note> notes = getAllNotes();
        int max = 0;
        for (Note item : notes) {
            int id = Integer.parseInt(item.getId());
            if (max < id){
                max = id;
            }
        }
        int newId = max + 1;
        String id = String.format("%d", newId);
        note.setId(id);
        notes.add(note);
        List<String> lines = mapToString(notes);
        fileOperation.saveAllLines(lines);
        return id;
    }

    private List<String> mapToString(List<Note> notes) {
        List<String> lines = new ArrayList<>();
        for (Note item: notes) {
            lines.add(mapper.map(item));
        }
        return lines;
    }

    @Override
    public Note updateNote(Note note) {
        List<Note> notes = getAllNotes();
        for (Note currentNote: notes) {
            if (currentNote.getId().equals(note.getId())){
                currentNote.setHead(note.getHead());
                currentNote.setText(note.getText());
                currentNote.setDate(note.getDate());
            }
        }
        fileOperation.saveAllLines(mapToString(notes));
        return note;
    }

    @Override
    public void deleteNote(Note note) {
        List<Note> notes = getAllNotes();

        notes.removeIf(deleteNote -> (deleteNote.getId()).equals(note.getId()));
        fileOperation.saveAllLines(mapToString(notes));
    }
}