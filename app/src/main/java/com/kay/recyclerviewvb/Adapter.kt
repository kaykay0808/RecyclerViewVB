package com.kay.recyclerviewvb

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.kay.recyclerviewvb.databinding.RecyclerviewItemBinding
import com.kay.recyclerviewvb.datasource.TaskModel

class MainAdapter(private val taskList: List<TaskModel>) :
    RecyclerView.Adapter<MainAdapter.MainViewHolder>() {
    class MainViewHolder(private val binding: RecyclerviewItemBinding) :
        RecyclerView.ViewHolder(binding.root) {
        fun bindItem(task: TaskModel) {
            binding.titleTv.text = task.title
            binding.timeTv.text = task.timeStamp
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MainViewHolder {
        return MainViewHolder(
            RecyclerviewItemBinding.inflate(
                LayoutInflater.from(parent.context),
                parent,
                false
            )
        )
    }

    override fun onBindViewHolder(holder: MainViewHolder, position: Int) {
        val task = taskList[position]
        holder.bindItem(task)
    }

    override fun getItemCount(): Int {
        return taskList.size
    }
}
