package com.example.note.domain.usecase

import com.example.note.domain.model.Note
import com.example.note.domain.repository.NoteRepository
import javax.inject.Inject

class DeleteNoteUseCase@Inject constructor(private val noteRepository: NoteRepository) {
    fun deleteNote(note: Note) = noteRepository.delete(note)

}