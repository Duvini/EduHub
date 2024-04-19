package com.example.education

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView
import android.widget.TextView

class BookView : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_book_view)


        val imgbackbtn = findViewById<ImageView>(R.id.backimg55)
        imgbackbtn.setOnClickListener {
            val intent = Intent(this@BookView, StudentDash::class.java)
            intent.addFlags(Intent.FLAG_ACTIVITY_NO_ANIMATION)
            startActivity(intent)
        }
        val viewbtn= findViewById<TextView>(R.id.CoursesH1)
        viewbtn.setOnClickListener {
            val intent = Intent(this@BookView, ReadBook::class.java)
            intent.addFlags(Intent.FLAG_ACTIVITY_NO_ANIMATION)
            startActivity(intent)
        }
    }
}