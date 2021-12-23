package com.example.activitylifecyclebonus_mariam

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView
import java.util.*

class MainActivity : AppCompatActivity() {
    //Lifecycle>>
    //onCreate	  activity is first created.
   // onStart	 activity is becoming visible to the user.
   // onResume activity will start interacting with the user.
   // onPause	 when activity is not visible to the user.
    //onStop	 activity is no longer visible to the user.
   // onRestart	 after your activity is stopped, prior to start.
   // onDestroy	 before the activity is destroyed.
    lateinit var TxtView: TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        TxtView = findViewById(R.id.text)
    }

    override fun onResume() {    // onResume activity will start interacting with the user.

        super.onResume()
        TxtView.text = "${TxtView.text}Online\n"
    }

    override fun onStop() {     //onStop	 activity is no longer visible to the user.

        super.onStop()
        TxtView.text = "${TxtView.text} Last Seen ${Calendar.getInstance().time}\n"

    }

}