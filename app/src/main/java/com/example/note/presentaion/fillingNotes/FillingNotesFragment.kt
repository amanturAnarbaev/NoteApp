package com.example.note.presentaion.fillingNotes

import androidx.fragment.app.viewModels
import com.example.note.data.base.BaseFragment
import com.example.note.databinding.FragmentFillingNotesBinding

class FillingNotesFragment : BaseFragment<FillingNotesViewModel, FragmentFillingNotesBinding>() {
    override val vm: FillingNotesViewModel by viewModels()
    override val binding: FragmentFillingNotesBinding =
        FragmentFillingNotesBinding.inflate(layoutInflater)

    override fun setupRequest() {
        vm.noteState.collectState(onLoading = {

        }, onError = {

        }, onSucces = {

        })
    }


}