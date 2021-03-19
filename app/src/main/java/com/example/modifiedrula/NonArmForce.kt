package com.example.modifiedrula

import android.content.Intent
import android.os.Bundle
import android.view.View
import android.widget.RadioButton
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity

class NonArmForce : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_non_arm_force)
    }


    /** TODO FIX THIS!!! **/
    /** when any radio button is selected, it calls this function */
    fun onRadioButtonClicked(view: View){
        if (view is RadioButton){
            /** check if a button is selected */
            val checked = view.isChecked

            /** test value of radio button and assign corresponding points to nonArmForceScore */
            when (view.getId()){
                R.id.nonArmForceRadioLow ->
                    if (checked) {
                        GlobalVariables.nonArmForceScore = 0
                    }
                R.id.nonArmForceRadioModerateIntermittent ->
                    if (checked) {
                        GlobalVariables.nonArmForceScore = 1
                    }
                R.id.nonArmForceRadioModerateStatic ->
                    if (checked) {
                        GlobalVariables.nonArmForceScore = 2
                    }
                R.id.nonArmForceRadioExtreme ->
                    if (checked) {
                        GlobalVariables.nonArmForceScore = 3
                    }
            }
        }
    }

    fun toResults(view: View){
        /** calculate non arm score */
        GlobalVariables.nonArmScore = GlobalVariables.nonArmPostureScore +
                GlobalVariables.nonArmMuscleScore + GlobalVariables.nonArmForceScore

        when (GlobalVariables.assessmentType) {
            1 -> {
                val intent = Intent (this, RightResults::class.java)
                startActivity(intent)
            }
            2 -> {
                val intent = Intent (this, LeftResults::class.java)
                startActivity(intent)
            }
            3 -> {
                val intent = Intent (this, BothResults::class.java)
                startActivity(intent)
            }
            else -> {
                Toast.makeText(this, "No assessment type", Toast.LENGTH_LONG).show()
            }
        }

    }

    fun backToNonArmMuscle(view: View){
        val intent = Intent(this, NonArmMuscle::class.java)
        startActivity(intent)
    }
}