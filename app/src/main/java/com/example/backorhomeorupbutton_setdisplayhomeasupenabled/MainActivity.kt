package com.example.backorhomeorupbutton_setdisplayhomeasupenabled

import android.content.Intent
import android.graphics.drawable.Drawable
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.ViewGroup
import android.widget.Button
import androidx.core.view.ViewGroupCompat
import androidx.core.view.children
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

       setTitle("UpOrHome Button")

        bt1.setOnClickListener {
            startActivity(Intent(this@MainActivity,Activity2::class.java))
        }

    }
}
