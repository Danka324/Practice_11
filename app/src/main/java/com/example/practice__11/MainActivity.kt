package com.example.practice__11

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.ImageView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }
    fun ButtonClick(veiw:View){

        val button : Button = findViewById(R.id.button)
        val image: ImageView = findViewById(R.id.imageView3)
        button.setOnClickListener{
            image.setImageResource(R.drawable.lkf)
        }
    }
}

