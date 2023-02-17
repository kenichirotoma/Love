package com.miconos.love

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.BaseAdapter
import android.widget.TextView

class AppListAdapter (
    private val context: Context,
    private val appList: List<AppList>,
    private val resource: Int
    ) : BaseAdapter() {
        private val inflater = context.getSystemService(Context.LAYOUT_INFLATER_SERVICE)
                as LayoutInflater


        override fun getCount(): Int {
            return appList.size
        }

        override fun getItem(position: Int): AppList {
            return appList[position]
        }

        override fun getItemId(position: Int): Long {
            return appList[position].id
        }

        override fun getView(position: Int, convertView: View?, parent: ViewGroup): View {
            val item = getItem(position)
            val sview = convertView ?: inflater.inflate(resource,null)
            // sview.findViewById<ImageView>(R.id.Pics).setImageIcon() = item.Pics
            sview.findViewById<TextView>(R.id.appName).text = item.appName
            sview.findViewById<TextView>(R.id.appTxt).text = item.appTxt
            return sview
        }


}