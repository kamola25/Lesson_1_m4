package com.kiro.lesson_1_m4.ui.fragment.addnote

import androidx.navigation.fragment.findNavController
import com.kiro.lesson_1_m4.base.BaseFragment
import com.kiro.lesson_1_m4.data.model.ModelNote
import com.kiro.lesson_1_m4.databinding.FragmentAddNoteBinding
import com.kiro.lesson_1_m4.ui.utils.App


class AddNoteFragment : BaseFragment<FragmentAddNoteBinding>(FragmentAddNoteBinding::inflate) {

    override fun setupUI() {

    }
    override fun setupObserver() {
        binding.send.setOnClickListener {
            val title = binding.title.text.toString()
            val des = binding.description.text.toString()
            App.db.getDao().addNote(
                ModelNote(
                    image = "",
                    title = title,
                    description = des,
                    date = "2023"
                )
            )
            findNavController().navigateUp()
        }
    }




}