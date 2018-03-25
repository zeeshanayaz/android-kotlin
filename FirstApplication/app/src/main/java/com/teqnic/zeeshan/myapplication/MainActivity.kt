package com.teqnic.zeeshan.myapplication

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.TextView
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.textView

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main);

    }
    fun toastMe(view: View){

        val text = findViewById<TextView>(R.id.textView) as TextView;

        val myToast = Toast.makeText(this, "Hello, the above number is " + text.text.toString(), Toast.LENGTH_SHORT)

        myToast.show();
    }

    fun couneMe(view: View){
//        val showCountTextView = findViewById<View>(R.id.textView) as TextView
//
//        // Get the value of the text view.
//        val countString = showCountTextView.text.toString()
//
//        // Convert value to a number and increment it
//        var count: Int = Integer.parseInt(countString)
//        count++
//
//        // Display the new value in the text view.
//        showCountTextView.text = count.toString();

        val countString = textView.text.toString()
        var count: Int = Integer.parseInt(countString)
        count++
        textView.text = count.toString();
    }

    fun randomMe(view: View){
        // Create an Intent to start the second activity
        val randomIntent = Intent(this, SecondActivity::class.java)

        // Get the current value of the text view.
        val countString = textView.text.toString()

        // Convert the count to an int
        val count = Integer.parseInt(countString)

        // Add the count to the extras for the Intent.
        randomIntent.putExtra(SecondActivity.TOTAL_COUNT, count)

        // Start the new activity.
        startActivity(randomIntent)
    }
}
