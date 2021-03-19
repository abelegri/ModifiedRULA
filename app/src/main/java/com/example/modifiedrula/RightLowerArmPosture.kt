package com.example.modifiedrula

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.RadioButton

class RightLowerArmPosture : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_right_lower_arm_posture)
    }

    /** when any radio button is selected, it calls this function */
    fun onRadioButtonClicked(view: View){
        if (view is RadioButton){
            /** check if a button is selected */
            val checked = view.isChecked

            /** test value of radio button and assign corresponding points to rUpperArmScore */
            when (view.getId()){
                R.id.rLowerArmRadioNeutral ->
                    if (checked) {
                        GlobalVariables.rLowerArmScore = 1
                    }
                R.id.rLowerArmRadioExtension ->
                    if (checked) {
                        GlobalVariables.rLowerArmScore = 2
                    }
                R.id.rLowerArmRadioFlexion ->
                    if (checked) {
                        GlobalVariables.rLowerArmScore = 2
                    }
            }
        }
    }

    fun toRightLowerArmAdjustment(view: View){
        val intent = Intent (this, RightLowerArmAdjustment::class.java)
        startActivity(intent)
    }

    fun backToRightUpperArmAdjustment(view: View){
        val intent = Intent(this, RightUpperArmAdjustment::class.java)
        startActivity(intent)
    }


}