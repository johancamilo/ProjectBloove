package com.teamblue.projectbloove

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_tipo_ab_negativo.*

class Tipo_ab_negativo : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_tipo_ab_negativo)

        back_button.setOnClickListener {
            val intent: Intent = Intent(this, Tipos_RH::class.java)
            startActivity(intent)
        }
    }
}