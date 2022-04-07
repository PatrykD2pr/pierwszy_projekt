package com.example.pierwszy_projekt

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var next = findViewById<Button>(R.id.next)
        var prev = findViewById<Button>(R.id.prev)
        var img = findViewById<ImageView>(R.id.image)
        var zdj = 1

        img.setImageResource(R.drawable.apex_legends_logo_opt_jpg)
        zdj = 1

        next.setOnClickListener()
        {
            if (zdj % 2 != 0)
            {
                img.setImageResource(R.drawable.logolol)
                zdj++
            }
            else
            {
                img.setImageResource(R.drawable.apex_legends_logo_opt_jpg)
                zdj++
            }
        }

        prev.setOnClickListener()
        {
            if (zdj % 2 != 0)
            {
                img.setImageResource(R.drawable.logolol)
                zdj--
            }
            else
            {
                img.setImageResource(R.drawable.apex_legends_logo_opt_jpg)
                zdj--
            }
        }
    }
}