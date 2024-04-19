package com.example.education

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView
import android.widget.TableRow

class CourseList : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_course_list)
        val imgbackbtn = findViewById<ImageView>(R.id.backimg6)
        imgbackbtn.setOnClickListener {
            val intent = Intent(this@CourseList, StudentDash::class.java)
            intent.addFlags(Intent.FLAG_ACTIVITY_NO_ANIMATION)
            startActivity(intent)
        }
        val infobtn = findViewById<TableRow>(R.id.Course1)
        infobtn.setOnClickListener {
            val intent = Intent(this@CourseList, StdCourseOverview::class.java)
            intent.addFlags(Intent.FLAG_ACTIVITY_NO_ANIMATION)
            startActivity(intent)
        }
    }
}