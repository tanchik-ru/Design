package com.example.myapplication_20

import androidx.recyclerview.widget.RecyclerView
import android.view.View
import android.widget.TextView

class DeveloperViewHoldeer(itemView: View):RecyclerView.ViewHolder(itemView) {

     private val developersNameTextView:TextView =
     itemView.findViewById(R.id.developer_name_text_view)
    fun bind(name:String){
developersNameTextView.text=name
    }
}