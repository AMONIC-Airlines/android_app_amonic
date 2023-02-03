package com.example.amonic

import android.app.DatePickerDialog
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.EditText
import com.example.amonic.R
import java.text.SimpleDateFormat
import java.util.*

class BuyPageFragment : Fragment() {

    private lateinit var buttonDateBuy: Button
    private lateinit var editTextDateBuy: EditText

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        val view = inflater.inflate(R.layout.fragment_buy_page, container, false)

        buttonDateBuy = view.findViewById(R.id.buttonDateBuy)
        editTextDateBuy = view.findViewById(R.id.editTextDateBuy)

        val calendar = Calendar.getInstance()
        val datePicker = DatePickerDialog.OnDateSetListener { view, year, month, dayOfMonth ->
            calendar.set(Calendar.DAY_OF_MONTH, dayOfMonth)
            calendar.set(Calendar.MONTH, month)
            calendar.set(Calendar.YEAR, year)
            updateBirthDay(calendar)
        }

        buttonDateBuy.setOnClickListener {
            this.context?.let {
                DatePickerDialog(
                    it,
                    datePicker,
                    calendar.get(Calendar.DAY_OF_MONTH),
                    calendar.get(Calendar.MONTH),
                    calendar.get(Calendar.YEAR)
                ).show()
            }
        }
        return view
    }

    private fun updateBirthDay(calendar: Calendar) {
        val format = "yyyy-MM-dd"
        val simpleDayFormat = SimpleDateFormat(format, Locale.KOREA)
        editTextDateBuy.setText(simpleDayFormat.format(calendar.time))
    }

}