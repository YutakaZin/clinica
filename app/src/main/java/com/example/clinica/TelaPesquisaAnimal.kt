package com.example.clinica

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class TelaPesquisaAnimal : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_tela_pesquisa_animal)

        val btnAddAnimal: Button = findViewById(R.id.btnAddAnimal)
        btnAddAnimal.setOnClickListener {
            val intent = Intent(this, TelaNovoAnimal::class.java)
            startActivity(intent)
        }
    }
}