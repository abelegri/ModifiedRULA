package com.example.modifiedrula

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Toast

class ChooseSide : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_choose_side)
        /** on return to this page, assessmentType is reset. All variables used throughout are declared
         * in the GlobalVariables file, and are reference in other activities as
         * GlobalVariables.VariableName */
        GlobalVariables.assessmentType = 0
    }

    /** called when the user taps the Right Side button (ref: 'activity_choose_side.xml' line 14) */
    fun rightArm(view: View){
        val intent = Intent (this, RightUpperArmPosture::class.java)
        GlobalVariables.assessmentType = 1
        Toast.makeText(this, "Assessment Type 1", Toast.LENGTH_LONG).show()

        startActivity(intent)
    }
    /** called when the user taps the Left Side button (ref: 'activity_choose_side.xml' line 26) */
    fun leftArm(view: View){
        val intent = Intent (this, LeftUpperArmPosture::class.java)
        GlobalVariables.assessmentType = 2
        Toast.makeText(this, "Assessment Type 2", Toast.LENGTH_LONG).show()

        startActivity(intent)
    }
    /** called when the user taps the Both button (ref: 'activity_choose_side.xml' line 38) */
    fun bothArm(view: View){
        val intent = Intent(this, RightUpperArmPosture::class.java)
        GlobalVariables.assessmentType = 3
        Toast.makeText(this, "Assessment Type 3", Toast.LENGTH_LONG).show()

        startActivity(intent)
    }

}