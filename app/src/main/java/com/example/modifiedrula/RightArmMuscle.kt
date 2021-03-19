package com.example.modifiedrula

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.RadioButton

class RightArmMuscle : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_right_arm_muscle)
    }

    /** when any radio button is selected, it calls this function */
    fun onRadioButtonClicked(view: View){
        if (view is RadioButton){
            /** check if a button is selected */
            val checked = view.isChecked

            /** test value of radio button and assign corresponding points to rUpperArmScore */
            when (view.getId()){
                R.id.rArmAndWristMuscleRadioYes ->
                    if (checked) {
                        GlobalVariables.rArmMuscleScore = 1
                    }
                R.id.rArmAndWristMuscleRadioNo ->
                    if (checked) {
                        GlobalVariables.rArmMuscleScore = 0
                    }
            }
        }
    }

    fun toRightArmForce(view: View){
        val intent = Intent (this, RightArmForce::class.java)
        startActivity(intent)
    }

    fun backToRightWristTwist(view: View){
        val intent = Intent(this, RightWristTwist::class.java)
        startActivity(intent)
    }
}