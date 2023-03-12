package com.example.myapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import Modelo.JANKEPO
import com.google.android.material.snackbar.Snackbar

class MainActivity : AppCompatActivity(){
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val btnR = findViewById<Button>(R.id.btn_Res)
        val txt_Elec1 = findViewById<TextView>(R.id.txt_Rp1)
        val txt_Elec2 = findViewById<TextView>(R.id.txt_Rp2)
        btnR.setOnClickListener {
            var player1 = JANKEPO()
            var player2 = JANKEPO()
            txt_Elec1.text = "JUGADOR 1:\n"+ player1.equival
            txt_Elec2.text = "JUGADOR 2:\n"+player2.equival
            Snackbar.make(findViewById(R.id.target),player1.game(player1, player2), Snackbar.LENGTH_LONG).show()
        }
    }
}