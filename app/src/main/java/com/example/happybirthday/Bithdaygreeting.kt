package com.example.happybirthday

import android.annotation.SuppressLint
import android.os.Bundle
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import com.example.happybirthday.R.layout.birthday_greeting

class Bithdaygreeting :AppCompatActivity() {
 companion object{
     const val  NAME_EXTRA = "name_extra"
 }



        @SuppressLint("SetTextI18n")
        override fun onCreate(savedInstanceState: Bundle?) {
            super.onCreate(savedInstanceState)
            setContentView(birthday_greeting)

         val name = intent.getStringExtra(NAME_EXTRA)
            val birthdaymsg:TextView = findViewById(R.id.msgbirth)
           birthdaymsg.text ="Happy Birthday $name"
        }


}