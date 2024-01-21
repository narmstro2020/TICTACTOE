package com.example.tictactoe

import android.annotation.SuppressLint
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.TextView

class MainActivity : AppCompatActivity() {

    private var currentMove = "X"
    private var gameWon = false

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    private fun changeCurrentMove() {
        if (currentMove == "X") {
            currentMove = "O"
        } else {
            currentMove = "X"
        }
    }




//    private fun checkRowForWin(): Boolean {
//        for (row in 0..2) {
//            if (buttonArray[3 * row] == buttonArray[3 * row + 1] && buttonArray[3 * row + 2] == buttonArray[2]) {
//                return true
//            }
//        }
//        return false
//    }
//
//    private fun checkColForWin(): Boolean {
//        for (col in 0..2) {
//            if (buttonArray[col] == buttonArray[col + 3] && buttonArray[col + 6] == buttonArray[2]) {
//                return true
//            }
//        }
//        return false
//    }
//
//    private fun checkLeftDiagForWin(): Boolean {
//        return buttonArray[0] == buttonArray[4] && buttonArray[0] == buttonArray[8]
//    }
//
//    private fun checkRightDiagForWin(): Boolean {
//        return buttonArray[2] == buttonArray[4] && buttonArray[2] == buttonArray[6]
//    }
//
//    private fun checkForWin(): Boolean {
//        return checkRowForWin() ||
//                checkColForWin() ||
//                checkLeftDiagForWin() ||
//                checkRightDiagForWin()
//    }
//
//    @SuppressLint("SetTextI18n")
//    private fun handleWin() {
//        winLoseText.text = "$currentMove Wins!"
//    }

    private fun handleMove() {
//        val win: Boolean = checkForWin()
//        if(win){
//            handleWin()
//        }
        changeCurrentMove()

    }



    fun buttonClick0(view: View) {
        var button : Button = findViewById(R.id.button0)
        if (button.text == "") {
            button.text = currentMove
            handleMove()
        }
    }

    fun buttonClick1(view: View) {
        var button : Button = findViewById(R.id.button1)
        if (button.text == "") {
            button.text = currentMove
            handleMove()
        }
    }

    fun buttonClick2(view: View) {
        var button : Button = findViewById(R.id.button2)
        if (button.text == "") {
            button.text = currentMove
            handleMove()
        }
    }

    fun buttonClick3(view: View) {
        var button : Button = findViewById(R.id.button3)
        if (button.text == "") {
            button.text = currentMove
            handleMove()
        }
    }

    fun buttonClick4(view: View) {
        var button : Button = findViewById(R.id.button4)
        if (button.text == "") {
            button.text = currentMove
            handleMove()
        }
    }

    fun buttonClick5(view: View) {
        var button : Button = findViewById(R.id.button5)
        if (button.text == "") {
            button.text = currentMove
            handleMove()
        }
    }

    fun buttonClick6(view: View) {
        var button : Button = findViewById(R.id.button6)
        if (button.text == "") {
            button.text = currentMove
            handleMove()
        }
    }

    fun buttonClick7(view: View) {
        var button : Button = findViewById(R.id.button7)
        if (button.text == "") {
            button.text = currentMove
            handleMove()
        }
    }

    fun buttonClick8(view: View) {
        var button : Button = findViewById(R.id.button8)
        if (button.text == "") {
            button.text = currentMove
            handleMove()
        }
    }


}