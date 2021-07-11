package com.example.swoosh.Controller

import android.content.Intent
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.Toast
import android.widget.ToggleButton
import com.example.swoosh.Extra_League
import com.example.swoosh.R
import com.example.swoosh.Controller.SkillACtivity

class LeagueActivity : BaseActivity() {
       var selectedLeague = ""
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_league)
        
        mens = findViewById(R.id.MensClickedBtn)
        womens = findViewById(R.id.WomensClickedBtn)
        Coed = findViewById(R.id.CoedClickedBtn)

        val nextbtn:Button = findViewById(R.id.nextToThirdbtn)

    }
    fun onLeagueNxtTothirdBtn(view:View){
         if(selectedLeague != ""){
              val skillACtivity = Intent(this, SkillACtivity::class.java)
             skillACtivity.putExtra(Extra_League, selectedLeague)
             startActivity(skillACtivity)
         }else{
             Toast.makeText(this, "Please select a League." , Toast.LENGTH_SHORT ).show()
         }

    }



    fun onMensClicked(view: View) {
        womens?.isChecked = false
        Coed?.isChecked = false

        selectedLeague = "mens"


    }
    fun onWomensClicked(view: View) {
        mens?.isChecked = false
        Coed?.isChecked = false
        selectedLeague = "womens"
    }


    fun onCoedClicked(view:View) {
        mens?.isChecked = false
        womens?.isChecked = false
        selectedLeague = "Coed"

    }

     private var mens:ToggleButton? = null
    private var womens :ToggleButton? = null
    private  var Coed:ToggleButton? = null
}