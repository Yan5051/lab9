package com.example.laba9

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import kotlin.math.pow

class MainActivity : AppCompatActivity() {

    private lateinit var poshitat: Button
    private lateinit var Rost : EditText
    private lateinit var Ves : EditText
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        poshitat = findViewById(R.id.button)
        Rost = findViewById(R.id.Rost)
        Ves = findViewById(R.id.Ves)


        poshitat.setOnClickListener {
            val rost = Rost.text.toString().toDouble()
            val ves = Ves.text.toString().toDouble()

            val resultats : Double = ves / (rost /  100).pow(2)

            val int = Intent (this, resultat::class.java)
            int.putExtra("res", resultats.toString())
            startActivity(int)
        }
    }
}