package com.example.clinica

import android.database.sqlite.SQLiteDatabase
import android.util.Log

class ModeloDao
{
    companion object {
        const val TABELA  = "tb_usuario"
        const val CODSEQ  = "us_codseq"
        const val NOMUSU  = "us_nomusu"
    }

    private lateinit var sqlOpen: SQLiteDatabase
    private var banco: ClinicaVet

    init {
        Log.d("Fey", "DB->init()")
    }

    constructor( db: ClinicaVet ){
        banco = db
    }

    fun ler( /*parametros...*/ ){
        sqlOpen = banco.writableDatabase // Para Escrever
    }


}
