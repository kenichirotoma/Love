package com.miconos.love

import android.view.View
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class MyViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
    val NickName = itemView.findViewById<TextView>(R.id.NickName)
    val Age = itemView.findViewById<TextView>(R.id.Age)
    val Address = itemView.findViewById<TextView>(R.id.Address)
    val Date = itemView.findViewById<TextView>(R.id.YourAge)
    val Time = itemView.findViewById<TextView>(R.id.YourAddress)
    val Profile = itemView.findViewById<TextView>(R.id.Profile)
}