package edu.bo.ucb.colores

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.graphics.Color
import android.text.Layout
import android.widget.Button
import android.widget.LinearLayout
import android.widget.RelativeLayout


class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val btnWhite = findViewById(R.id.btnWhite) as Button
        val btnRed = findViewById(R.id.btnRed) as Button
        val layoutPrincipal = findViewById(R.id.layoutPrincipal) as LinearLayout
        btnWhite.setOnClickListener {
            layoutPrincipal.setBackgroundColor(Color.WHITE)
        }
        btnRed.setOnClickListener({
            layoutPrincipal.setBackgroundColor(Color.RED)
        })
    }
}