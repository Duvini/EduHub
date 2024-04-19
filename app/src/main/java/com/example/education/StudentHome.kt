package com.example.education

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView
import android.widget.TextView

class StudentHome : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_student_home)

        val imgbackbtn = findViewById<ImageView>(R.id.home)
        imgbackbtn.setOnClickListener {
            val intent = Intent(this@StudentHome, StudentDash::class.java)
            intent.addFlags(Intent.FLAG_ACTIVITY_NO_ANIMATION)
            startActivity(intent)
        }
        val progrbtn = findViewById<TextView>(R.id.progress)
        progrbtn.setOnClickListener {
            val intent = Intent(this@StudentHome, StudentProgress::class.java)
            intent.addFlags(Intent.FLAG_ACTIVITY_NO_ANIMATION)
            startActivity(intent)
        }
    }
}