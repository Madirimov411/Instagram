package com.uzb7.instagram

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler

class SplashActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_splash)
        open()
    }

    private fun open() {
        Handler().postDelayed({
            val open=Intent(this,SignInActivity::class.java)
            startActivity(open)
            finish()
        },2000)
    }
}