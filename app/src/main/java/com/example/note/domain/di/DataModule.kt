package com.example.note.domain.di

import com.example.note.domain.model.Note
import com.example.note.domain.repository.NoteRepository
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent

@Module
@InstallIn(SingletonComponent::class)
object DataModule {
//    @Provides
//    fun createNoteUseCase(noteRepository: NoteRepository, note: Note) =
//        noteRepository.createNote(note = note)
}



