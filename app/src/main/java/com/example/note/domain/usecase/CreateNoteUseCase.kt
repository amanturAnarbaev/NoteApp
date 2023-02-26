package com.example.note.domain.usecase

import com.example.note.domain.model.Note
import com.example.note.domain.repository.NoteRepository

class CreateNoteUseCase(private val noteRepository: NoteRepository) {
    fun createNote(note: Note) = noteRepository.createNote(note)

}