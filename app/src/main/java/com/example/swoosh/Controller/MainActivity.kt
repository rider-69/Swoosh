package com.example.swoosh.Controller

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import com.example.swoosh.R

class MainActivity : BaseActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.welcomeactivity)

         val getStarted:Button = findViewById(R.id.GetStartedbtn)
        getStarted.setOnClickListener {
               val LeagueIntent =  Intent(this, LeagueActivity::class.java )
              startActivity(LeagueIntent)
        }
    }
}