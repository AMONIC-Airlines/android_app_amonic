package com.example.amonic

import android.app.DatePickerDialog
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import java.text.SimpleDateFormat
import java.util.*

class TableFlightsActivity : AppCompatActivity() {

    private lateinit var editTextDateFlight: EditText
    private lateinit var buttonSetDateTableFinding: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_table_flights)

        editTextDateFlight = findViewById(R.id.editTextDateFlight)
        buttonSetDateTableFinding = findViewById(R.id.buttonSetDateTableFinding)

        val calendar = Calendar.getInstance()
        val datePicker = DatePickerDialog.OnDateSetListener { view, year, month, dayOfMonth ->
            calendar.set(Calendar.DAY_OF_MONTH, dayOfMonth)
            calendar.set(Calendar.MONTH, month)
            calendar.set(Calendar.YEAR, year)
            updateBirthDay(calendar)
        }

        buttonSetDateTableFinding.setOnClickListener {
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
        editTextDateFlight.setText(simpleDayFormat.format(calendar.time))
    }

}