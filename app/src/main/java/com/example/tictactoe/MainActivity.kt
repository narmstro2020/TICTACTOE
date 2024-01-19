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

    private val winLoseText : TextView = findViewById(R.id.winLose)
    private val button0: Button = findViewById(R.id.button0)
    private val button1: Button = findViewById(R.id.button1)
    private val button2: Button = findViewById(R.id.button2)
    private val button3: Button = findViewById(R.id.button3)
    private val button4: Button = findViewById(R.id.button4)
    private val button5: Button = findViewById(R.id.button5)
    private val button6: Button = findViewById(R.id.button6)
    private val button7: Button = findViewById(R.id.button7)
    private val button8: Button = findViewById(R.id.button8)
    private val buttonArray = arrayOf(
        button0,
        button1,
        button2,
        button3,
        button4,
        button5,
        button6,
        button7,
        button8
    )

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




    private fun checkRowForWin(): Boolean {
        for (row in 0..2) {
            if (buttonArray[3 * row] == buttonArray[3 * row + 1] && buttonArray[3 * row + 2] == buttonArray[2]) {
                return true
            }
        }
        return false
    }

    private fun checkColForWin(): Boolean {
        for (col in 0..2) {
            if (buttonArray[col] == buttonArray[col + 3] && buttonArray[col + 6] == buttonArray[2]) {
                return true
            }
        }
        return false
    }

    private fun checkLeftDiagForWin(): Boolean {
        return buttonArray[0] == buttonArray[4] && buttonArray[0] == buttonArray[8]
    }

    private fun checkRightDiagForWin(): Boolean {
        return buttonArray[2] == buttonArray[4] && buttonArray[2] == buttonArray[6]
    }

    private fun checkForWin(): Boolean {
        return checkRowForWin() ||
                checkColForWin() ||
                checkLeftDiagForWin() ||
                checkRightDiagForWin()
    }

    @SuppressLint("SetTextI18n")
    private fun handleWin() {
        winLoseText.text = "$currentMove Wins!"
    }

    private fun handleMove() {
        val win: Boolean = checkForWin()
        if(win){
            handleWin()
        }
        changeCurrentMove()

    }



    fun buttonClick0(view: View) {
        if (button0.text == "") {
            button0.text = currentMove
            handleMove()
        }
    }

    fun buttonClick1(view: View) {
        if (button1.text == "") {
            button1.text = currentMove
            handleMove()
        }
    }

    fun buttonClick2(view: View) {
        if (button2.text == "") {
            button2.text = currentMove
            handleMove()
        }
    }

    fun buttonClick3(view: View) {
        if (button3.text == "") {
            button3.text = currentMove
            handleMove()
        }
    }

    fun buttonClick4(view: View) {
        if (button4.text == "") {
            button4.text = currentMove
            handleMove()
        }
    }

    fun buttonClick5(view: View) {
        if (button5.text == "") {
            button5.text = currentMove
            handleMove()
        }
    }

    fun buttonClick6(view: View) {
        if (button6.text == "") {
            button6.text = currentMove
            handleMove()
        }
    }

    fun buttonClick7(view: View) {
        if (button7.text == "") {
            button7.text = currentMove
            handleMove()
        }
    }

    fun buttonClick8(view: View) {
        if (button8.text == "") {
            button8.text = currentMove
            handleMove()
        }
    }


}