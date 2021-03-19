package com.example.modifiedrula

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.RadioButton

class LeftArmMuscle : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_left_arm_muscle)
    }

    /** when any radio button is selected, it calls this function */
    fun onRadioButtonClicked(view: View){
        if (view is RadioButton){
            /** check if a button is selected */
            val checked = view.isChecked

            /** test value of radio button and assign corresponding points to rUpperArmScore */
            when (view.getId()){
                R.id.lArmAndWristMuscleRadioYes ->
                    if (checked) {
                        GlobalVariables.lArmMuscleScore = 1;
                    }
                R.id.lArmAndWristMuscleRadioNo ->
                    if (checked) {
                        GlobalVariables.lArmMuscleScore = 0;
                    }
            }
        }
    }

    fun toLeftArmForce(view: View){
        val intent = Intent (this, LeftArmForce::class.java)
        startActivity(intent)
    }

    fun backToLeftWristTwist(view: View){
        val intent = Intent(this, LeftWristTwist::class.java)
        startActivity(intent)
    }
}