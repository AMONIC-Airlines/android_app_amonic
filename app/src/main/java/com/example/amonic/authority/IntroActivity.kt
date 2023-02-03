package com.example.amonic.authority

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import com.example.amonic.R

class IntroActivity : AppCompatActivity() {

    private lateinit var signInButtonIntro: Button
    private lateinit var signUpButtonIntro: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_intro)

        signInButtonIntro = findViewById(R.id.signInButtonIntro)
        signUpButtonIntro = findViewById(R.id.signUpButtonIntro)

        signInButtonIntro.setOnClickListener {
            val intent = Intent(this@IntroActivity, SignInActivity::class.java)
            startActivity(intent)
        }

        signUpButtonIntro.setOnClickListener {
            val intent = Intent(this@IntroActivity, SignUpActivity::class.java)
            startActivity(intent)
        }

    }
}