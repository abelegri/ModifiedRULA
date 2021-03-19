package com.example.modifiedrula

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.provider.Settings
import android.view.View
import android.widget.RadioButton

class LeftArmForce : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_left_arm_force)
    }

    /** when any radio button is selected, it calls this function */
    fun onRadioButtonClicked(view: View){
        if (view is RadioButton){
            /** check if a button is selected */
            val checked = view.isChecked

            /** test value of radio button and assign corresponding points to ArmForceScore */
            when (view.getId()){
                R.id.lArmAndWristForceRadioLow ->
                    if (checked) {
                        GlobalVariables.lArmForceScore = 0;
                    }
                R.id.lArmAndWristForceRadioModerateIntermittent ->
                    if (checked) {
                        GlobalVariables.lArmForceScore = 1;
                    }
                R.id.lArmAndWristForceRadioModerateStatic ->
                    if (checked) {
                        GlobalVariables.lArmForceScore = 2;
                    }
                R.id.lArmAndWristForceRadioExtreme ->
                    if (checked) {
                        GlobalVariables.lArmForceScore = 3;
                    }
            }
        }
    }

    fun toNeckPosture(view: View){
        val intent = Intent (this, NeckPosture::class.java)

        /** calculate wrist and arm score */
        GlobalVariables.lArmAndWristScore = GlobalVariables.lArmAndWristPostureScore +
                GlobalVariables.lArmMuscleScore + GlobalVariables.lArmForceScore

        startActivity(intent)
    }

    fun backToLeftArmMuscle(view: View){
        val intent = Intent(this, LeftArmMuscle::class.java)
        startActivity(intent)
    }
}