package com.teamblue.projectbloove

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ArrayAdapter
import kotlinx.android.synthetic.main.item_2.view.*
import kotlinx.android.synthetic.main.activity_main.view.imageView

class HospitalAdapter(private val mContext: Context, private val listas: List<lista2>) : ArrayAdapter<lista2>(mContext, 0, listas){
    override fun getView(position: Int, convertView: View?, parent: ViewGroup): View {
        val layout= LayoutInflater.from(mContext).inflate(R.layout.item_2, parent, false)

        val lista2 = listas[position]

        layout.nombre.text =  lista2.nombre
        layout.imageViewH.setImageResource(lista2.imagen)
        return layout
    }
}