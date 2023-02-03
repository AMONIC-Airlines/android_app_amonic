package com.example.amonic.fragments

import android.content.Intent
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import com.example.amonic.ChangePasswordActivity
import com.example.amonic.R

class ProfilePageFragment : Fragment() {

    private lateinit var buttonChangePasswordProfile: Button

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        val view = inflater.inflate(R.layout.fragment_profile_page, container, false)

        buttonChangePasswordProfile = view.findViewById(R.id.buttonChangePasswordProfile)

        buttonChangePasswordProfile.setOnClickListener {
            val intent = Intent(this.context, ChangePasswordActivity::class.java)
            startActivity(intent)
        }

        return view
    }
}