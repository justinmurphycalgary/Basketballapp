package ca.hunkydory.basketballapp.Activities

import android.content.Intent
import android.os.Bundle
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import ca.hunkydory.basketballapp.Model.EXTRA_PLAYER
import ca.hunkydory.basketballapp.Model.Player
import ca.hunkydory.basketballapp.R
import kotlinx.android.synthetic.main.activity_skill.*


class SkillActivity : AppCompatActivity() {
    lateinit var player : Player



    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_skill)
        var player: Player? = intent.getParcelableExtra<Player>(EXTRA_PLAYER)
        val TAG = "hunkydory ${javaClass.simpleName}"

        btnSkillPro.setOnClickListener {
            btnSkillBeginner.isChecked = false
           player?.skill = "Pro"
        }

        btnSkillBeginner.setOnClickListener {
            btnSkillPro.isChecked = false
            player?.skill = "Beginner"
        }

        btnFind.setOnClickListener {
            if (player?.skill != "") {
                val leagueIntent = Intent(this, FinalActivity::class.java)
                leagueIntent.putExtra(EXTRA_PLAYER, player)

                startActivity(leagueIntent)
            } else {
                Toast.makeText(this, "You ned to select something", Toast.LENGTH_SHORT).show()
            }


        }
    }
}
