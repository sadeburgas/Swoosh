package bg.sade.swoosh.Controller

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import bg.sade.swoosh.Model.Player
import bg.sade.swoosh.R
import bg.sade.swoosh.Utilities.EXTRA_PLAYER
import kotlinx.android.synthetic.main.activity_finish.*


class FinishActivity : AppCompatActivity() {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_finish)

        val player = intent.getParcelableExtra<Player>(EXTRA_PLAYER)

        searchLeagesText.text = "Looking for ${player.league} ${player.skill} league near you.."
    }
}
