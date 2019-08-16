package com.example.random_fortnite

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import android.widget.Toast
import java.util.Random

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val Button=findViewById<Button>(R.id.fbut1)
        Button.setOnClickListener{
            val rand = Random().nextInt(3)
            val id = when (rand) {
                0 -> R.drawable.skin_sparkplug
                1 -> R.drawable.skin_valkyrie
                else -> R.drawable.skin_vandata

            }
            Toast.makeText(this, rand.toString(), Toast.LENGTH_SHORT).show()
            val image_View = findViewById<ImageView>(R.id.imv1)
            image_View.setImageResource(id)

    }


    }
}
