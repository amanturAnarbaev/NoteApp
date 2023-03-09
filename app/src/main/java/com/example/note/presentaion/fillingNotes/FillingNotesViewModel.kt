package com.example.note.presentaion.fillingNotes

import com.example.note.data.base.BaseViewModel
import com.example.note.domain.model.Note
import com.example.note.domain.usecase.CreateNoteUseCase
import com.example.note.domain.usecase.DeleteNoteUseCase
import com.example.note.domain.usecase.EditNoteUseCase
import com.example.note.domain.usecase.GetAllNoteUseCase
import com.example.note.presentaion.notes.UiState
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.asStateFlow
import javax.inject.Inject

@HiltViewModel
class FillingNotesViewModel @Inject constructor(
    private val getAllNoteUseCase: GetAllNoteUseCase,
    private val deleteNoteUseCase: DeleteNoteUseCase,
    private val editNoteUseCase: EditNoteUseCase,
    private val createNoteUseCase: CreateNoteUseCase
) : BaseViewModel() {
    private val _noteState = MutableStateFlow<UiState<List<Note>>>(UiState.Empty())
    val noteState = _noteState.asStateFlow()

    private val _deleteNoteState = MutableStateFlow<UiState<Unit>>(UiState.Empty())
    val deleteNoteState = _deleteNoteState.asStateFlow()

    private val _editNoteState = MutableStateFlow<UiState<Unit>>(UiState.Empty())
    val editNoteStade = _editNoteState.asStateFlow()

    private val _createNoteState = MutableStateFlow<UiState<Unit>>(UiState.Empty())
    val createNoteState = _createNoteState.asStateFlow()

    fun getAllNotes() {
        getAllNoteUseCase().collectFlow(_noteState)
    }

    fun delete(note: Note) {
        deleteNoteUseCase(note).collectFlow(_deleteNoteState)
    }

    fun editNotes(note: Note) {
        editNoteUseCase(note).collectFlow(_editNoteState)
    }

    fun createNotes(note: Note) {
        createNoteUseCase(note).collectFlow(_createNoteState)
    }


}