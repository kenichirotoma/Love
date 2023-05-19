package com.miconos.love

import android.view.View
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class ViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
    val NickName = itemView.findViewById<TextView>(R.id.NickName)
    val Gender = itemView.findViewById<TextView>(R.id.YourGender)
    val Age = itemView.findViewById<TextView>(R.id.Age)
    val Address = itemView.findViewById<TextView>(R.id.Address)
}