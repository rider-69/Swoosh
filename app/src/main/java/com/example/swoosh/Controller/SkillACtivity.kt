package com.example.swoosh.Controller

import android.content.Intent
import android.os.Bundle
import android.view.View
import android.widget.Toast
import android.widget.ToggleButton
import com.example.swoosh.Extra_League
import com.example.swoosh.Extra_skill
import com.example.swoosh.R

class SkillACtivity : BaseActivity() {

     var league = ""
      var skill = ""
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_skill)
          Beginner = findViewById(R.id.BeginnerSkillbtn)
          Baller = findViewById(R.id.BallerSkillBtn)


        league = intent.getStringExtra(Extra_League).toString()
    }

    fun onBeginnerClick(view: View) {
        Baller?.isChecked = false
        skill = "beginner"


    }

    fun onBallerClick(view: View) {
        Beginner?.isChecked = false
        skill = "baller"
    }

    fun onFinishClick(view: View) {
        if (skill != "") {
            val finishActivity = Intent(this, FinishActivity::class.java)
            finishActivity.putExtra(Extra_League, league)
            finishActivity.putExtra(Extra_skill, skill)
            startActivity(finishActivity)
        } else {
            Toast.makeText(this, "please select a level", Toast.LENGTH_SHORT).show()

        }


    }
    private var Beginner: ToggleButton? = null
    private var Baller: ToggleButton? = null
}