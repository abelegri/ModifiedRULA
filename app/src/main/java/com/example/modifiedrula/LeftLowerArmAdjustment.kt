package com.example.modifiedrula

import android.content.Intent
import android.os.Bundle
import android.view.View
import android.widget.CheckBox
import androidx.appcompat.app.AppCompatActivity

class LeftLowerArmAdjustment : AppCompatActivity() {
        /** creating local variables for checkboxes */
        lateinit var lMidline: CheckBox
        lateinit var lOutToSide: CheckBox

        override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_left_lower_arm_adjustment)

        /** assign corresponding checkboxes to variables */
        lMidline = findViewById(R.id.lLowerArmCheckMidline)
        lOutToSide = findViewById(R.id.lLowerArmCheckOutToSide)
        }

        fun toLeftWristPosture(view: View){
        /** when next is clicked, check state of checkboxes and adjust global variable
         * rUpperArmScore accordingly */
        if ((lMidline.isChecked) || (lOutToSide.isChecked)) {
        GlobalVariables.lLowerArmScore += 1
        }

        /** moves to next page */
        val intent = Intent (this, LeftWristPosture::class.java)
        startActivity(intent)
        }

        fun backToLeftLowerArmPosture(view: View){
        val intent = Intent(this, LeftLowerArmPosture::class.java)
        startActivity(intent)
        }
        }
