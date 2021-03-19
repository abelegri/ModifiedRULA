package com.example.modifiedrula

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.provider.Settings
import android.view.View
import android.widget.RadioButton

class LeftWristTwist : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_left_wrist_twist)
    }

    /** when any radio button is selected, it calls this function */
    fun onRadioButtonClicked(view: View){
        if (view is RadioButton){
            /** check if a button is selected */
            val checked = view.isChecked

            /** test value of radio button and assign corresponding points to rUpperArmScore */
            when (view.getId()){
                R.id.lWristTwistRadioMidRange ->
                    if (checked) {
                        GlobalVariables.lWristTwistScore = 1;
                    }
                R.id.lWristTwistRadioEndRange ->
                    if (checked) {
                        GlobalVariables.lWristTwistScore = 2;
                    }
            }
        }
    }

    fun toLeftArmMuscle(view: View){
        val intent = Intent (this, LeftArmMuscle::class.java)

        /** before moving on, we now have all the variables we need to use Table A and get
         * an overall left arm and wrist posture score. Table A is found with the other
         * Global Variables and is an 18 row, 8 column array.
         * FIXME: point to document where more details on the index equations can be found */

        /** this equation combines the upper arm and lower arm scores to obtain a row index for
         *  Table A. For example, an Upper Arm score of 1 and a Lower Arm score of 1 would return 0,
         *  as Kotlin is a 0 based language. An Upper Arm score of 6 and Lower Arm score of 3 would
         *  return a 17. */
        val rowIndex = (GlobalVariables.lUpperArmScore) * 3 + (GlobalVariables.lLowerArmScore) - 4


        /** this equation combines the wrist score and wrist twist scores to obtain a column index
         *  for Table A. For example, a wrist score of 1 and a wrist twist score of 1 would return
         *  0, as Kotlin is a 0 based language. A wrist score of 4 and a wrist twist score of 2
         *  would return 7. */
        val columnIndex = (GlobalVariables.lWristScore) * 2 + (GlobalVariables.lWristTwistScore) - 3

        /** this will use the calculated indices to get the overall arm and wrist posture score from
         *  table A */
        GlobalVariables.lArmAndWristPostureScore = GlobalVariables.tableA[rowIndex][columnIndex]
        startActivity(intent)
    }

    fun backToLeftWristAdjustment(view: View){
        val intent = Intent(this, LeftWristAdjustment::class.java)
        startActivity(intent)
    }
}