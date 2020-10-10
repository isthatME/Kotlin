package com.example.form.Activity

import Fragments.loginFragment
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.form.R
import kotlinx.android.synthetic.main.fragment_login.*

class LoginActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login);

        val loginFragment = loginFragment();
        val fragmentManager = supportFragmentManager
        val fragmentTransaction = fragmentManager.beginTransaction()
        fragmentTransaction.add(R.id.frameContent, loginFragment);
        fragmentTransaction.commit()
    }

    private fun redirectRegister(){
        val intent = Intent(this, RegisterActivity::class.java);
        startActivity(intent);
    }
}