package com.example.modifiedrula

import android.app.Application

public class GlobalVariables : Application() {
    companion object {

        /** assessment type is a variable that is assigned based on which assessment we choose
         * (right, left or both)
         * right = 1
         * left = 2
         * both = 3
         */
        var assessmentType:Int = 0


        var rUpperArmScore:Int = 0
        var lUpperArmScore:Int = 0
        var rLowerArmScore:Int = 0
        var lLowerArmScore:Int = 0

        var rWristScore:Int = 0
        var lWristScore:Int = 0
        var rWristTwistScore:Int = 0
        var lWristTwistScore:Int = 0
        var rArmAndWristPostureScore:Int = 0
        var lArmAndWristPostureScore:Int = 0

        var rArmMuscleScore:Int = 0
        var lArmMuscleScore:Int = 0
        var rArmForceScore:Int = 0
        var lArmForceScore:Int = 0

        var rArmAndWristScore:Int = 0
        var lArmAndWristScore:Int = 0

        var neckScore:Int = 0
        var trunkScore:Int = 0
        var legScore:Int = 0
        var nonArmPostureScore:Int = 0
        var nonArmMuscleScore:Int = 0
        var nonArmForceScore:Int = 0
        var nonArmScore:Int = 0

        var finalScoreRight:Int = 0
        var finalScoreLeft:Int = 0

        var tableA = arrayOf(
                arrayOf(1,2,2,2,2,3,3,3),
                arrayOf(2,2,2,2,3,3,3,3),
                arrayOf(2,3,3,3,3,3,4,4),

                arrayOf(2,3,3,3,3,4,4,4),
                arrayOf(3,3,3,3,3,4,4,4),
                arrayOf(3,4,4,4,4,4,5,5),

                arrayOf(3,3,4,4,4,4,5,5),
                arrayOf(3,4,4,4,4,4,5,5),
                arrayOf(4,4,4,4,4,5,5,5),

                arrayOf(4,4,4,4,4,5,5,5),
                arrayOf(4,4,4,4,4,5,5,5),
                arrayOf(4,4,4,5,5,5,6,6),

                arrayOf(5,5,5,5,5,6,6,7),
                arrayOf(5,6,6,6,6,7,7,7),
                arrayOf(6,6,6,7,7,7,7,8),

                arrayOf(7,7,7,7,7,8,8,9),
                arrayOf(8,8,8,8,8,9,9,9),
                arrayOf(9,9,9,9,9,9,9,9))

        var tableB = arrayOf(
                arrayOf(1,3,2,3,3,4,5,5,6,6,7,7),
                arrayOf(2,3,2,3,4,5,5,5,6,7,7,7),
                arrayOf(3,3,3,4,4,5,5,6,6,7,7,7),
                arrayOf(5,5,5,6,6,7,7,7,7,7,8,8),
                arrayOf(7,7,7,7,7,8,8,8,8,8,8,8),
                arrayOf(8,8,8,8,8,8,8,9,9,9,9,9))

        var tableC = arrayOf(
                arrayOf(1,2,3,3,4,5,5),
                arrayOf(2,2,3,4,4,5,5),
                arrayOf(3,3,3,4,4,5,6),
                arrayOf(3,3,3,4,5,6,6),
                arrayOf(4,4,4,5,6,7,7),
                arrayOf(4,4,5,6,6,7,7),
                arrayOf(5,5,6,6,7,7,7),
                arrayOf(5,5,6,7,7,7,7),
                arrayOf(5,5,6,7,7,7,7),
                arrayOf(5,5,6,7,7,7,7),
                arrayOf(5,5,6,7,7,7,7),
                arrayOf(5,5,6,7,7,7,7),
                arrayOf(5,5,6,7,7,7,7),
                arrayOf(5,5,6,7,7,7,7))
    }
}


