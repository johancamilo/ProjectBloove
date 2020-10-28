package com.teamblue.projectbloove

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_detalle__hospitales.*
import kotlinx.android.synthetic.main.activity_hospitales_view.*
import kotlinx.android.synthetic.main.activity_hospitales_view.back_button


class Hospitales_view : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_hospitales_view)

        val re1 = lista2("Hospital Kennedy","3345345","kra 78 bis #66","luneas a viernes 7 a 5 p.m", R.drawable.hk)
        val re2 = lista2("Hospital Meredi", "3345345","kra 78 bis #66","luneas a viernes 7 a 5 p.m",R.drawable.hm)
        val re3 = lista2("Hospital Oriente","3345345","kra 78 bis #66","luneas a viernes 7 a 5 p.m", R.drawable.ho)
        val re4 = lista2("Hospital Tunal","3345345","kra 78 bis #66","luneas a viernes 7 a 5 p.m", R.drawable.ht)

        val listas = listOf(re1, re2, re3, re4)
        val adapter =  HospitalAdapter(this, listas)

        listImage.adapter = adapter



        listImage.setOnItemClickListener { parent, view, position, id ->
            val intent = Intent(this, Detalle_Hospitales::class.java)
            intent.putExtra("listas", listas[position])
            startActivity(intent)
        }


        back_button.setOnClickListener {
            val intent: Intent = Intent(this, MainActivity::class.java)
            startActivity(intent)
        }

    }
}
