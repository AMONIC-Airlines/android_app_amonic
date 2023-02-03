package com.example.amonic

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView

class SignInActivity : AppCompatActivity() {

    private lateinit var buttonSignIn: Button
    private lateinit var editTextTextEmail: EditText
    private lateinit var editTextTextPassword: EditText
    private lateinit var textViewYetNotRegisteredIntro: TextView
    private lateinit var textViewForgotPassword: TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_sign_in)

        buttonSignIn = findViewById(R.id.buttonSignIn)
        editTextTextEmail = findViewById(R.id.editTextTextEmail)
        editTextTextPassword = findViewById(R.id.editTextTextPassword)
        textViewYetNotRegisteredIntro = findViewById(R.id.textViewYetNotRegisteredIntro)
        textViewForgotPassword = findViewById(R.id.textViewForgotPassword)

        textViewForgotPassword.setOnClickListener {
            val intent = Intent(this@SignInActivity, ChangePasswordActivity::class.java)
            startActivity(intent)
        }

        textViewYetNotRegisteredIntro.setOnClickListener {
            val intent = Intent(this@SignInActivity, SignUpActivity::class.java)
            startActivity(intent)
        }

        buttonSignIn.setOnClickListener {
            val intent = Intent(this@SignInActivity, MainActivity::class.java)
            startActivity(intent)
        }
    }
}