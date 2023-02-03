package com.example.amonic

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageButton
import android.widget.TextView
import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentTransaction
import com.example.amonic.fragments.BuyPageFragment
import com.example.amonic.fragments.MainPageFragment
import com.example.amonic.fragments.ProfilePageFragment

class MainActivity : AppCompatActivity() {

    private lateinit var imageButtonMainPage: ImageButton
    private lateinit var imageButtonBuyPage: ImageButton
    private lateinit var imageButtonProfilePage: ImageButton
    private lateinit var textViewNamePage: TextView

    private var mainPageFragment = MainPageFragment()
    private var buyPageFragment = BuyPageFragment()
    private var profilePageFragment = ProfilePageFragment()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        imageButtonMainPage = findViewById(R.id.imageButtonMainPage)
        imageButtonBuyPage = findViewById(R.id.imageButtonBuyPage)
        imageButtonProfilePage = findViewById(R.id.imageButtonProfilePage)
        textViewNamePage = findViewById(R.id.textViewNamePage)

        textViewNamePage.text = "Главная"
        setFrameLayout(mainPageFragment)

        imageButtonMainPage.setOnClickListener {
            textViewNamePage.text = "Главная"
            setFrameLayout(mainPageFragment)
        }

        imageButtonBuyPage.setOnClickListener {
            textViewNamePage.text = "Купить"
            setFrameLayout(buyPageFragment)
        }

        imageButtonProfilePage.setOnClickListener {
            textViewNamePage.text = "Профиль"
            setFrameLayout(profilePageFragment)
        }
    }

    fun setFrameLayout(fragment: Fragment) {
        val fragmentTransaction: FragmentTransaction =
            supportFragmentManager.beginTransaction()
        fragmentTransaction.replace(R.id.frameLayoutMainActivity, fragment)
        fragmentTransaction.addToBackStack(null)
        fragmentTransaction.commit()
    }

}