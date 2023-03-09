package com.example.note.presentaion.notes

import androidx.fragment.app.viewModels
import com.example.note.data.base.BaseFragment
import com.example.note.databinding.FragmentNotesBinding

class NotesFragment : BaseFragment<NotesViewModel, FragmentNotesBinding>() {
    override val vm: NotesViewModel by viewModels()

    override val binding: FragmentNotesBinding = FragmentNotesBinding.inflate(layoutInflater)

    override fun setupRequest() {
        vm.noteState.collectState(onLoading = {

        }, onError =  {

        }, onSucces =  {

        })
    }

    override fun listener() {
        super.listener()
    }

    override fun initialise() {
        super.initialise()
    }

}