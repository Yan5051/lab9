package com.example.laba9

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import androidx.constraintlayout.widget.ConstraintLayout

class resultat : AppCompatActivity() {
    private lateinit var otvet : TextView
    private lateinit var foncvet : ConstraintLayout
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_resultat)

        val res = intent.getStringExtra("res")
        otvet = findViewById(R.id.otvet)

        foncvet = findViewById(R.id.fon)

        if (res != null) {
            if(res.toDouble() >= 18.5 && res.toDouble() <= 25) {
                otvet.text = "Индекс массы тела: " + Math.round(res.toDouble())
                foncvet.setBackgroundResource(R.color.xorosho)
            } else if(res.toDouble() >=  0.0 && res.toDouble() <= 18.4) {
                otvet.text = "Индекс массы тела: " + Math.round(res.toDouble())
                foncvet.setBackgroundResource(R.color.sredne)
            } else if(res.toDouble() >=  25.1 && res.toDouble() <= 70.0) {
                otvet.text = "Индекс массы тела: " + Math.round(res.toDouble())
                foncvet.setBackgroundResource(R.color.ploxo)
            }

        }
    }
}