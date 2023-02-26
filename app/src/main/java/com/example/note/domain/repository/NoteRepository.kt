package com.example.note.domain.repository

import com.example.note.domain.model.Note

interface NoteRepository {
    fun createNote(note: Note)

    fun delete(note: Note)

    fun getAllNotes(): List<Note>

    fun editNote(note: Note)

}