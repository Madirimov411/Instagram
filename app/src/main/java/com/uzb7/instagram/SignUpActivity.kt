package com.uzb7.instagram

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView

class SignUpActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_sign_up2)
        open()
    }

    private fun open() {
        val ochish=findViewById<TextView>(R.id.tv_signup1)
        ochish.setOnClickListener {
            val open= Intent(this,SignInActivity::class.java)
            startActivity(open)
        }
    }
}