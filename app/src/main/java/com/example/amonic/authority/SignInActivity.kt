package com.example.amonic.authority

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import com.example.amonic.ChangePasswordActivity
import com.example.amonic.MainActivity
import com.example.amonic.R

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

        redirectToNewActivity()

    }

    private fun redirectToNewActivity() {
        textViewForgotPassword.setOnClickListener {
            val intent = Intent(this@SignInActivity, ChangePasswordActivity::class.java)
            startActivity(intent)
        }

        textViewYetNotRegisteredIntro.setOnClickListener {
            val intent = Intent(this@SignInActivity, SignUpActivity::class.java)
            startActivity(intent)
        }

        buttonSignIn.setOnClickListener {
            if (checkValidateEmail() && checkValidatePassword()) {
                val intent = Intent(this@SignInActivity, MainActivity::class.java)
                startActivity(intent)
            }
        }
    }

    private fun checkValidateEmail(): Boolean {
        if (editTextTextEmail.text.equals(null)) {
            editTextTextEmail.error = "Поле должно быть заполненно"
            return false
        } else if (editTextTextEmail.text.length < 10) {
            editTextTextEmail.error = "Длина не должна быть менее 10"
            return false
        } else if (editTextTextEmail.text.length > 30) {
            editTextTextEmail.error = "Длина не должна превышать 30"
            return false
        }
        return true
    }

    private fun checkValidatePassword(): Boolean {
        if (editTextTextEmail.text.equals(null)) {
            editTextTextPassword.error = "Поле должно быть заполненно"
            return false
        } else if (editTextTextEmail.text.length < 10) {
            editTextTextPassword.error = "Длина не должна быть менее 10"
            return false
        } else if (editTextTextEmail.text.length > 30) {
            editTextTextPassword.error = "Длина не должна превышать 30"
            return false
        }
        return true
    }

}