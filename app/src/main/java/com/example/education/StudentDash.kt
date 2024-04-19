package com.example.education

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView
import android.widget.TextView
import androidx.appcompat.widget.AppCompatButton

class StudentDash : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_student_dash)

        // Back button click listener
        val imgbackbtn = findViewById<ImageView>(R.id.Saccount)
        imgbackbtn.setOnClickListener {
            val intent = Intent(this@StudentDash, StudentHome::class.java)
            intent.addFlags(Intent.FLAG_ACTIVITY_NO_ANIMATION)
            startActivity(intent)
        }

        // Add Book button click listener
        val addbtn = findViewById<TextView>(R.id.addBookz)
        addbtn.setOnClickListener {
            val intent = Intent(this@StudentDash, AddBook::class.java)
            intent.addFlags(Intent.FLAG_ACTIVITY_NO_ANIMATION)
            startActivity(intent)
        }
        val addbtn2 = findViewById<TextView>(R.id.addblog)
        addbtn2.setOnClickListener {
            val intent = Intent(this@StudentDash, AddBlog::class.java)
            intent.addFlags(Intent.FLAG_ACTIVITY_NO_ANIMATION)
            startActivity(intent)
        }
        val viewbtn= findViewById<TextView>(R.id.viewQuizzes)
        viewbtn.setOnClickListener {
            val intent = Intent(this@StudentDash, ViewQuizStd::class.java)
            intent.addFlags(Intent.FLAG_ACTIVITY_NO_ANIMATION)
            startActivity(intent)
        }
        val viewbtn1= findViewById<TextView>(R.id.viewCourse)
        viewbtn1.setOnClickListener {
            val intent = Intent(this@StudentDash, CourseList::class.java)
            intent.addFlags(Intent.FLAG_ACTIVITY_NO_ANIMATION)
            startActivity(intent)
        }
        val viewbtn2= findViewById<TextView>(R.id.viewBook)
        viewbtn2.setOnClickListener {
            val intent = Intent(this@StudentDash, BookView::class.java)
            intent.addFlags(Intent.FLAG_ACTIVITY_NO_ANIMATION)
            startActivity(intent)
        }
    }
}
