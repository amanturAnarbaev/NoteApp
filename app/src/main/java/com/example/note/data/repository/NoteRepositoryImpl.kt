package com.example.note.data.repository

import com.example.note.data.local.NoteDao
import com.example.note.data.mappers.toEntity
import com.example.note.data.mappers.toNote
import com.example.note.domain.model.Note
import com.example.note.domain.repository.NoteRepository

class NoteRepositoryImpl(
    private val noteDao: NoteDao
) : NoteRepository {
    override fun createNote(note: Note) {
        noteDao.createNote(note.toEntity())
    }

    override fun delete(note: Note) {
        noteDao.deleteNote(note.toEntity())
    }

    override fun getAllNotes(): List<Note> {
        return noteDao.getAllNotes().map { it.toNote() }

    }

    override fun editNote(note: Note) {
        noteDao.editNote(note.toEntity())

    }

}