package com.oceanbrasil.androidintrodezembro

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class FormularioActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_formulario)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }

        val btSalvarForm = findViewById<Button>(R.id.btSalvarForm)
        val etNome = findViewById<EditText>(R.id.etNome)
        val novaTelaIntent = Intent(this, ResultadoActivity::class.java)
        btSalvarForm.setOnClickListener {
            val nomeDigitado = etNome.text.toString()
            if (nomeDigitado.isBlank()) {
                Toast.makeText(applicationContext,
                    "Você precisa digitar um nome"
                    , Toast.LENGTH_LONG).show()
                etNome.error = "Nome obrigatório"
            } else {
                Toast.makeText(applicationContext,
                    nomeDigitado, Toast.LENGTH_LONG).show()
                startActivity(novaTelaIntent)
            }

        }

    }
}