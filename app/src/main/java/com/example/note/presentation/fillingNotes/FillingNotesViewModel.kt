package com.example.note.presentation.fillingNotes

import com.example.note.data.base.BaseViewModel
import com.example.note.domain.model.Note
import com.example.note.domain.usecase.CreateNoteUseCase
import com.example.note.domain.usecase.EditNoteUseCase
import com.example.note.presentation.notes.UiState
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.asStateFlow
import javax.inject.Inject

@HiltViewModel
class FillingNotesViewModel @Inject constructor(
    private val editNoteUseCase: EditNoteUseCase,
    private val createNoteUseCase: CreateNoteUseCase
) : BaseViewModel() {
    private val _noteState = MutableStateFlow<UiState<List<Note>>>(UiState.Empty())
    val noteState = _noteState.asStateFlow()


    private val _editNoteState = MutableStateFlow<UiState<Unit>>(UiState.Empty())
    val editNoteStade = _editNoteState.asStateFlow()

    private val _createNoteState = MutableStateFlow<UiState<Unit>>(UiState.Empty())
    val createNoteState = _createNoteState.asStateFlow()

    fun create(title: String, desc: String) {
        if (title.isNotBlank() && title.isNotBlank()) {
            createNoteUseCase(
                Note(
                    title = title,
                    description = desc,
                    createdAt = System.currentTimeMillis()
                )
            ).collectFlow(_createNoteState)
        } else {
            _createNoteState.value = UiState.Error(msg = "fill the gaps")
        }

    }

//    fun edit(title: String, desc: String) {
//        editNoteUseCase(
//            Note(
//                title = title,
//                description = desc,
//                createdAt = System.currentTimeMillis()
//            )
//        ).collectFlow(_editNoteState)
//    }

}