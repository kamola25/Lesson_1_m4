package com.kiro.lesson_1_m4.ui.fragment.note

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import androidx.recyclerview.widget.RecyclerView.ViewHolder
import com.kiro.lesson_1_m4.data.model.ModelNote
import com.kiro.lesson_1_m4.databinding.ItemNoteBinding

class AdapterNote(private val listener: SelectedListener) : RecyclerView.Adapter<AdapterNote.ViewHolderKiro>() {
    private var list = arrayListOf<ModelNote>()

    fun setList(list: ArrayList<ModelNote>){
        this.list = list
        notifyDataSetChanged()
    }
    fun addNote(list:ModelNote){
        this.list.add(list)
    }




    override
    fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolderKiro {
        return ViewHolderKiro(ItemNoteBinding.inflate(LayoutInflater.from(parent.context),parent,false))
    }

    override fun onBindViewHolder(holder: ViewHolderKiro, position: Int) {
        holder.bind(list[position])
        holder.binding.imageNote.setOnLongClickListener{
            holder.binding.imageNote.alpha=0.5f
            listener.select(list[position])
            true
        }
    }

    override fun getItemCount(): Int {
        return list.size
    }
    interface SelectedListener{
        fun select(selectImg: ModelNote)
    }
    inner class ViewHolderKiro(val binding:ItemNoteBinding): ViewHolder(binding.root) {
        fun bind(modelNote: ModelNote) {
            binding.dateNote.text = modelNote.date
            binding.descNote.text = modelNote.description
            binding.titleNote.text = modelNote.title

        }

    }
}