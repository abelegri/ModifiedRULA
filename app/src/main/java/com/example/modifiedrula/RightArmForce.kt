package com.example.modifiedrula

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.provider.Settings
import android.view.View
import android.widget.RadioButton

class RightArmForce : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_right_arm_force)
    }

    /** when any radio button is selected, it calls this function */
    fun onRadioButtonClicked(view: View){
        if (view is RadioButton){
            /** check if a button is selected */
            val checked = view.isChecked

            /** test value of radio button and assign corresponding points to rUpperArmScore */
            when (view.getId()){
                R.id.rArmAndWristForceRadioLow ->
                    if (checked) {
                        GlobalVariables.rArmForceScore = 0;
                    }
                R.id.rArmAndWristForceRadioModerateIntermittent ->
                    if (checked) {
                        GlobalVariables.rArmForceScore = 1;
                    }
                R.id.rArmAndWristForceRadioModerateStatic ->
                    if (checked) {
                        GlobalVariables.rArmForceScore = 2;
                    }
                R.id.rArmAndWristForceRadioExtreme ->
                    if (checked) {
                        GlobalVariables.rArmForceScore = 3;
                    }
            }
        }
    }

    fun toNeckPosture(view: View){
        val intent = Intent (this, NeckPosture::class.java)

        /** calculate wrist and arm score */
        GlobalVariables.rArmAndWristScore = GlobalVariables.rArmAndWristPostureScore +
                GlobalVariables.rArmMuscleScore + GlobalVariables.rArmForceScore

        startActivity(intent)
    }

    fun backToRightArmMuscle(view: View){
        val intent = Intent(this, RightArmMuscle::class.java)
        startActivity(intent)
    }
}