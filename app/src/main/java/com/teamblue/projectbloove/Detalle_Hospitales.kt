package com.teamblue.projectbloove

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_detalle__hospitales.*
import kotlinx.android.synthetic.main.activity_detalle__hospitales.textView16
import kotlinx.android.synthetic.main.activity_hospitales_view.*

class Detalle_Hospitales : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_detalle__hospitales)


        val listas = intent.getSerializableExtra("listas") as lista2

        textView16.text = listas.nombre
        nombre.text = listas.nombre
        telefono.text = listas.telefono
        direccion.text = listas.direccion
        horario.text = listas.H_Atencion


        imagen.setImageResource(listas.imagen)

        back_button2.setOnClickListener {
            val intent: Intent = Intent(this, Hospitales_view::class.java)
            startActivity(intent)
        }

    }
}