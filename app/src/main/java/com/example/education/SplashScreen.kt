package com.example.education

import android.content.Intent
import android.os.Bundle
import android.os.Handler
import android.view.View
import android.view.animation.Animation
import android.view.animation.AnimationUtils
import android.widget.ImageView
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class SplashScreen : AppCompatActivity() {
    lateinit var animimgpage: Animation
    lateinit var bttone: Animation
    lateinit var btttwo: Animation
    lateinit var bttthree: Animation
    lateinit var ltr: Animation
    lateinit var logo: ImageView
    lateinit var slogon: TextView
    lateinit var subtitle: TextView
    lateinit var startbutton: TextView
    lateinit var bgprogress: View
    lateinit var bgprogresstop: View
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_splash_screen)


        animimgpage = AnimationUtils.loadAnimation(this, R.anim.animimgpage)
        bttone = AnimationUtils.loadAnimation(this, R.anim.bttone)
        btttwo = AnimationUtils.loadAnimation(this, R.anim.btttwo)
        bttthree = AnimationUtils.loadAnimation(this, R.anim.bttthree)
        ltr = AnimationUtils.loadAnimation(this, R.anim.ltr)

        logo = findViewById(R.id.logo)
        slogon = findViewById(R.id.slogon)
        subtitle = findViewById(R.id.subtitle)
        startbutton = findViewById(R.id.startbutton)
        bgprogress = findViewById(R.id.bgprogress)
        bgprogresstop = findViewById(R.id.bgprogresstop)

        logo.startAnimation(animimgpage)
        slogon.startAnimation(bttone)
        subtitle.startAnimation(bttone)
        startbutton.startAnimation(bttthree)
        bgprogress.startAnimation(btttwo)
        bgprogresstop.startAnimation(ltr)

        Handler().postDelayed({
            val intent = Intent(this@SplashScreen, MainActivity::class.java)
            intent.addFlags(Intent.FLAG_ACTIVITY_NO_ANIMATION)
            startActivity(intent)
            finish()
        }, 4000)
    }
}