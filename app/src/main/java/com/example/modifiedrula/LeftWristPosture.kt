package com.example.modifiedrula

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.RadioButton

class LeftWristPosture : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_left_wrist_posture)
    }

    /** when any radio button is selected, it calls this function */
    fun onRadioButtonClicked(view: View){
        if (view is RadioButton){
            /** check if a button is selected */
            val checked = view.isChecked

            /** test value of radio button and assign corresponding points to rUpperArmScore */
            when (view.getId()){
                R.id.lWristRadioNeutral ->
                    if (checked) {
                        GlobalVariables.lWristScore = 1
                    }
                R.id.lWristRadioModerate ->
                    if (checked) {
                        GlobalVariables.lWristScore = 2
                    }
                R.id.lWristRadioExtreme ->
                    if (checked) {
                        GlobalVariables.lWristScore = 3
                    }
            }
        }
    }

    fun toLeftWristAdjustment(view: View){
        val intent = Intent (this, LeftWristAdjustment::class.java)
        startActivity(intent)
    }

    fun backToLeftLowerArmAdjustment(view: View){
        val intent = Intent(this, LeftLowerArmAdjustment::class.java)
        startActivity(intent)
    }
}