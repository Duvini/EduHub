package com.example.education

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView

class SingleQuizStd : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_single_quiz_std)

        val imgbackbtn = findViewById<ImageView>(R.id.backimg66)
        imgbackbtn.setOnClickListener {
            val intent = Intent(this@SingleQuizStd, ViewQuizStd::class.java)
            intent.addFlags(Intent.FLAG_ACTIVITY_NO_ANIMATION)
            startActivity(intent)
        }
    }
}