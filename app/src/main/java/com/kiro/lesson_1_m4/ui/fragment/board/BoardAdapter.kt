package com.kiro.lesson_1_m4.ui.fragment.board

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.core.view.isGone
import androidx.core.view.isVisible
import androidx.recyclerview.widget.RecyclerView.Adapter
import androidx.recyclerview.widget.RecyclerView.ViewHolder
import com.kiro.lesson_1_m4.R
import com.kiro.lesson_1_m4.databinding.PageBoardBinding

class BoardAdapter(private val listener: ClickListener): Adapter<BoardAdapter.BordViewHolder>() {


    private var listImg =
        arrayListOf(R.drawable.imga_notes, R.drawable.img_notes,R.drawable.img)
    private var listTitle =
        arrayListOf("Добро пожаловать в Notes!","Notes","Notes не предназначен для использования")
    private var listDesc =
    arrayListOf("Notes включает в себя \nвсе возможные и невозможные функции" +
            " \n обычных заметок! \n Он также редактирует ваши заметки.","Облегчит вам жизнь в сохранении \n" +
            "какой-то информации, кода или личных данных.", "В корыстных целях или продажи. \nПользуйтесь с умом!")


    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int)=BordViewHolder(
        PageBoardBinding.inflate(LayoutInflater.from(parent.context),parent,false)
    )

    override fun onBindViewHolder(holder: BordViewHolder, position: Int) {
        holder.bind(position)

        holder.binding.boardBtnStart.setOnClickListener{
            listener.click()

        }
    }

    override fun getItemCount() = listImg.size


    inner class BordViewHolder(val binding: PageBoardBinding):ViewHolder(binding.root) {
        fun bind(i: Int) {
            binding.boardImg.setImageResource(listImg[i])
            binding.boardTvTitle.text = listTitle[i]
            binding.boardTvDesc.text = listDesc[i]
            if (i == listImg.size - 2) {
                binding.boardBtnStart.isVisible = true
            } else {
                binding.boardBtnStart.isGone = true
            }
        }

    }
    interface ClickListener{
        fun click()
    }
}