package com.example.myapplication_20

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView

class DeveloperAdapter(private val developerNames:List<String>):RecyclerView.Adapter<DeveloperViewHoldeer>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): DeveloperViewHoldeer {
        val itemView = LayoutInflater.from(parent.context)
            .inflate(R.layout.developer_list_item,parent,false)
        return DeveloperViewHoldeer(itemView)
    }

    override fun onBindViewHolder(holder: DeveloperViewHoldeer, position: Int) {
        val name = developerNames[position]
        holder.bind(name)
    }

    override fun getItemCount(): Int {
        return developerNames.size
    }
}