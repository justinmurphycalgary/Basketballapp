package ca.hunkydory.basketballapp.Activities

import android.content.Intent
import android.os.Bundle
import android.util.Log
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import ca.hunkydory.basketballapp.Model.EXTRA_PLAYER
import ca.hunkydory.basketballapp.Model.Player
import ca.hunkydory.basketballapp.R
import kotlinx.android.synthetic.main.activity_league.*

class LeagueActivity : AppCompatActivity() {
    val TAG = "hunkydory ${javaClass.simpleName}"
    var player = Player ("", "")

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_league)

        btnCoedLeague.setOnClickListener{
            btnWomansLeague.isChecked = false
            btnMensLeague.isChecked = false
            player.league = "Coed"
        }

        btnMensLeague.setOnClickListener{
            btnWomansLeague.isChecked = false
            btnCoedLeague.isChecked = false
            player.league = "Mens"
        }

        btnWomansLeague.setOnClickListener{
            btnCoedLeague.isChecked = false
            btnMensLeague.isChecked = false
            player.league = "Womans"
        }

        btnNext.setOnClickListener{
           if (player.league != ""){
               val leagueIntent = Intent(this, SkillActivity::class.java)
               leagueIntent.putExtra(EXTRA_PLAYER, player)
               Log.e(TAG, "button intent switch")
               startActivity(leagueIntent)
           } else {
             Toast.makeText(this, "You ned to select something", Toast.LENGTH_SHORT).show()
           }
        }
    }
}
