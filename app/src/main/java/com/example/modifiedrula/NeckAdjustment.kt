package com.example.modifiedrula

import android.content.Intent
import android.os.Bundle
import android.view.View
import android.widget.CheckBox
import androidx.appcompat.app.AppCompatActivity

class NeckAdjustment : AppCompatActivity() {
    /** creating local variables for checkboxes */
    lateinit var neckTwist: CheckBox
    lateinit var neckBend: CheckBox

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_neck_adjustment)

        /** assign corresponding checkboxes to variables */
        neckTwist = findViewById(R.id.neckCheckTwist)
        neckBend = findViewById(R.id.neckCheckBending)
    }

    fun toTrunkPosture(view: View){
        /** when next is clicked, check state of checkboxes and adjust global variable
         * rUpperArmScore accordingly */
        if (neckTwist.isChecked) {
            GlobalVariables.neckScore += 1
        }
        if (neckBend.isChecked) {
            GlobalVariables.neckScore += 1
        }

        /** moves to next page */
        val intent = Intent (this, TrunkPosture::class.java)
        startActivity(intent)
    }

    fun backToNeckPosture(view: View){
        val intent = Intent(this, NeckPosture::class.java)
        startActivity(intent)
    }
}
