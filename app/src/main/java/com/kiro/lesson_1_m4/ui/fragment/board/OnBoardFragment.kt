package com.kiro.lesson_1_m4.ui.fragment.board

import androidx.navigation.fragment.findNavController
import com.kiro.lesson_1_m4.R
import com.kiro.lesson_1_m4.base.BaseFragment
import com.kiro.lesson_1_m4.databinding.FragmentOnBoardBinding


class OnBoardFragment : BaseFragment<FragmentOnBoardBinding>(FragmentOnBoardBinding::inflate),BoardAdapter.ClickListener{
    private lateinit var adapter: BoardAdapter
    override fun setupUI() {
        adapter = BoardAdapter(this)
        binding.boardPager.adapter = adapter
    }

    override fun click() {
        findNavController().navigate(R.id.noteFragment)
    }


}