package com.example.custmizedalertbox


import android.app.Dialog
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MainActivity : AppCompatActivity() {

    // Cerate a vertical of type Dailog

    lateinit var  dialog :Dialog

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var mvButton = findViewById<Button>(R.id.btnClick)

        dialog = Dialog(this)
        dialog.setContentView(R.layout.custom_dialogue )

        //creating variable for the custom dialog box

        var buttonGood =dialog.findViewById<Button>(R.id.btnGood)
        var buttonFeedback = dialog.findViewById<Button>(R.id.btnFeedback)

        buttonGood.setOnClickListener {
            dialog.dismiss()
        }

        buttonFeedback.setOnClickListener {
            //intents or Toast message
        }

        mvButton.setOnClickListener {
            dialog.show()
        }
    }
}