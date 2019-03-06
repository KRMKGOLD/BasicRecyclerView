package com.example.recyclerviewtesting

import android.content.Context
import android.support.v7.widget.RecyclerView
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView

class MainAdapter(val context: Context, val textList : ArrayList<ListData>) : RecyclerView.Adapter<MainAdapter.MainHolder>() {
    override fun onCreateViewHolder(parent: ViewGroup, viewType : Int): MainHolder {
        val view = LayoutInflater.from(context).inflate(R.layout.recycler_row, parent, false)
        return MainHolder(view)
    }

    override fun getItemCount(): Int = textList.size

    override fun onBindViewHolder(holder: MainHolder, position: Int) {
        holder.bind(textList[position])
    }

    inner class MainHolder(itemView : View) : RecyclerView.ViewHolder(itemView) {
        val tvTitle = itemView.findViewById<TextView>(R.id.tvtitle)
        val tvContent = itemView.findViewById<TextView>(R.id.tvcontent)
        val tvNmae = itemView.findViewById<TextView>(R.id.tvname)

        fun bind(toBindList : ListData){
            tvTitle.text = toBindList.title
            tvContent.text = toBindList.content
            tvNmae.text = toBindList.name
        }
    }
}