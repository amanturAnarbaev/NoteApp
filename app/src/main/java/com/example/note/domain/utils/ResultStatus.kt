package com.example.note.domain.utils

sealed class ResultStatus<T>(
    val data: T?=null,
    val error: String?=null
) {
    class Succes<T>( data: T?) : ResultStatus<T>(data=data,null)
    class Loading<T>():ResultStatus<T>()
    class Error<T>(msg:String):ResultStatus<T>(error = msg)
}

