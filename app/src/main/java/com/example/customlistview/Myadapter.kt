package com.example.customlistview

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ArrayAdapter
import android.widget.ImageView
import android.widget.TextView

class Myadapter(var mctx:Context, var resources:Int, var mitem:List<Model>) :ArrayAdapter<Model>(mctx,resources,mitem){

    override fun getView(position: Int, convertView: View?, parent: ViewGroup): View {
        val layoutinflater:LayoutInflater= LayoutInflater.from(mctx)
        val view:View=layoutinflater.inflate(resources,null)

        val imageview:ImageView=view.findViewById(R.id.imageView)
        val titleTextview:TextView=view.findViewById(R.id.txtmain)
        val descriptionTextview:TextView=view.findViewById(R.id.txtsub)

        var mItem:Model=mitem[position]
        imageview.setImageDrawable(mctx.resources.getDrawable(mItem.img))
        titleTextview.text=mItem.title
        descriptionTextview.text=mItem.description


        return view


    }
}