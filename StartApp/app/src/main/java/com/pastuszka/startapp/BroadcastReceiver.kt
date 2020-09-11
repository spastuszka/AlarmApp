package com.pastuszka.startapp

import android.content.BroadcastReceiver
import android.content.Context
import android.content.Intent

import android.widget.Toast

open class BroadcastReceiver:BroadcastReceiver(){
    override fun onReceive(context: Context?, intent: Intent?) {

        if(intent!!.action.equals("com.pastuszka.alarmapp")){
            var b= intent.extras
//            Toast.makeText(context,b!!.getString("message"),Toast.LENGTH_LONG).show()

            val nofifyMe= Notifications()
            nofifyMe.Notify(context!!,b!!.getString("message").toString(),10)

        }else if(intent!!.action.equals("android.intent.action.BOOT_COMPLETED")){
            val saveData=SaveData(context!!)
            saveData.setAlarm()
        }
    }

}