package com.example.modifiedrula

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.RadioButton
import com.example.modifiedrula.GlobalVariables.Companion.rUpperArmScore

class RightUpperArmPosture : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_right_upper_arm_posture)
    }

    fun onRadioButtonClicked(view: View){
        if (view is RadioButton){
            /** check if a radio button is selected */
            val checked = view.isChecked

            /** test value of radio button and assign corresponding points to rUpperArmScore */
            when (view.getId()){
                R.id.rUpperArmRadioNeutral ->
                    if (checked) {
                        rUpperArmScore = 1
                    }
                R.id.rUpperArmRadioExtension ->
                    if (checked) {
                        rUpperArmScore = 2
                    }
                R.id.rUpperArmRadioLight ->
                    if (checked) {
                        rUpperArmScore = 2
                    }
                R.id.rUpperArmRadioModerate ->
                    if (checked) {
                        rUpperArmScore = 3
                    }
                R.id.rUpperArmRadioExtreme ->
                    if (checked) {
                        rUpperArmScore = 4
                    }
            }
        }
    }

    fun toRightUpperArmAdjustment(view: View) {
        val intent = Intent(this, RightUpperArmAdjustment::class.java)
        startActivity(intent)
    }

    fun backToChooseSide(view: View){
        val intent = Intent(this, ChooseSide::class.java)
        startActivity(intent)
    }
}