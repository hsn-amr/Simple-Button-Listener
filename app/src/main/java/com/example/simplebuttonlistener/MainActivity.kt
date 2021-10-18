package com.example.simplebuttonlistener

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.Toast

class MainActivity : AppCompatActivity() {

    lateinit var kotlinButton: Button
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        kotlinButton = findViewById(R.id.btnKotlin)

        kotlinButton.setOnClickListener { Toast.makeText(this, "Coding", Toast.LENGTH_LONG).show() }
    }


    fun xmlToast(view: android.view.View) {
        Toast.makeText(this, "XML", Toast.LENGTH_LONG).show()
    }
}