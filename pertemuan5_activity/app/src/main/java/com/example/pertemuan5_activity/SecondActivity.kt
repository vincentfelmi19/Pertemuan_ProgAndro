package com.example.pertemuan5_activity

import android.os.Bundle
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class SecondActivity: AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_second)

        val message = intent.extras?.getString("message")
        val txvMessage = findViewById<TextView>(R.id.txvMessage)
        txvMessage.text = message
    }
}