package com.example.happybirthday

import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val nameInput: EditText = findViewById(R.id.nameInput)
        val showToastButton: Button = findViewById(R.id.buttonok)

        showToastButton.setOnClickListener {
            val name = nameInput.text.toString()
            Toast.makeText(this, "button clicked and your name is $name", Toast.LENGTH_SHORT).show()
            }
        }
    }
