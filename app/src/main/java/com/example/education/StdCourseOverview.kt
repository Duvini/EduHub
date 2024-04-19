package com.example.education

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView

class StdCourseOverview : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_std_course_overview)
        val imgbackbtn = findViewById<ImageView>(R.id.backimg7)
        imgbackbtn.setOnClickListener {
            val intent = Intent(this@StdCourseOverview, CourseList::class.java)
            intent.addFlags(Intent.FLAG_ACTIVITY_NO_ANIMATION)
            startActivity(intent)
        }
        val hmbtn = findViewById<ImageView>(R.id.home3)
        imgbackbtn.setOnClickListener {
            val intent = Intent(this@StdCourseOverview, StudentDash::class.java)
            intent.addFlags(Intent.FLAG_ACTIVITY_NO_ANIMATION)
            startActivity(intent)
        }
    }
}