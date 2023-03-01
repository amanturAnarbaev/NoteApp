package com.example.note.domain.usecase

import com.example.note.domain.model.Note
import com.example.note.domain.repository.NoteRepository
import javax.inject.Inject

class GetAllNoteUseCase@Inject constructor(private val noteRepository: NoteRepository) {
    fun getAllNotes() = noteRepository.getAllNotes()

}