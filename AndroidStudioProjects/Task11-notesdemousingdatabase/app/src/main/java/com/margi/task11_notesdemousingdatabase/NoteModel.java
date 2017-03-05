package com.margi.task11_notesdemousingdatabase;

/**
 * Created by Margi on 05-Mar-17.
 */
public class NoteModel
{
    String noteTitle;
String noteMessage;
        String date;
        String time;

public String getNoteTitle() {
        return noteTitle;
        }

public void setNoteTitle(String noteTitle) {
        this.noteTitle = noteTitle;
        }

public String getNoteMessage() {
        return noteMessage;
        }

public void setNoteMessage(String noteMessage) {
        this.noteMessage = noteMessage;
        }

public String getDate() {
        return date;
        }

public void setDate(String date) {
        this.date = date;
        }

public String getTime() {
        return time;
        }

public void setTime(String time) {
        this.time = time;
        }
}
