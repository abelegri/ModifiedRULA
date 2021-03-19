package com.example.modifiedrula

import android.content.Intent
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity


class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    /** called when the user taps the begin button */
    fun nextPage(view: View){
        val intent = Intent (this, ChooseSide::class.java)
        startActivity(intent)
    }
}