package com.example.mad_practical_9_21012021055

import android.graphics.drawable.AnimationDrawable
import android.media.Image
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView

class MainActivity : AppCompatActivity() {
    lateinit var alarmamimation:AnimationDrawable
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val alarmimage= findViewById<ImageView>(R.id.Alarmimage)
        alarmimage.setBackgroundResource(R.drawable.alarm_animation_list)
        alarmamimation=alarmimage.background as AnimationDrawable

    }

    override fun onWindowFocusChanged(hasFocus: Boolean) {
        if(hasFocus){
            alarmamimation.start()
        }
        else{
            alarmamimation.stop()
        }
        super.onWindowFocusChanged(hasFocus)
    }

}