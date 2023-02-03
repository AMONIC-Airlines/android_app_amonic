package com.example.amonic

import android.app.DatePickerDialog
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.DatePicker
import android.widget.EditText
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
            val intent = Intent(this@SignUpActivity, MainActivity::class.java)
            startActivity(intent)
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
}