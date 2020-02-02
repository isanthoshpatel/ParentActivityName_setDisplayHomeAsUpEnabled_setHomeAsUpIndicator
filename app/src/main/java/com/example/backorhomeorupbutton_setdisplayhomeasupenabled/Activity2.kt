package com.example.backorhomeorupbutton_setdisplayhomeasupenabled

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_2.*

class Activity2 : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_2)


        supportActionBar.run {
            title = "supportActionBar"
            this!!.subtitle = "BackOrHomeOrUpButton"

            setDisplayHomeAsUpEnabled(true)
            setHomeAsUpIndicator(R.drawable.ic_android_black_24dp)
        }


       bt1.setOnClickListener {
            startActivity(Intent(this@Activity2,Activity3::class.java))
        }

    }
}
