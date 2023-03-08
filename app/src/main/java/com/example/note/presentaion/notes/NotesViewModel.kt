package com.example.note.presentaion.notes

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.note.domain.model.Note
import com.example.note.domain.usecase.GetAllNoteUseCase
import com.example.note.domain.utils.ResultStatus
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.asStateFlow
import kotlinx.coroutines.launch
import javax.inject.Inject

@HiltViewModel
class NotesViewModel @Inject constructor(
    private val getAllNoteUseCase: GetAllNoteUseCase,
) : ViewModel() {
    private val _noteState = MutableStateFlow<UiState<List<Note>>>(UiState.Empty())
    val noteState = _noteState.asStateFlow()

    fun getAllNotes() {
        viewModelScope.launch {
            getAllNoteUseCase.getAllNotes().collect {
                when (it) {
                    is ResultStatus.Error -> {
                        _noteState.value = UiState.Error(it.error)
                    }
                    is ResultStatus.Loading -> {
                        _noteState.value = UiState.Loading()
                    }
                    is ResultStatus.Succes -> {
                        if (it.data != null)
                            _noteState.value = UiState.Succes(it.data)

                    }
                }
            }
        }
    }

}