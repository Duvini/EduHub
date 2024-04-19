package com.example.education

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView
import android.content.Intent
import androidx.appcompat.widget.AppCompatButton

class Register : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_register)

        val imgbackbtn = findViewById<ImageView>(R.id.backimg)
        imgbackbtn.setOnClickListener {
            val intent = Intent(this@Register, LoginView::class.java)
            intent.addFlags(Intent.FLAG_ACTIVITY_NO_ANIMATION)
            startActivity(intent)
        }
        val registerbtn = findViewById<AppCompatButton>(R.id.login3)
        registerbtn .setOnClickListener {
            val intent = Intent(this@Register, Login::class.java)
            intent.addFlags(Intent.FLAG_ACTIVITY_NO_ANIMATION)
            startActivity(intent)
        }
    }
}