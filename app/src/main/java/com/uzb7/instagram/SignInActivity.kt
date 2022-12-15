package com.uzb7.instagram

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast

class SignInActivity : AppCompatActivity() {
    val login="mansurbek"
    val parol="12345678"
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_sign_in)
        open()
    }

    private fun open() {
        val username=findViewById<EditText>(R.id.et_email)
        val password=findViewById<EditText>(R.id.et_password)
        val signin=findViewById<Button>(R.id.b_signin)
        val signup=findViewById<TextView>(R.id.tv_signup)
        signup.setOnClickListener {
            val i=Intent(this,SignUpActivity::class.java)
            startActivity(i)
        }
        signin.setOnClickListener {
            if(tekshir(username.text.toString(),password.text.toString())){
                val open=Intent(this,MainActivity::class.java)
                startActivity(open)
            }
            else{
                Toast.makeText(this,"username yoki password xato",Toast.LENGTH_SHORT).show()
            }
        }
    }

    private fun tekshir(username: String, password: String): Boolean {
        if(username==login&&password==parol)return true
        else return false
    }
}