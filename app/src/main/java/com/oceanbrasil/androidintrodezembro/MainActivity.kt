package com.oceanbrasil.androidintrodezembro

import android.os.Bundle
import android.util.Log
import android.widget.Button
import android.widget.EditText
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val buttonSalvar = findViewById<Button>(R.id.buttonSalvar)
        val nomeDigitado = findViewById<EditText>(R.id.editNome)
        buttonSalvar.setOnClickListener {
            Log.d("OCEAN", "Clicou no botao!!!")
            Toast.makeText(applicationContext,
                nomeDigitado.text.toString(), Toast.LENGTH_LONG).show()
        }
    }
}