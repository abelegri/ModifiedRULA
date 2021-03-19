package com.example.modifiedrula

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.provider.Settings
import android.view.View
import android.widget.RadioButton
import android.widget.TextView


class LeftResults : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_left_results)


        /** get the final score for the left side **/
        val rowIndex3 = GlobalVariables.lArmAndWristScore
        val colIndex3 = GlobalVariables.nonArmScore
        GlobalVariables.finalScoreLeft = GlobalVariables.tableC[rowIndex3][colIndex3]

        /** get the values of the textView objects to change in following code **/
        val variableScore: TextView = findViewById<TextView>(R.id.variableScore)
        val variableActionLevel: TextView = findViewById<TextView>(R.id.variableActionLevel)
        val variableRequirement: TextView = findViewById<TextView>(R.id.variableRequirement)

        /** set string variables based on results **/

        /** action level 1 **/
        /** score 1 **/
        if (GlobalVariables.finalScoreLeft == 1) {
            variableScore.text = getString(R.string.score1)
            variableActionLevel.text = getString(R.string.AL1)
            variableRequirement.text = getString(R.string.requirement1)
        }
        /** score 2 **/
        if (GlobalVariables.finalScoreLeft == 2) {
            variableScore.text = getString(R.string.score2)
            variableActionLevel.text = getString(R.string.AL1)
            variableRequirement.text = getString(R.string.requirement1)
        }

        /** action level 2 **/
        /** score 3 **/
        if (GlobalVariables.finalScoreLeft == 3) {
            variableScore.text = getString(R.string.score3)
            variableActionLevel.text = getString(R.string.AL2)
            variableRequirement.text = getString(R.string.requirement2)
        }
        /** score 4 **/
        if (GlobalVariables.finalScoreLeft == 4) {
            variableScore.text = getString(R.string.score4)
            variableActionLevel.text = getString(R.string.AL2)
            variableRequirement.text = getString(R.string.requirement2)
        }

        /** action level 3 **/
        /** score 5 **/
        if (GlobalVariables.finalScoreLeft == 5) {
            variableScore.text = getString(R.string.score5)
            variableActionLevel.text = getString(R.string.AL3)
            variableRequirement.text = getString(R.string.requirement3)
        }
        /** score 6 **/
        if (GlobalVariables.finalScoreLeft == 6) {
            variableScore.text = getString(R.string.score6)
            variableActionLevel.text = getString(R.string.AL3)
            variableRequirement.text = getString(R.string.requirement3)
        }

        /** action level 4 **/
        /** score 7 **/
        if (GlobalVariables.finalScoreLeft == 7) {
            variableScore.text = getString(R.string.score7)
            variableActionLevel.text = getString(R.string.AL4)
            variableRequirement.text = getString(R.string.requirement4)
        }
    }

    fun newAssessment(view: View){
        val intent = Intent(this, ChooseSide::class.java)
        startActivity(intent)
    }
}