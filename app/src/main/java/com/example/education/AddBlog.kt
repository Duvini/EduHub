package com.example.education

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView
import androidx.appcompat.widget.AppCompatButton

class AddBlog : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_add_blog)
        val imgbackbtn = findViewById<ImageView>(R.id.backimg31)
        imgbackbtn.setOnClickListener {
            val intent = Intent(this@AddBlog, StudentDash::class.java)
            intent.addFlags(Intent.FLAG_ACTIVITY_NO_ANIMATION)
            startActivity(intent)
        }
        val addBookbtn = findViewById<AppCompatButton>(R.id.addblogbtn)
        addBookbtn .setOnClickListener {
            val intent = Intent(this@AddBlog, StudentDash::class.java)
            intent.addFlags(Intent.FLAG_ACTIVITY_NO_ANIMATION)
            startActivity(intent)
        }
    }
}