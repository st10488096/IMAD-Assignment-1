package com.example.mymealsuggestionapp

import android.annotation.SuppressLint
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity : AppCompatActivity() {
var typeinhere: EditText? = null
    var findmymealbutton: Button? = null
var resetbutton: Button? = null
var results: TextView? = null
    val breakfastmeal = "Breakfast"
    val brunchmeal = "Brunch"
    val lunchmeal = "Lunch"
    val dinnermeal = "Dinner"
    val dessertmeal = "Dessert"



    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)


        typeinhere = findViewById<View>(R.id.typeinhere) as EditText
        findmymealbutton = findViewById<View>(R.id.findmymealbutton) as Button
        resetbutton = findViewById<View>(R.id.resetbutton) as Button
        results = findViewById<View>(R.id.results) as TextView
/////////////////////////////////////////////////////////////////////////////////////////////////

        findmymealbutton!!.setOnClickListener{
            val typehere = typeinhere!!.text.toString()
            val meal:String

            if(typehere == breakfastmeal)
                typeinhere!!.setText("egg, toast, bacon, sausages as well as mushrooms\n coffee")


            else if (typehere == brunchmeal)
                typeinhere!!.setText("fluffy American-style pancakes covered in maple syrup")

            else if (typehere == lunchmeal)
                typeinhere!!.setText( "beef smashburgers")

            else if (typehere == dinnermeal)
                typeinhere!!.setText("indian style butter chicken\n rice")

            else if (typehere == dessertmeal)
                typeinhere!!.setText("spagetti with mince, tomato sauce and grated cheese")


            else
                print("Invalid Input")
            }

        ////////////////////////////////////////////////////////////////////////////////////


        resetbutton!!.setOnClickListener {
            typeinhere!!.setText("  ")
            results!!.setText("  ")
        }










        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
    }
}