package com.lucascabral.espressouitest

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.lucascabral.espressouitest.databinding.ActivitySecondaryBinding

class SecondaryActivity : AppCompatActivity() {

    private lateinit var secondaryBinding: ActivitySecondaryBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        secondaryBinding = ActivitySecondaryBinding.inflate(layoutInflater)
        setContentView(secondaryBinding.root)

        secondaryBinding.secondaryActivityBackButton.setOnClickListener {
            onBackPressed()
        }
    }
}