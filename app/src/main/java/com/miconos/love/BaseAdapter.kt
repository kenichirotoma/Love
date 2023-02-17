/*
 * Copyright (c) 2023. Lorem ipsum dolor sit amet, consectetur adipiscing elit.
 * Morbi non lorem porttitor neque feugiat blandit. Ut vitae ipsum eget quam lacinia accumsan.
 * Etiam sed turpis ac ipsum condimentum fringilla. Maecenas magna.
 * Proin dapibus sapien vel ante. Aliquam erat volutpat. Pellentesque sagittis ligula eget metus.
 * Vestibulum commodo. Ut rhoncus gravida arcu.
 */

package com.miconos.love

import android.R
import android.content.Context
import android.graphics.Bitmap
import android.graphics.BitmapFactory
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.BaseAdapter
import android.widget.ImageView
import android.widget.TextView

//
//class BaseAdapter internal constructor(
//    context : Context , itemLayoutId : Int ,
//    names : Array<String> , emails : Array<String> , photos : IntArray
//) : BaseAdapter() {
//    private val inflater : LayoutInflater
//    private val layoutID : Int
//    private val namelist : Array<String>
//    private val emaillist : Array<String>
//    private val photolist : Array<Bitmap?>
//
//    internal class ViewHolder {
//        var text : TextView? = null
//        var email : TextView? = null
//        var img : ImageView? = null
//    }
//
//    override fun getView(position : Int , convertView : View? , parent : ViewGroup?) : View? {
//        var convertView : View? = convertView
//        val holder : ViewHolder
//        if (convertView == null) {
//            convertView = inflater.inflate(layoutID , null)
//            holder = ViewHolder()
//            holder.img = convertView.findViewById(R.id.img_item)
//            holder.text = convertView.findViewById(R.id.text_view)
//            holder.email = convertView.findViewById(R.id.text_mail)
//            convertView.setTag(holder)
//        } else {
//            holder = convertView.getTag() as ViewHolder
//        }
//        holder.img?.setImageBitmap(photolist[position])
//        val str = """
//               Staff ID.170900${position + 1}
//
//               Email: ${emaillist[position]}
//               Tel: 020-8931-9933 #340${position + 1}
//               """.trimIndent()
//        holder.email!!.text = str
//        holder.text!!.text = namelist[position]
//        return convertView
//    }
//
//    override fun getCount() : Int {
//        return namelist.size
//    }
//
//    override fun getItem(position : Int) : Any {
//        return position
//    }
//
//    override fun getItemId(position : Int) : Long {
//        return position.toLong()
//    }
//
//    init {
//        inflater = LayoutInflater.from(context)
//        layoutID = itemLayoutId
//        namelist = names
//        emaillist = emails
//        // bitmapの配列
//        photolist = arrayOfNulls(photos.size)
//        // drawableのIDからbitmapに変換
//        for (i in photos.indices) {
//            photolist[i] = BitmapFactory.decodeResource(context.getResources() , photos[i])
//        }
//    }
//}