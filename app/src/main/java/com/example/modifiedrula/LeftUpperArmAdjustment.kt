package com.example.modifiedrula

import android.content.Intent
import android.os.Bundle
import android.view.View
import android.widget.CheckBox
import androidx.appcompat.app.AppCompatActivity

class LeftUpperArmAdjustment : AppCompatActivity() {
    /** creating local variables for checkboxes */
    lateinit var lShoulder: CheckBox
    lateinit var lAbducted: CheckBox
    lateinit var lSupport: CheckBox

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_left_upper_arm_adjustment)

        /** assign corresponding checkboxes to variables */
        lShoulder = findViewById(R.id.lUpperArmCheckShoulder)
        lAbducted = findViewById(R.id.lUpperArmCheckAbducted)
        lSupport = findViewById(R.id.lUpperArmCheckSupport)
    }

    fun toLeftLowerArmPosture(view: View){
        /** when next is clicked, check state of checkboxes and adjust global variable
         * lUpperArmScore accordingly */
        if (lShoulder.isChecked) {
            GlobalVariables.lUpperArmScore += 1
        }
        if (lAbducted.isChecked) {
            GlobalVariables.lUpperArmScore += 1
        }
        if (lSupport.isChecked) {
            GlobalVariables.lUpperArmScore -= 1
        }

        /** moves to next page */
        val intent = Intent (this, LeftLowerArmPosture::class.java)
        startActivity(intent)
    }

    fun backToLeftUpperArmPosture(view: View){
        val intent = Intent(this, LeftUpperArmPosture::class.java)
        startActivity(intent)
    }
}
