package com.example.myapplication

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import android.widget.Toast
import androidx.recyclerview.widget.RecyclerView

/**
 * Created by Abhishek Dubey on 08,November,2019
 */
class NameListAdapter : RecyclerView.Adapter<NameListAdapter.ViewHolder> {

    val list: ArrayList<String>;
    val context: Context

    constructor(context: Context, list: ArrayList<String>) : super() {
        this.context = context
        this.list = list;
    }


    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val inflate_layout =
            LayoutInflater.from(parent.context).inflate(R.layout.recycler_view_item, parent, false);
        return ViewHolder(inflate_layout);
    }

    override fun getItemCount(): Int {
        return list.size
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        holder.txt_name.text = list[position]
        holder.txt_name.setOnClickListener({
            Toast.makeText(context, list[position], Toast.LENGTH_SHORT).show()
        })
    }

    public class ViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        val txt_name = itemView.findViewById(R.id.txt_name) as TextView;
    }
}