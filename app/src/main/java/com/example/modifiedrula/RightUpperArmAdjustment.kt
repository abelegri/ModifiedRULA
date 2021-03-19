package com.example.modifiedrula

import android.content.Intent
import android.os.Bundle
import android.view.View
import android.widget.CheckBox
import androidx.appcompat.app.AppCompatActivity

class RightUpperArmAdjustment : AppCompatActivity() {
    /** creating local variables for checkboxes */
    lateinit var rShoulder: CheckBox
    lateinit var rAbducted: CheckBox
    lateinit var rSupport: CheckBox

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_right_upper_arm_adjustment)

        /** assign corresponding checkboxes to variables */
        rShoulder = findViewById(R.id.rUpperArmCheckShoulder)
        rAbducted = findViewById(R.id.rUpperArmCheckAbducted)
        rSupport = findViewById(R.id.rUpperArmCheckSupport)
    }

    fun toRightLowerArmPosture(view: View){
        /** when next is clicked, check state of checkboxes and adjust global variable
         * rUpperArmScore accordingly */
        if (rShoulder.isChecked) {
            GlobalVariables.rUpperArmScore += 1
        }
        if (rAbducted.isChecked) {
            GlobalVariables.rUpperArmScore += 1
        }
        if (rSupport.isChecked) {
            GlobalVariables.rUpperArmScore -= 1
        }

        /** moves to next page */
        val intent = Intent (this, RightLowerArmPosture::class.java)
        startActivity(intent)
    }

    fun backToRightUpperArmPosture(view: View){
        val intent = Intent(this, RightUpperArmPosture::class.java)
        startActivity(intent)
    }
}
