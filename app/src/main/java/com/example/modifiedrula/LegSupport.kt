package com.example.modifiedrula

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.provider.Settings
import android.view.View
import android.widget.RadioButton

class LegSupport : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_leg_support)
    }

    /** when any radio button is selected, it calls this function */
    fun onRadioButtonClicked(view: View){
        if (view is RadioButton){
            /** check if a button is selected */
            val checked = view.isChecked

            /** test value of radio button and assign corresponding points to rUpperArmScore */
            when (view.getId()){
                R.id.legRadioYes ->
                    if (checked) {
                        GlobalVariables.legScore = 1;
                    }
                R.id.legRadioNo ->
                    if (checked) {
                        GlobalVariables.legScore = 2;
                    }
            }
        }
    }

    fun toNonArmMuscle(view: View){
        val intent = Intent (this, NonArmMuscle::class.java)

        /** we now have all needed information to utilize table B, again reference TODO document
         * for more information on the calculation and table utilization
         */

        /** this equation combines the trunk score and leg scores to obtain a column index
         *  for Table B. For example, a trunk score of 1 and a leg score of 1 would return
         *  0, as Kotlin is a 0 based language. A trunk of 6 and a leg score of 2 would return 11 */
        val columnIndex2 = (GlobalVariables.trunkScore) * 2 + (GlobalVariables.legScore) - 3

        /** this equation calculates the row index, which is simply the neck score minus 1 to get
         * the zero-based row */
        val rowIndex2 = (GlobalVariables.neckScore) - 1

        GlobalVariables.nonArmPostureScore = GlobalVariables.tableB[rowIndex2][columnIndex2]
        startActivity(intent)
    }

    fun backToTrunkAdjustment(view: View){
        val intent = Intent(this, TrunkAdjustment::class.java)
        startActivity(intent)
    }


}