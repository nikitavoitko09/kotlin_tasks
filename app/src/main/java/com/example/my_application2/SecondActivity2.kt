package com.example.my_application2

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.View

class SecondActivity2 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_second2)
    }

    fun OnSClickGoMain(view: View)
    {
        val intent = Intent(this,MainActivity::class.java)
        startActivity(intent)
    }
}