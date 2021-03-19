package com.example.modifiedrula

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.RadioButton
import com.example.modifiedrula.GlobalVariables.Companion.lUpperArmScore

class LeftUpperArmPosture : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_left_upper_arm_posture)
    }

    /** when any radio button is selected, it calls this function */
    fun onRadioButtonClicked(view: View){
        if (view is RadioButton){
            /** check if a radio button is selected */
            val checked = view.isChecked

            /** test value of radio button and assign corresponding points to lUpperArmScore */
            when (view.getId()){
                R.id.lUpperArmRadioNeutral ->
                    if (checked) {
                        lUpperArmScore = 1
                    }
                R.id.lUpperArmRadioExtension ->
                    if (checked) {
                        lUpperArmScore = 2
                    }
                R.id.lUpperArmRadioLight ->
                    if (checked) {
                        lUpperArmScore = 2
                    }
                R.id.lUpperArmRadioModerate ->
                    if (checked) {
                        lUpperArmScore = 3
                    }
                R.id.lUpperArmRadioExtreme ->
                    if (checked) {
                        lUpperArmScore = 4
                    }
            }
        }
    }

    fun toLeftUpperArmAdjustment(view: View) {
        val intent = Intent (this, LeftUpperArmAdjustment::class.java)
        startActivity(intent)
    }

    fun backToChooseSide(view: View){
        val intent = Intent(this, ChooseSide::class.java)
        startActivity(intent)
    }


}