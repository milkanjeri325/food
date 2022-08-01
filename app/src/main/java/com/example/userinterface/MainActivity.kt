package com.example.userinterface

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MainActivity : AppCompatActivity() {
    var next:Button ?= null
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        next=findViewById(R.id.btn_button)
        next!!.setOnClickListener {
        val intent = Intent(this,food::class.java)
            startActivity(intent)
        }
    }
}