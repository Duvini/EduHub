package com.example.education

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView
import android.widget.TextView

class ViewQuizStd : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_view_quiz_std)

        val imgbackbtn = findViewById<ImageView>(R.id.backimg5)
        imgbackbtn.setOnClickListener {
            val intent = Intent(this@ViewQuizStd, StudentDash::class.java)
            intent.addFlags(Intent.FLAG_ACTIVITY_NO_ANIMATION)
            startActivity(intent)
        }
        val quiz = findViewById<TextView>(R.id.CoursesH1)
        quiz.setOnClickListener {
            val intent = Intent(this@ViewQuizStd, SingleQuizStd::class.java)
            intent.addFlags(Intent.FLAG_ACTIVITY_NO_ANIMATION)
            startActivity(intent)
        }
    }
}