package ca.hunkydory.basketballapp.Activities

import android.content.Intent
import android.os.Bundle
import android.util.Log
import androidx.appcompat.app.AppCompatActivity
import ca.hunkydory.basketballapp.R
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val TAG = "hunkydory ${javaClass.simpleName}"
        btnGetStarted.setOnClickListener{
            val leagueIntent = Intent(this, LeagueActivity::class.java)
            Log.e(TAG, "button intent switch")
            startActivity(leagueIntent)
        }
    }
}
