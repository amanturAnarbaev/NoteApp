package com.example.note.data.repository

import com.example.note.data.local.NoteDao
import com.example.note.data.mappers.toEntity
import com.example.note.data.mappers.toNote
import com.example.note.domain.model.Note
import com.example.note.domain.repository.NoteRepository
import com.example.note.domain.utils.ResultStatus
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.flow
import kotlinx.coroutines.flow.flowOn
import java.io.IOException

class NoteRepositoryImpl(
    private val noteDao: NoteDao
) : NoteRepository {
    override fun createNote(note: Note): Flow<ResultStatus<Unit>> = flow {
        emit(ResultStatus.Loading())
        try {
            val data = noteDao.createNote(note.toEntity())
            emit(ResultStatus.Succes(data))
        } catch (e: IOException) {
            emit(ResultStatus.Error(e.message.toString()))
        }
        noteDao.createNote(note.toEntity())
    }.flowOn(Dispatchers.IO)


    override fun getAllNotes(): List<Note> {
        return noteDao.getAllNotes().map { it.toNote() }
        //не понял что делать тут

    }

    override fun delete(note: Note): Flow<ResultStatus<Unit>> = flow {
        emit(ResultStatus.Loading())
        try {
            val delete = noteDao.deleteNote(note.toEntity())
            emit(ResultStatus.Succes(delete))
        } catch (e: IOException) {
            emit(ResultStatus.Error(e.message.toString()))
        }

    }


    override fun editNote(note: Note): Flow<ResultStatus<Unit>> = flow {
        emit(ResultStatus.Loading())
        try {
            val edit = noteDao.editNote(note.toEntity())
            emit(ResultStatus.Succes(edit))
        }catch (e:IOException){
            emit(ResultStatus.Error(e.message.toString()))
        }

    }

}