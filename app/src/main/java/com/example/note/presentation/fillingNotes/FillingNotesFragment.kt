package com.example.note.presentation.fillingNotes

import androidx.core.view.isVisible
import androidx.lifecycle.ViewModelProvider
import androidx.navigation.fragment.findNavController
import by.kirich1409.viewbindingdelegate.viewBinding
import com.example.note.R
import com.example.note.data.base.BaseFragment
import com.example.note.databinding.FragmentFillingNotesBinding
import com.example.note.presentation.extencion.showToast
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class FillingNotesFragment :
    BaseFragment<FillingNotesViewModel, FragmentFillingNotesBinding>(R.layout.fragment_filling_notes) {

    override val vm: FillingNotesViewModel by lazy {
        ViewModelProvider(requireActivity())[FillingNotesViewModel::class.java]
    }

    override val binding: FragmentFillingNotesBinding by viewBinding(FragmentFillingNotesBinding::bind)

    override fun listener() {
        with(binding) {
            btn.setOnClickListener {
                vm.create(
                    titleET.text.toString(),
                    descriptionET.text.toString()
                )

            }
//            btn.setOnLongClickListener {
//                vm.de
//                false
//            }

        }
    }



    override fun setupRequest() {
        vm.createNoteState.collectState(
            onLoading = {
                binding.progressBar.isVisible = true
            },
            onError = {
                binding.progressBar.isVisible = false
                showToast(it)
            },
            onSucces = {
                binding.progressBar.isVisible = false
                showToast(getString(R.string.note_is_created))
                findNavController().navigate(R.id.action_fillingNotesFragment_to_notesFragment)
            }
        )
//        vm.editNoteStade.collectState(
//            onLoading = {
//                binding.progressBar.isVisible = true
//            },
//            onError = {
//                binding.progressBar.isVisible = false
//                showToast(it)
//            },
//            onSucces = {
//                binding.progressBar.isVisible = false
//                showToast(getString(R.string.note_is_created))
//                findNavController().navigate(R.id.action_fillingNotesFragment_to_notesFragment)
//            }
//        )
    }


}