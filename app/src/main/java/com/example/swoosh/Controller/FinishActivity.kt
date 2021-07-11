package com.example.swoosh.Controller

import android.annotation.SuppressLint
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView
import com.example.swoosh.Extra_League
import com.example.swoosh.Extra_skill
import com.example.swoosh.R

class FinishActivity : AppCompatActivity() {
    @SuppressLint("SetTextI18n")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_finish)
       val searchText:TextView = findViewById(R.id.searchLeaguesText)

        val league = intent.getStringExtra(Extra_League)
        val skill  =  intent.getStringExtra(Extra_skill)

        searchText.text =  "Looking for $league $skill league near you"




    }
    
}