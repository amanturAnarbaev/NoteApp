package com.example.note.presentaion.notes

sealed class UiState<T> {
    class Loading<T> : UiState<T>()
    class Succes<T>(val data: T?) : UiState<T>()
    class Error<T>(val msg: String) : UiState<T>()
    class Empty<T> : UiState<T>()

}