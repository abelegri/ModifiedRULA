package com.example.modifiedrula

import android.content.Intent
import android.os.Bundle
import android.view.View
import android.widget.CheckBox
import androidx.appcompat.app.AppCompatActivity

class RightLowerArmAdjustment : AppCompatActivity() {
    /** creating local variables for checkboxes */
    lateinit var rMidline: CheckBox
    lateinit var rOutToSide: CheckBox

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_right_lower_arm_adjustment)

        /** assign corresponding checkboxes to variables */
        rMidline = findViewById(R.id.rLowerArmCheckMidline)
        rOutToSide = findViewById(R.id.rLowerArmCheckOutToSide)
    }

    fun toRightWristPosture(view: View){
        /** when next is clicked, check state of checkboxes and adjust global variable
         * rUpperArmScore accordingly */
        if ((rMidline.isChecked) || (rOutToSide.isChecked)) {
            GlobalVariables.rLowerArmScore += 1
        }

        /** moves to next page */
        val intent = Intent (this, RightWristPosture::class.java)
        startActivity(intent)
    }

    fun backToRightLowerArmPosture(view: View){
        val intent = Intent(this, RightLowerArmPosture::class.java)
        startActivity(intent)
    }
}
