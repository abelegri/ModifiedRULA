package com.example.modifiedrula

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.RadioButton

class NonArmMuscle : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_non_arm_muscle)
    }

    /** when any radio button is selected, it calls this function */
    fun onRadioButtonClicked(view: View){
        if (view is RadioButton){
            /** check if a button is selected */
            val checked = view.isChecked

            /** test value of radio button and assign corresponding points to rUpperArmScore */
            when (view.getId()){
                R.id.nonArmMuscleRadioYes ->
                    if (checked) {
                        GlobalVariables.nonArmMuscleScore = 1;
                    }
                R.id.nonArmMuscleRadioNo ->
                    if (checked) {
                        GlobalVariables.nonArmMuscleScore = 0;
                    }
            }
        }
    }

    fun toNonArmForce(view: View){
        val intent = Intent (this, NonArmForce::class.java)
        startActivity(intent)
    }

    fun backToLegSupport(view: View){
        val intent = Intent(this, LegSupport::class.java)
        startActivity(intent)
    }
}