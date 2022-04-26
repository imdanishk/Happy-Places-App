package com.example.happyplacesapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.happyplacesapp.databinding.ActivityAddHappyPlaceBinding

class AddHappyPlaceActivity : AppCompatActivity() {

    private var binding: ActivityAddHappyPlaceBinding? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityAddHappyPlaceBinding.inflate(layoutInflater)
        setContentView(binding?.root)

        setSupportActionBar(binding?.toolbarAddPlace)
        if (supportActionBar != null){
            supportActionBar?.setDisplayHomeAsUpEnabled(true)
            supportActionBar?.title = "ADD HAPPY PLACE"
        }

        binding?.toolbarAddPlace?.setNavigationOnClickListener {
            onBackPressed()
        }
    }
}