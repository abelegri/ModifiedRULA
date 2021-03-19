package com.example.modifiedrula

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.provider.Settings
import android.view.View
import android.widget.RadioButton

class TrunkPosture : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_trunk_posture)
    }

    /** when any radio button is selected, it calls this function */
    fun onRadioButtonClicked(view: View){
        if (view is RadioButton){
            /** check if a button is selected */
            val checked = view.isChecked

            /** test value of radio button and assign corresponding points to rUpperArmScore */
            when (view.getId()){
                R.id.trunkRadioNeutral ->
                    if (checked) {
                        GlobalVariables.trunkScore = 1
                    }
                R.id.trunkRadioLight ->
                    if (checked) {
                        GlobalVariables.trunkScore = 2
                    }
                R.id.trunkRadioModerate ->
                    if (checked) {
                        GlobalVariables.trunkScore = 3
                    }
                R.id.trunkRadioExtreme ->
                    if (checked) {
                        GlobalVariables.trunkScore = 4
                    }
            }
        }
    }

    fun toTrunkAdjust(view: View){
        val intent = Intent (this, TrunkAdjustment::class.java)
        startActivity(intent)
    }

    fun backToNeckAdjust(view: View){
        val intent = Intent(this, NeckAdjustment::class.java)
        startActivity(intent)
    }


}