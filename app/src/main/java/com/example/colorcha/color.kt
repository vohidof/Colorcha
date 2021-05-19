package com.example.colorcha

import Utils.MyData
import android.graphics.Color.red
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_color.*

class color : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_color)

        red.setOnClickListener {
            MyData.color = R.color.red
            Toast.makeText(this, "You edit color", Toast.LENGTH_SHORT).show()
            finish()
        }

        orange.setOnClickListener {
            MyData.color = R.color.orange
            Toast.makeText(this, "You edit color", Toast.LENGTH_SHORT).show()
            finish()
        }

        yellow.setOnClickListener {
            MyData.color = R.color.yellow
            Toast.makeText(this, "You edit color", Toast.LENGTH_SHORT).show()
            finish()
        }

        green.setOnClickListener {
            MyData.color = R.color.green
            Toast.makeText(this, "You edit color", Toast.LENGTH_SHORT).show()
            finish()
        }

        blue.setOnClickListener {
            MyData.color = R.color.blue
            Toast.makeText(this, "You edit color", Toast.LENGTH_SHORT).show()
            finish()
        }

        indigo.setOnClickListener {
            MyData.color = R.color.indigo
            Toast.makeText(this, "You edit color", Toast.LENGTH_SHORT).show()
            finish()
        }

        violet.setOnClickListener {
            MyData.color = R.color.violet
            Toast.makeText(this, "You edit color", Toast.LENGTH_SHORT).show()
            finish()
        }

        teal_200.setOnClickListener {
            MyData.color = R.color.teal_200
            Toast.makeText(this, "You edit color", Toast.LENGTH_SHORT).show()
            finish()
        }
    }
}