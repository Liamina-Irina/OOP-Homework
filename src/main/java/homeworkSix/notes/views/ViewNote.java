package homeworkSix.notes.views;

import homeworkSix.notes.controllers.NoteController;
import homeworkSix.notes.model.Note;
import homeworkSix.notes.views.validator.DateValidator;

import java.util.Scanner;
import java.util.List;

public class ViewNote {

    private NoteController noteController;

    public ViewNote(NoteController noteController) {
        this.noteController = noteController;
    }

    public void run(){
        Commands com = Commands.NONE;

        while (true) {
            System.out.println();
            String command = prompt("Введите команду: ");
            try {
                com = Commands.valueOf(command.toUpperCase());
                if (com == Commands.EXIT) return;
                switch (com) {
                    case CREATE:
                        createNote();
                        break;
                    case READ:
                        readNote();
                        break;
                    case LIST:
                        readList();
                        break;
                    case UPDATE:
                        updateNote();
                        break;
                    case DELETE:
                        deleteNote();
                        break;
                }
            } catch (Exception e) {
                System.out.println(e.getMessage());
            }
        }
    }

    private void deleteNote() throws Exception {

        Note note = getNote();
        noteController.deleteNote(note);
    }

    private void updateNote() throws Exception {
        readList();
        Note note = getNote();
        Note updatedNote = getNewNote();
        updatedNote.setId(note.getId());
        Note savedNote = noteController.updateNote(updatedNote);
        System.out.println(savedNote);
    }

    private void readList() {
        List<Note> listNotes = noteController.readAllNotes();
        for (Note note : listNotes) {
            System.out.println(note);
        }
    }

    private void readNote() throws Exception {
        Note note = getNote();
        System.out.println(note);
    }

    private homeworkSix.notes.model.Note getNote() throws Exception {
        String id = prompt("ID записки: ");
        Note note = noteController.readNote(id);
        return note;
    }

    private void createNote() throws Exception{
        Note note = getNewNote();
        noteController.saveNote(note);
    }

    private Note getNewNote() throws Exception{
        String head = prompt("Заголовок: ");
        //new NameAndSurnameValidator(firstName).validate();
        String text = prompt("Текст: ");
        //new NameAndSurnameValidator(lastName).validate();
        String date = prompt("Дата: ");
        new DateValidator(date).validate();
        Note note = new Note(head, text, date);
        return note;
    }

    private String prompt(String message) {
        Scanner in = new Scanner(System.in);
        System.out.print(message);
        return in.nextLine();
    }
}