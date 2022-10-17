package com.example.my_application2

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.view.View.OnClickListener
import android.view.View.OnCreateContextMenuListener
import android.widget.Button
import android.widget.Toast
import android.widget.ToggleButton

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        setTitle("Date & Time");
    }

    fun OnClickGoMain(view: View)
    {
        val intent = Intent(this,SecondActivity2::class.java)
        startActivity(intent)
    }





  fun toastMe(view: View)
  {
      val maToast = Toast.makeText(this,"Welcome!",Toast.LENGTH_SHORT)
      maToast.show()
  }


}