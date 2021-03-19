package com.example.modifiedrula

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.RadioButton

class RightWristPosture : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_right_wrist_posture)
    }

    /** when any radio button is selected, it calls this function */
    fun onRadioButtonClicked(view: View){
        if (view is RadioButton){
            /** check if a button is selected */
            val checked = view.isChecked

            /** test value of radio button and assign corresponding points to rUpperArmScore */
            when (view.getId()){
                R.id.rWristRadioNeutral ->
                    if (checked) {
                        GlobalVariables.rWristScore = 1
                    }
                R.id.rWristRadioModerate ->
                    if (checked) {
                        GlobalVariables.rWristScore = 2
                    }
                R.id.rWristRadioExtreme ->
                    if (checked) {
                        GlobalVariables.rWristScore = 3
                    }
            }
        }
    }

    fun toRightWristAdjustment(view: View){
        val intent = Intent (this, RightWristAdjustment::class.java)
        startActivity(intent)
    }

    fun backToRightLowerArmAdjustment(view: View){
        val intent = Intent(this, RightLowerArmAdjustment::class.java)
        startActivity(intent)
    }
}