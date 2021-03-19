package com.example.modifiedrula

import android.content.Intent
import android.os.Bundle
import android.view.View
import android.widget.CheckBox
import androidx.appcompat.app.AppCompatActivity

class TrunkAdjustment : AppCompatActivity() {
    /** creating local variables for checkboxes */
    lateinit var trunkTwist: CheckBox
    lateinit var trunkBend: CheckBox

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_trunk_adjustment)

        /** assign corresponding checkboxes to variables */
        trunkTwist = findViewById(R.id.trunkCheckTwist)
        trunkBend = findViewById(R.id.trunkCheckBending)
    }

    fun toLegSupport(view: View){
        /** when next is clicked, check state of checkboxes and adjust global variable
         * rUpperArmScore accordingly */
        if (trunkTwist.isChecked) {
            GlobalVariables.trunkScore += 1
        }
        if (trunkBend.isChecked) {
            GlobalVariables.trunkScore += 1
        }

        /** moves to next page */
        val intent = Intent (this, LegSupport::class.java)
        startActivity(intent)
    }

    fun backToTrunkPosture(view: View){
        val intent = Intent(this, TrunkPosture::class.java)
        startActivity(intent)
    }
}
