package com.maulanazhrny.ujiangasal

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val terongimg =findViewById<ImageView>(R.id.eggplant)
        val wortelimg =findViewById<ImageView>(R.id.carrot)
        val seladaimg =findViewById<ImageView>(R.id.lettuce)
        val bawangimg =findViewById<ImageView>(R.id.onion)
        val cabaiimg =findViewById<ImageView>(R.id.pepper)
        val tomatimg =findViewById<ImageView>(R.id.tomato)

        terongimg.setOnClickListener {
            val intent = Intent(this, eggplannt::class.java)
            startActivity(intent)
        }

        wortelimg.setOnClickListener {
            val intent = Intent(this, carrot::class.java)
            startActivity(intent)
        }

        seladaimg.setOnClickListener {
            val intent = Intent(this, lettuce::class.java)
            startActivity(intent)
        }

        bawangimg.setOnClickListener {
            val intent = Intent(this, onion::class.java)
            startActivity(intent)
        }

        cabaiimg.setOnClickListener {
            val intent = Intent(this, papper::class.java)
            startActivity(intent)
        }

        tomatimg.setOnClickListener {
            val intent = Intent(this, tomato::class.java)
            startActivity(intent)
        }

    }
}