package com.example.myapplication

import android.view.View
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.recyclerview.R

class  Holder(itemView: View) : RecyclerView.ViewHolder(itemView) {

    private val tvNomeVersao : TextView

    init {
        tvNomeVersao = itemView.findViewById(R.id.tvItemTexto)
    }

    fun configurar(nomeVersao : String){
        tvNomeVersao.text = nomeVersao
        }

}