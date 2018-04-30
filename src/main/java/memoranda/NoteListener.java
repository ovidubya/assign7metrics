package main.java.memoranda;

import main.java.memoranda.interfaces.Note;

public interface NoteListener {
  void noteChange(Note note, boolean toSaveCurrentNote);
}
