package com.example.modifiedrula

import android.content.Intent
import android.os.Bundle
import android.view.View
import android.widget.CheckBox
import androidx.appcompat.app.AppCompatActivity

class LeftWristAdjustment : AppCompatActivity() {
    /** creating local variables for checkboxes */
    lateinit var lWristCheckMidline: CheckBox

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_left_wrist_adjustment)

        /** assign corresponding checkboxes to variables */
        lWristCheckMidline = findViewById(R.id.lWristCheckMidline)
    }

    fun toLeftWristTwist(view: View){
        /** when next is clicked, check state of checkboxes and adjust global variable
         * rUpperArmScore accordingly */
        if (lWristCheckMidline.isChecked) {
            GlobalVariables.lWristScore += 1
        }

        /** moves to next page */
        val intent = Intent (this, LeftWristTwist::class.java)
        startActivity(intent)
    }

    fun backToLeftWristPosture(view: View){
        val intent = Intent(this, LeftWristPosture::class.java)
        startActivity(intent)
    }
}
