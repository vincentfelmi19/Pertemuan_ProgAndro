package com.example.pertemuan5_activity

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val btnHello = findViewById<Button>(R.id.btnHello)
        btnHello.setOnClickListener {
            goToSecondActivity()
        }
    }

    fun goToSecondActivity(){
        val edtMessage = findViewById<EditText>(R.id.edtMessage)

        val intent = Intent(this, SecondActivity::class.java)
        intent.putExtra("message", edtMessage.text.toString())
        startActivity(intent)
    }

    fun hello(){
        val edtMessage = findViewById<EditText>(R.id.edtMessage)
        Toast.makeText(this, edtMessage.text.toString(), Toast.LENGTH_SHORT).show()
    }
}