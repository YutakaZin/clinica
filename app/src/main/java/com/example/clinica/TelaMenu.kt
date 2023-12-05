package com.example.clinica

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class TelaMenu : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_tela_menu)

        val btCliente: Button = findViewById(R.id.btCliente)
        val btAnimais: Button = findViewById(R.id.btAnimais)
        val btVacina: Button = findViewById(R.id.btVacina)

        btCliente.setOnClickListener {
            val intent = Intent(this, TelaNovoCliente::class.java)
            startActivity(intent)
        }

        btAnimais.setOnClickListener {
            val intent = Intent(this, TelaNovoAnimal::class.java)
            startActivity(intent)
        }

        btVacina.setOnClickListener {
            val intent = Intent(this, TelaNovaVacina::class.java)
            startActivity(intent)
        }
    }
}