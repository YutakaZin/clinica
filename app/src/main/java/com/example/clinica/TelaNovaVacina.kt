package com.example.clinica

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView
import android.widget.Toolbar

class TelaNovaVacina : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_tela_nova_vacina)

        val toolbar: Toolbar = findViewById(R.id.toolbar)
        setSupportActionBar(toolbar)

        // Configurar o botão de voltar na Toolbar
        val btnBack: ImageView = findViewById(R.id.btn_back)
        btnBack.setOnClickListener { onBackPressed() }
    }

    private fun setSupportActionBar(toolbar: Toolbar) {

    }
}