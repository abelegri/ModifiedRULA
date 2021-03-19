package com.example.modifiedrula

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.provider.Settings
import android.view.View
import android.widget.RadioButton
import android.widget.TextView


class BothResults : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_both_results)


        /** get the final score for the right side **/
        val rowIndex3 = GlobalVariables.rArmAndWristScore
        val colIndex3 = GlobalVariables.nonArmScore
        GlobalVariables.finalScoreRight = GlobalVariables.tableC[rowIndex3][colIndex3]

        /** get the values of the textView objects to change in following code **/
        val variableScoreRight: TextView = findViewById<TextView>(R.id.variableScoreRight)
        val variableActionLevelRight: TextView = findViewById<TextView>(R.id.variableActionLevelRight)
        val variableRequirementRight: TextView = findViewById<TextView>(R.id.variableRequirementRight)

        /** set string variables based on results **/

        /** action level 1 **/
        /** score 1 **/
        if (GlobalVariables.finalScoreRight == 1) {
            variableScoreRight.text = getString(R.string.score1)
            variableActionLevelRight.text = getString(R.string.AL1)
            variableRequirementRight.text = getString(R.string.requirement1)
        }
        /** score 2 **/
        if (GlobalVariables.finalScoreRight == 2) {
            variableScoreRight.text = getString(R.string.score2)
            variableActionLevelRight.text = getString(R.string.AL1)
            variableRequirementRight.text = getString(R.string.requirement1)
        }

        /** action level 2 **/
        /** score 3 **/
        if (GlobalVariables.finalScoreRight == 3) {
            variableScoreRight.text = getString(R.string.score3)
            variableActionLevelRight.text = getString(R.string.AL2)
            variableRequirementRight.text = getString(R.string.requirement2)
        }
        /** score 4 **/
        if (GlobalVariables.finalScoreRight == 4) {
            variableScoreRight.text = getString(R.string.score4)
            variableActionLevelRight.text = getString(R.string.AL2)
            variableRequirementRight.text = getString(R.string.requirement2)
        }

        /** action level 3 **/
        /** score 5 **/
        if (GlobalVariables.finalScoreRight == 5) {
            variableScoreRight.text = getString(R.string.score5)
            variableActionLevelRight.text = getString(R.string.AL3)
            variableRequirementRight.text = getString(R.string.requirement3)
        }
        /** score 6 **/
        if (GlobalVariables.finalScoreRight == 6) {
            variableScoreRight.text = getString(R.string.score6)
            variableActionLevelRight.text = getString(R.string.AL3)
            variableRequirementRight.text = getString(R.string.requirement3)
        }

        /** action level 4 **/
        /** score 7 **/
        if (GlobalVariables.finalScoreRight == 7) {
            variableScoreRight.text = getString(R.string.score7)
            variableActionLevelRight.text = getString(R.string.AL4)
            variableRequirementRight.text = getString(R.string.requirement4)
        }

        
        
        /** get the final score for the left side **/
        val rowIndex4 = GlobalVariables.lArmAndWristScore
        val colIndex4 = GlobalVariables.nonArmScore
        GlobalVariables.finalScoreLeft = GlobalVariables.tableC[rowIndex4][colIndex4]

        /** get the values of the textView objects to change in following code **/
        val variableScoreLeft: TextView = findViewById<TextView>(R.id.variableScoreLeft)
        val variableActionLevelLeft: TextView = findViewById<TextView>(R.id.variableActionLevelLeft)
        val variableRequirementLeft: TextView = findViewById<TextView>(R.id.variableRequirementLeft)

        /** set string variables based on results **/

        /** action level 1 **/
        /** score 1 **/
        if (GlobalVariables.finalScoreLeft == 1) {
            variableScoreLeft.text = getString(R.string.score1)
            variableActionLevelLeft.text = getString(R.string.AL1)
            variableRequirementLeft.text = getString(R.string.requirement1)
        }
        /** score 2 **/
        if (GlobalVariables.finalScoreLeft == 2) {
            variableScoreLeft.text = getString(R.string.score2)
            variableActionLevelLeft.text = getString(R.string.AL1)
            variableRequirementLeft.text = getString(R.string.requirement1)
        }

        /** action level 2 **/
        /** score 3 **/
        if (GlobalVariables.finalScoreLeft == 3) {
            variableScoreLeft.text = getString(R.string.score3)
            variableActionLevelLeft.text = getString(R.string.AL2)
            variableRequirementLeft.text = getString(R.string.requirement2)
        }
        /** score 4 **/
        if (GlobalVariables.finalScoreLeft == 4) {
            variableScoreLeft.text = getString(R.string.score4)
            variableActionLevelLeft.text = getString(R.string.AL2)
            variableRequirementLeft.text = getString(R.string.requirement2)
        }

        /** action level 3 **/
        /** score 5 **/
        if (GlobalVariables.finalScoreLeft == 5) {
            variableScoreLeft.text = getString(R.string.score5)
            variableActionLevelLeft.text = getString(R.string.AL3)
            variableRequirementLeft.text = getString(R.string.requirement3)
        }
        /** score 6 **/
        if (GlobalVariables.finalScoreLeft == 6) {
            variableScoreLeft.text = getString(R.string.score6)
            variableActionLevelLeft.text = getString(R.string.AL3)
            variableRequirementLeft.text = getString(R.string.requirement3)
        }

        /** action level 4 **/
        /** score 7 **/
        if (GlobalVariables.finalScoreLeft == 7) {
            variableScoreLeft.text = getString(R.string.score7)
            variableActionLevelLeft.text = getString(R.string.AL4)
            variableRequirementLeft.text = getString(R.string.requirement4)
        }
    }

    fun newAssessment(view: View){
        val intent = Intent(this, ChooseSide::class.java)
        startActivity(intent)
    }
}