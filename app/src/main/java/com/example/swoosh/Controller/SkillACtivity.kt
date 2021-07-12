package com.example.swoosh.Controller

import android.content.Intent
import android.os.Bundle
import android.view.View
import android.widget.Toast
import android.widget.ToggleButton
import com.example.swoosh.*

class SkillACtivity : BaseActivity() {

    lateinit var player: Player
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_skill)
          Beginner = findViewById(R.id.BeginnerSkillbtn)
          Baller = findViewById(R.id.BallerSkillBtn)


        player = intent.getParcelableExtra(EXTRA_PLAYER)!!
    }

    fun onBeginnerClick(view: View) {
        Baller?.isChecked = false
        player.skill = "beginner"


    }

    fun onBallerClick(view: View) {
        Beginner?.isChecked = false
        player.skill = "baller"
    }

    fun onFinishClick(view: View) {
        if (player.skill != "") {
            val finishActivity = Intent(this, FinishActivity::class.java)
            finishActivity.putExtra(EXTRA_PLAYER, player)
            startActivity(finishActivity)
        } else {
            Toast.makeText(this, "please select a level", Toast.LENGTH_SHORT).show()

        }


    }
    private var Beginner: ToggleButton? = null
    private var Baller: ToggleButton? = null
}