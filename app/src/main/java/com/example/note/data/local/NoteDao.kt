package com.example.note.data.local

import androidx.room.*

@Dao
interface NoteDao {

    //CRUD

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    fun createNote(noteEntity: NoteEntity)

    @Delete
    fun deleteNote(noteEntity: NoteEntity)

    @Query("SELECT * FROM notes ")
    fun getAllNotes(): List<NoteEntity>

    @Update
    fun editNote(noteEntity: NoteEntity)
}