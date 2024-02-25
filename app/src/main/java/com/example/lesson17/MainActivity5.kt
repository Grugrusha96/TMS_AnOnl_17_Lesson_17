package com.example.lesson17

import android.annotation.SuppressLint
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MainActivity5 : AppCompatActivity() {
    companion object {
        const val SLEEP = 3000L
    }

    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main5)
        val button = findViewById<Button>(R.id.button5)
        button.setOnClickListener {
            it.postDelayed({
                val intent = Intent(this, MainActivity::class.java)
                startActivity(intent)
            }, SLEEP)
        }
    }
}