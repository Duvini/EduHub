package com.example.education

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.appcompat.widget.AppCompatButton

class LoginView : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login_view)

        val loginbtn = findViewById<AppCompatButton>(R.id.login)
        val stdRegbtn = findViewById<AppCompatButton>(R.id.signS)
        val tchRegbtn = findViewById<AppCompatButton>(R.id.signT)

        loginbtn.setOnClickListener {
            val intent = Intent(this@LoginView, Login::class.java)
            intent.addFlags(Intent.FLAG_ACTIVITY_NO_ANIMATION)
            startActivity(intent)
        }
        stdRegbtn.setOnClickListener {
            val intent = Intent(this@LoginView, Register::class.java)
            intent.addFlags(Intent.FLAG_ACTIVITY_NO_ANIMATION)
            startActivity(intent)
        }
        tchRegbtn.setOnClickListener {
            val intent = Intent(this@LoginView, RegisterTeacher::class.java)
            intent.addFlags(Intent.FLAG_ACTIVITY_NO_ANIMATION)
            startActivity(intent)
        }
    }
}