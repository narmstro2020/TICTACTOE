package com.example.tictactoe

import android.annotation.SuppressLint
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.TextView
import org.w3c.dom.Text

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




    private fun checkRowForWin(buttonArray : Array<CharSequence>): Boolean {
        for (row in 0..2) {
            if (buttonArray[3 * row] == buttonArray[3 * row + 1] && buttonArray[3 * row] == buttonArray[3 * row + 2] && buttonArray[3 * row] != "") {
                return true
            }
        }
        return false
    }

    private fun checkColForWin(buttonArray : Array<CharSequence>): Boolean {
        for (col in 0..2) {
            if (buttonArray[col] == buttonArray[col + 3] && buttonArray[col] == buttonArray[col + 6] && buttonArray[col] != "") {
                return true
            }
        }
        return false
    }

    private fun checkLeftDiagForWin(buttonArray : Array<CharSequence>): Boolean {
        return buttonArray[0] == buttonArray[4] && buttonArray[0] == buttonArray[8] && buttonArray[0] != ""
    }

    private fun checkRightDiagForWin(buttonArray : Array<CharSequence>): Boolean {
        return buttonArray[2] == buttonArray[4] && buttonArray[2] == buttonArray[6] && buttonArray[2] != ""
    }

    private fun checkForWin(): Boolean {
    var button0 : Button = findViewById(R.id.button0)
    var button1 : Button = findViewById(R.id.button1)
    var button2 : Button = findViewById(R.id.button2)
    var button3 : Button = findViewById(R.id.button3)
    var button4 : Button = findViewById(R.id.button4)
    var button5 : Button = findViewById(R.id.button5)
    var button6 : Button = findViewById(R.id.button6)
    var button7 : Button = findViewById(R.id.button7)
    var button8 : Button = findViewById(R.id.button8)
    var buttonArray : Array<CharSequence> = arrayOf(
        button0.text, button1.text, button2.text, button3.text, button4.text, button5.text, button6.text, button7.text, button8.text)


    return checkRowForWin(buttonArray) ||
                checkColForWin(buttonArray) ||
                checkLeftDiagForWin(buttonArray) ||
                checkRightDiagForWin(buttonArray)
    }

    @SuppressLint("SetTextI18n")
    private fun handleWin() {
        val winLoseText : TextView = findViewById(R.id.winLose)
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
        var button : Button = findViewById(R.id.button0)
        var text : TextView = findViewById(R.id.winLose)
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