package com.oceanbrasil.androidintrodezembro

import android.os.Bundle
import android.util.Log
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class ResultadoActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_resultado)

        val nomeRecebido = intent.getStringExtra("NOME_DIGITADO")

        val tvResultado = findViewById<TextView>(R.id.tvResultado)
        tvResultado.text = "O nome digitado foi $nomeRecebido"
    }

}