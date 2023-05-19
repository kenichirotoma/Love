package com.miconos.love

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.BaseAdapter
import android.widget.TextView

class MyListAdapter(
    private val context: Context,
    private val dataList: List<ListItem>,
    private val resource: Int

) : BaseAdapter() {
    private val inflater = context.getSystemService(Context.LAYOUT_INFLATER_SERVICE)
            as LayoutInflater

    override fun getCount(): Int {
        return dataList.size
    }

    override fun getItem(position: Int): ListItem {
        return dataList[position]
    }

    override fun getItemId(position: Int): Long {
        return dataList[position].id
    }

    override fun getView(position: Int, convertView: View?, parent: ViewGroup): View {
        val item = getItem(position)
        val sview = convertView ?: inflater.inflate(resource,null)
        // sview.findViewById<ImageView>(R.id.Pics).setImageIcon() = item.Pics
        sview.findViewById<TextView>(R.id.NickName).text = item.NickName
        sview.findViewById<TextView>(R.id.YourAge).text = item.Age
        sview.findViewById<TextView>(R.id.YourAddress).text = item.Address
        sview.findViewById<TextView>(R.id.Profile).text = item.Profile
        // sview.findViewById<ImageView>(R.id.Popup).setImageIcon()= item.Popup
        return sview
    }
}