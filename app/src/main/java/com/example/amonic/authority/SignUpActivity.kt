package com.example.amonic.authority

import android.app.DatePickerDialog
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import com.example.amonic.MainActivity
import com.example.amonic.R
import java.text.SimpleDateFormat
import java.util.*

class SignUpActivity : AppCompatActivity() {

    private lateinit var buttonSetDate: Button
    private lateinit var buttonSignUp: Button
    private lateinit var editTextBirthDay: EditText
    private lateinit var editTextTextEmailSignUp: EditText
    private lateinit var editTextFirstName: EditText
    private lateinit var editTextLastName: EditText
    private lateinit var editTextPasswordSignUp: EditText
    private lateinit var editTextRePasswordSignUp: EditText

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_sign_up)

        buttonSetDate = findViewById(R.id.buttonSetDate)
        buttonSignUp = findViewById(R.id.buttonSignUp)
        editTextBirthDay = findViewById(R.id.editTextBirthDay)
        editTextTextEmailSignUp = findViewById(R.id.editTextTextEmailSignUp)
        editTextFirstName = findViewById(R.id.editTextFirstName)
        editTextLastName = findViewById(R.id.editTextLastName)
        editTextPasswordSignUp = findViewById(R.id.editTextPasswordSignUp)
        editTextRePasswordSignUp = findViewById(R.id.editTextRePasswordSignUp)

        buttonSignUp.setOnClickListener {
            if (checkValidateAll()) {
                val intent = Intent(this@SignUpActivity, MainActivity::class.java)
                startActivity(intent)
            }
        }

        val calendar = Calendar.getInstance()
        val datePicker = DatePickerDialog.OnDateSetListener { view, year, month, dayOfMonth ->
            calendar.set(Calendar.DAY_OF_MONTH, dayOfMonth)
            calendar.set(Calendar.MONTH, month)
            calendar.set(Calendar.YEAR, year)
            updateBirthDay(calendar)
        }

        buttonSetDate.setOnClickListener {
            DatePickerDialog(
                this,
                datePicker,
                calendar.get(Calendar.DAY_OF_MONTH),
                calendar.get(Calendar.MONTH),
                calendar.get(Calendar.YEAR)
            ).show()
        }

    }

    private fun updateBirthDay(calendar: Calendar) {
        val format = "yyyy-MM-dd"
        val simpleDayFormat = SimpleDateFormat(format, Locale.KOREA)
        editTextBirthDay.setText(simpleDayFormat.format(calendar.time))
    }

    private fun checkValidateBirthday(): Boolean {
        if (editTextBirthDay.text.equals(null)) {
            editTextBirthDay.error = "???????? ???????????? ???????? ????????????????????"
            return false
        }
        return true
    }

    private fun checkValidate(editText: EditText): Boolean {
        if (editText.text.equals(null)) {
            editText.error = "???????? ???????????? ???????? ????????????????????"
            return false
        } else if (editText.text.length < 10) {
            editText.error = "?????????? ???? ???????????? ???????? ?????????? 10"
            return false
        } else if (editText.text.length > 30) {
            editText.error = "?????????? ???? ???????????? ?????????????????? 30"
            return false
        }
        return true
    }

    private fun checkValidatePassword(): Boolean {
        if (editTextPasswordSignUp.text.equals(null)) {
            editTextPasswordSignUp.error = "???????? ???????????? ???????? ????????????????????"
            return false
        } else if (editTextPasswordSignUp.text.length < 10) {
            editTextPasswordSignUp.error = "?????????? ???? ???????????? ???????? ?????????? 10"
            return false
        } else if (editTextPasswordSignUp.text.length > 30) {
            editTextPasswordSignUp.error = "?????????? ???? ???????????? ?????????????????? 30"
            return false
        } else if (editTextPasswordSignUp.text.toString() != editTextRePasswordSignUp.text.toString()) {
            editTextPasswordSignUp.error = "???????????? ???? ??????????????????"
            editTextRePasswordSignUp.error = "???????????? ???? ??????????????????"
            return false
        }
        return true
    }
    
    private fun checkValidateAll(): Boolean {
        if (checkValidate(editTextFirstName) &&
            checkValidate(editTextLastName) &&
            checkValidateBirthday() &&
            checkValidatePassword()
        ) {
            return true
        }
        return false
    }

}