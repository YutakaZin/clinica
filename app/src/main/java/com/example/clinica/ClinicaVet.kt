package com.example.clinica

import android.content.ContentValues
import android.content.Context
import android.database.sqlite.SQLiteDatabase
import android.database.sqlite.SQLiteOpenHelper
import android.util.Log
import java.lang.RuntimeException


class ClinicaVet(context: Context?) :
    SQLiteOpenHelper ( context, "CLINICA", null, 1 ) {

    init {
        Log.d("CLINICA", "ClinicaVet->init()")
    }

    override fun onCreate(clinica: SQLiteDatabase) {
        Log.d("CLINICA", "ClinicaVet->onCreate() = " + clinica.version.toString())
        clinica.execSQL(
            "CREATE TABLE tb_usuario ( " +
                    "us_codusu INTEGER PRIMARY KEY AUTOINCREMENT ," +
                    "us_nomusu TEXT ); "
        )
    }

    override fun onUpgrade(db: SQLiteDatabase, oldVersion: Int, newVersion: Int) {
        Log.d("CLINICA", "Clinica->onUpgrade() oldVersion:" + oldVersion.toString()+" newVersion:" + newVersion.toString() )
        //db.execSQL("DROP TABLE tb_usuario ") //

        try {
            val content = ContentValues()
            content.put("us_nomusu", "Usuário v:"+newVersion.toString() )
            var qtd = db.update("tb_usmuario", content, null, null )
            Log.d("CLINICA", "ClinicaVet->onUpgrade() alterados = $qtd")
        }
        catch ( e : RuntimeException ){
            Log.d("CLINICA", "ClinicaVet->onUpgrade() erro = "+e.message )
        }
    }

}
