package com.example.viewbindinginrecview

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import androidx.recyclerview.widget.RecyclerView.Recycler
import com.example.viewbindinginrecview.databinding.RecyclerviewItemBinding

class Mainadapter(val taskList:List<task>):RecyclerView.Adapter<Mainadapter.MainViewHolder>()
{
    inner class MainViewHolder(val itemBinding:RecyclerviewItemBinding)
        :RecyclerView.ViewHolder(itemBinding.root)
    {
            fun bindItem( task: task)
            {
                itemBinding.tv1.text=task.title
                itemBinding.tv2.text=task.timestamp
            }
        }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MainViewHolder {
        return MainViewHolder(RecyclerviewItemBinding.inflate(LayoutInflater.from(parent.context),parent,false))
    }

    override fun getItemCount(): Int {
        return taskList.size
    }

    override fun onBindViewHolder(holder: MainViewHolder, position: Int)
    {
        val task= taskList[position]
        holder.bindItem(task)
    }
    //inhereting from recyclerview.viewholder
}