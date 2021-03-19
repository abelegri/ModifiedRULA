package com.example.modifiedrula

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.provider.Settings
import android.view.View
import android.widget.RadioButton

class NeckPosture : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_neck_posture)
    }

    /** when any radio button is selected, it calls this function */
    fun onRadioButtonClicked(view: View){
        if (view is RadioButton){
            /** check if a button is selected */
            val checked = view.isChecked

            /** test value of radio button and assign corresponding points to rUpperArmScore */
            when (view.getId()){
                R.id.neckRadioNeutral ->
                    if (checked) {
                        GlobalVariables.neckScore = 1;
                    }
                R.id.neckRadioLight ->
                    if (checked) {
                        GlobalVariables.neckScore = 2;
                    }
                R.id.neckRadioModerate ->
                    if (checked) {
                        GlobalVariables.neckScore = 3;
                    }
                R.id.neckRadioExtension ->
                    if (checked) {
                        GlobalVariables.neckScore = 4;
                    }
            }
        }
    }

    fun toNeckAdjust(view: View){
        val intent = Intent (this, NeckAdjustment::class.java)
        startActivity(intent)
    }

    fun backToArmForce(view: View){

        /** this back button is a little more complicated, as we have to determine whether to go
         * back to the right or left arm depending on which arm we evaluate
         */
        if (GlobalVariables.assessmentType == 1) {
            val intent = Intent(this, RightArmForce::class.java)
            startActivity(intent)
        }

        //FIXME make Left Arm Force class and xml
        if (GlobalVariables.assessmentType == 2) {
            val intent = Intent(this, LeftArmForce::class.java)
            startActivity(intent)
        }
        if (GlobalVariables.assessmentType == 3) {
            val intent = Intent(this, LeftArmForce::class.java)
            startActivity(intent)
        }
    }


}