package com.example.amonic.fragments

import android.content.Intent
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.TextView
import com.example.amonic.*

class MainPageFragment : Fragment() {

    private lateinit var buttonAddNewBookMain: Button
    private lateinit var buttonTableFlightsMain: Button
    private lateinit var buttonRegistrationFlightMain: Button
    private lateinit var buttonAddingServiceMain: Button
    private lateinit var buttonAboutMain: Button
    private lateinit var textViewWelcomeText: TextView

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        val view = inflater.inflate(R.layout.fragment_main_page, container, false)

        buttonAddNewBookMain = view.findViewById(R.id.buttonAddNewBookMain)
        buttonTableFlightsMain = view.findViewById(R.id.buttonTableFlightsMain)
        buttonRegistrationFlightMain = view.findViewById(R.id.buttonRegistrationFlightMain)
        buttonAboutMain = view.findViewById(R.id.buttonAboutMain)
        textViewWelcomeText = view.findViewById(R.id.textViewWelcomeText)

        buttonAddNewBookMain.setOnClickListener {
            val intent = Intent(this.context, FindingBookingActivity::class.java)
            startActivity(intent)
        }

        buttonTableFlightsMain.setOnClickListener {
            val intent = Intent(this.context, TableFlightsActivity::class.java)
            startActivity(intent)
        }

        buttonRegistrationFlightMain.setOnClickListener {
            val intent = Intent(this.context, FlightRegistrationActivity::class.java)
            startActivity(intent)
        }

        buttonAboutMain.setOnClickListener {
            val intent = Intent(this.context, AboutCompanyActivity::class.java)
            startActivity(intent)
        }

        return view
    }
}