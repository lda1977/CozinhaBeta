package com.ptz.cozinhabeta

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MainActivitySistema : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main_sistema)



        // Button Inserir
        ///////////////////
        val AcessarSistemaInserirbolihas = findViewById<Button>(R.id.btnBolinhas) as Button

        AcessarSistemaInserirbolihas.setOnClickListener {
            val bolinhasintent = Intent(this, MainActivitySistemaBolinhas::class.java).apply {
            }
            startActivity(bolinhasintent)
        }



        // Button Pessagem
        ///////////////////
        val Pessagem = findViewById<Button>(R.id.btnPessagem) as Button

        Pessagem.setOnClickListener {
            val AcessarPessagem = Intent(this, MainActivitySistemaPessagem::class.java).apply {
            }
            startActivity(AcessarPessagem)
        }


        // Button Escala Horário
        ///////////////////
        val EscalaHorario = findViewById<Button>(R.id.btnEscala) as Button

        EscalaHorario.setOnClickListener {
            val escalaintent = Intent(this, MainActivitySistemaEscala::class.java).apply {
            }
            startActivity(escalaintent)
        }

    }

}