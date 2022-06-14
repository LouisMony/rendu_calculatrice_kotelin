package com.example.calculatrice

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    fun addition(view: View) {
        var number1: Int = if (number1.text.toString().isEmpty()) 0 else number1.text.toString().toInt()
        var number2: Int = if (number2.text.toString().isEmpty()) 0 else number2.text.toString().toInt()

        if (number1 == 0 && number2 == 0) {
            Toast.makeText(applicationContext,"Veuillez rentrer des valeurs",Toast.LENGTH_LONG).show()
        }
        else {
            var result: Int = number1 + number2
            textView2.setText(result.toString())
        }
    }
    fun produit(view: View) {
        var number1: Int = if (number1.text.toString().isEmpty()) 0 else number1.text.toString().toInt()
        var number2: Int = if (number2.text.toString().isEmpty()) 0 else number2.text.toString().toInt()

        if (number1 == 0 && number2 == 0) {
            Toast.makeText(applicationContext,"Veuillez rentrer des valeurs",Toast.LENGTH_LONG).show()
        }
        else {
            var result: Int = number1 * number2
            textView2.setText(result.toString())
        }
    }
    fun soustraction(view: View) {
        var number1: Int = if (number1.text.toString().isEmpty()) 0 else number1.text.toString().toInt()
        var number2: Int = if (number2.text.toString().isEmpty()) 0 else number2.text.toString().toInt()

        if (number1 == 0 && number2 == 0) {
            Toast.makeText(applicationContext,"Veuillez rentrer des valeurs",Toast.LENGTH_LONG).show()
        }
        else {
            var result: Int = number1 - number2
            textView2.setText(result.toString())
        }
    }
    fun division(view: View) {
        var number1: Int = if (number1.text.toString().isEmpty()) 0 else number1.text.toString().toInt()
        var number2: Int = if (number2.text.toString().isEmpty()) 0 else number2.text.toString().toInt()

        if (number1 == 0 && number2 == 0) {
            Toast.makeText(applicationContext,"Veuillez rentrer des valeurs",Toast.LENGTH_LONG).show()
        }
        else {
            var result: Int = number1 / number2
            textView2.setText(result.toString())
        }
    }
}