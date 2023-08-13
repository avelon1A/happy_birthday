package com.example.happybirthday

import android.content.Intent
import android.os.Bundle
import android.view.View
import android.widget.EditText
import androidx.appcompat.app.AppCompatActivity


class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

        fun clickme(view: View) {
            val input:EditText = findViewById(R.id.nameInput)
            val name = input.editableText.toString()
            val intent = Intent(this,Bithdaygreeting::class.java)
           intent.putExtra(Bithdaygreeting.NAME_EXTRA,name)
            startActivity(intent)
        }
    }


