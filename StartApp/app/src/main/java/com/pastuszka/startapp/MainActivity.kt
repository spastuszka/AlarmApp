package com.pastuszka.startapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import androidx.fragment.app.FragmentManager
import kotlinx.android.synthetic.main.activity_main.*



class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        val saveData=SaveData(applicationContext)
        tvShowtime.text = saveData.getHour().toString() + ":" + saveData.getMinute().toString()

    }

    open fun show(p0:FragmentManager, p1:String){

    }

    fun BuSetTime(view: View){

        val popTime = PopTime()
        val fm = supportFragmentManager
        popTime.show(fm,"Select time")



    }

    fun setTime(Hours:Int, Minutes:Int){

        tvShowtime.text = Hours.toString() + ":" + Minutes.toString()
        val saveData=SaveData(applicationContext)
        saveData.SaveData(Hours,Minutes)
        saveData.setAlarm()
        
    }
}
