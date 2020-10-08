package com.example.form.Activity

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.form.R

class LoginActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login);
    }

    private fun redirectRegister(){
        val intent = Intent(this, RegisterActivity::class.java);
        startActivity(intent);
    }
}