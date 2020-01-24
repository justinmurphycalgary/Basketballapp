package ca.hunkydory.basketballapp.Activities

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import ca.hunkydory.basketballapp.Model.EXTRA_PLAYER
import ca.hunkydory.basketballapp.Model.Player
import ca.hunkydory.basketballapp.R
import kotlinx.android.synthetic.main.activity_final.*

class FinalActivity : AppCompatActivity() {
    val TAG = "hunkydory ${javaClass.simpleName}"

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_final)
        val player = intent.getParcelableExtra<Player>(EXTRA_PLAYER)
        val loadingTextString: String = getString(R.string.loadingTextString)
        val loadingTextString2: String = getString(R.string.loadingTextString2)
        txtFinalMessage.text = loadingTextString + player.league + player.skill + loadingTextString2

    }
}
