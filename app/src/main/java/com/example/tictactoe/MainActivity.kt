package com.example.tictactoe

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button

class MainActivity : AppCompatActivity() {

    var currentMove = "X"

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    fun buttonClick0(view: View) {
        var button: Button = findViewById(R.id.button0)
        var text = button.text

        if (text == "") {
            button.text = currentMove

            if (currentMove == "X") {
                currentMove = "O"
            } else {
                currentMove = "X"
            }
        }
    }

    fun buttonClick1(view: View) {

    }
}