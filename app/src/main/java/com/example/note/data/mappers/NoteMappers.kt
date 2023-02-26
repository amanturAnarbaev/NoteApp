package com.example.note.data.mappers

import com.example.note.data.local.NoteEntity
import com.example.note.domain.model.Note

fun Note.toEntity() = NoteEntity(
    id, title, description, createdAt
)

fun NoteEntity.toNote() = Note(
    id, title, description, createdAt
)