package com.example.education

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView
import androidx.appcompat.widget.AppCompatButton

class AddBook : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_add_book)

        val imgbackbtn = findViewById<ImageView>(R.id.backimg3)
        imgbackbtn.setOnClickListener {
            val intent = Intent(this@AddBook, StudentDash::class.java)
            intent.addFlags(Intent.FLAG_ACTIVITY_NO_ANIMATION)
            startActivity(intent)
        }
        val addBookbtn = findViewById<AppCompatButton>(R.id.addbook)
        addBookbtn .setOnClickListener {
            val intent = Intent(this@AddBook, StudentDash::class.java)
            intent.addFlags(Intent.FLAG_ACTIVITY_NO_ANIMATION)
            startActivity(intent)
        }
    }
}