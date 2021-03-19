package com.example.modifiedrula

import android.content.Intent
import android.os.Bundle
import android.view.View
import android.widget.CheckBox
import androidx.appcompat.app.AppCompatActivity

class RightWristAdjustment : AppCompatActivity() {
    /** creating local variables for checkboxes */
    lateinit var rWristCheckMidline: CheckBox

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_right_wrist_adjustment)

        /** assign corresponding checkboxes to variables */
        rWristCheckMidline = findViewById(R.id.rWristCheckMidline)
    }

    fun toRightWristTwist(view: View){
        /** when next is clicked, check state of checkboxes and adjust global variable
         * rUpperArmScore accordingly */
        if (rWristCheckMidline.isChecked) {
            GlobalVariables.rWristScore += 1
        }

        /** moves to next page */
        val intent = Intent (this, RightWristTwist::class.java)
        startActivity(intent)
    }

    fun backToRightWristPosture(view: View){
        val intent = Intent(this, RightWristPosture::class.java)
        startActivity(intent)
    }
}
