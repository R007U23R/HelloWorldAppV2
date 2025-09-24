package com.example.helloworldappv2

import android.os.Bundle
import android.graphics.Color
import android.widget.Button
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // Find views by their IDs
        val textView = findViewById<TextView>(R.id.textView)
        val button = findViewById<Button>(R.id.button)
        val colorButton = findViewById<Button>(R.id.colorButton)

        // Set click listener for the first button
        button.setOnClickListener {
            textView.text = "Button was clicked! Hello from O.O.!"
        }

        // Set click listener for the color button
        colorButton.setOnClickListener {
            textView.setTextColor(Color.RED)
        }
    }
}