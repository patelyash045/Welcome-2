package com.yash.welcome2

import android.app.ActionBar
import android.app.Activity
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Window
import android.view.WindowManager
import android.widget.TextView

class MainActivity : Activity() {

    lateinit var signup : TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

       // requestWindowFeature(Window.FEATURE_NO_TITLE)
       // window.setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,WindowManager.LayoutParams.FLAG_FULLSCREEN)

        actionBar?.hide()

        setContentView(R.layout.activity_main)

        signup = findViewById(R.id.SignUp)

        signup.setOnClickListener {
            val intent = Intent(this,SignUpActivity::class.java)
            startActivity(intent)
        }

    }
}