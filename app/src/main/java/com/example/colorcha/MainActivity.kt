package com.example.colorcha

import Utils.MyData
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        btn_clickme.setOnClickListener {
            val intent = Intent(this, color::class.java)
            startActivity(intent)
        }

    }

    override fun onStart() {
        super.onStart()
        root.setBackgroundColor(resources.getColor(MyData.color))
    }
}