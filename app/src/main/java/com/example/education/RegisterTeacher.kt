package com.example.education

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView
import androidx.appcompat.widget.AppCompatButton


class RegisterTeacher : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_register_teacher)

        val imgbackbtn = findViewById<ImageView>(R.id.backimg2)
        imgbackbtn.setOnClickListener {
            val intent = Intent(this@RegisterTeacher, LoginView::class.java)
            intent.addFlags(Intent.FLAG_ACTIVITY_NO_ANIMATION)
            startActivity(intent)
        }
        val registerbtn = findViewById<AppCompatButton>(R.id.Tregister)
        registerbtn .setOnClickListener {
            val intent = Intent(this@RegisterTeacher, Login::class.java)
            intent.addFlags(Intent.FLAG_ACTIVITY_NO_ANIMATION)
            startActivity(intent)
        }
    }
}