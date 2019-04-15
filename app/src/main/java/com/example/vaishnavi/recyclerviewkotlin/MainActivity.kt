package com.example.vaishnavi.recyclerviewkotlin

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val intent = Intent(this,MyIntentService::class.java)
        intent.putExtra("data","Intent Service to handle stuff")
        startService(intent)
    }
}
