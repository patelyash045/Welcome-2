package com.yash.welcome2

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class SignUpActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        actionBar?.hide()
        setContentView(R.layout.activity_sign_up)
    }
}