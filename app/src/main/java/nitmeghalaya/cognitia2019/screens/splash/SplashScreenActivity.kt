package nitmeghalaya.cognitia2019.screens.splash

import android.content.Intent
import android.os.Bundle
import android.os.Handler
import android.preference.PreferenceManager
import androidx.appcompat.app.AppCompatActivity
import nitmeghalaya.cognitia2019.R
import nitmeghalaya.cognitia2019.screens.MainActivity
import nitmeghalaya.cognitia2019.screens.introslider.IntroSliderActivity

class SplashScreenActivity : AppCompatActivity() {

    private val SPLASH_TIME_OUT = 4000L

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_splash_screen)

        val getPrefs = PreferenceManager
            .getDefaultSharedPreferences(baseContext)

        val isFirstStart = getPrefs.getBoolean("firstStart", true)

        Handler().postDelayed({
            if (isFirstStart) {
                startActivity(Intent(this, IntroSliderActivity::class.java))
            } else {
                startActivity(Intent(this, MainActivity::class.java))
            }

            finish()
        }, SPLASH_TIME_OUT)
    }
}
