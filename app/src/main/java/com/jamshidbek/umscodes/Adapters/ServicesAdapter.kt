package com.jamshidbek.umscodes.Adapters

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.recyclerview.widget.RecyclerView
import com.jamshidbek.umscodes.Models.ServicesModel
import com.jamshidbek.umscodes.R
import kotlinx.android.synthetic.main.minutes_item.view.*
import kotlinx.android.synthetic.main.services_layout.view.*

class ServicesAdapter(var context: Context, var list: ArrayList<ServicesModel>, var itemClick: ItemClick) : RecyclerView.Adapter<ServicesAdapter.MyViewHolder>() {

    inner class MyViewHolder(var itemView4: View) : RecyclerView.ViewHolder(itemView4) {
        fun onBind(model: ServicesModel, position: Int) {
            itemView4.services_name.text = list[position].name
            itemView4.services_code.text = list[position].code

            itemView.setOnClickListener {
                itemClick.onClick(list, position)
            }
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MyViewHolder {
        return MyViewHolder(
            LayoutInflater.from(parent.context).inflate(R.layout.services_layout, parent, false)
        )
    }

    override fun onBindViewHolder(holder: MyViewHolder, position: Int) {
        holder.onBind(list[position], position)
    }

    override fun getItemCount(): Int {
        return list.size
    }
}


interface ItemClick{
    fun onClick(list: ArrayList<ServicesModel>, position: Int)
}