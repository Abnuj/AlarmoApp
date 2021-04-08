package com.abnuj.alarmoapp

import android.os.Bundle
import android.widget.TextView
import android.widget.TimePicker
import androidx.appcompat.app.AppCompatActivity
import androidx.fragment.app.DialogFragment
import com.google.android.material.timepicker.MaterialTimePicker
import com.google.android.material.timepicker.TimeFormat

class MainActivity : AppCompatActivity() {
    lateinit var timePicker: TimePicker
    lateinit var timetv: TextView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        timetv = findViewById(R.id.timeTv)

        val picker:MaterialTimePicker = MaterialTimePicker.Builder()
            .setTimeFormat(TimeFormat.CLOCK_12H)
            .setHour(12)
            .setTitleText("Select your alarm")
            .build()

        timetv.setOnClickListener {
            picker.show(supportFragmentManager, "tagg")
        }

    }


}