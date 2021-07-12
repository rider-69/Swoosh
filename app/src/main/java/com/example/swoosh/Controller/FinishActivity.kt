package com.example.swoosh.Controller

import android.annotation.SuppressLint
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView
import com.example.swoosh.*

class FinishActivity : AppCompatActivity() {
    @SuppressLint("SetTextI18n")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_finish)
       val searchText:TextView = findViewById(R.id.searchLeaguesText)

        val player = intent.getParcelableExtra<Player>(EXTRA_PLAYER)

        searchText.text =  "Looking for ${player?.league} ${player?.skill} league near you"




    }
    
}