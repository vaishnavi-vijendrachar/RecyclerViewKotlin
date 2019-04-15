package com.example.vaishnavi.recyclerviewkotlin

import android.app.IntentService
import android.content.Intent
import android.util.Log

class MyIntentService : IntentService("Intent Service"){
    override fun onHandleIntent(intent: Intent?) {

        val data = intent?.getStringExtra("data")
        Log.d("vish","ïntent recieved")
    }

}
