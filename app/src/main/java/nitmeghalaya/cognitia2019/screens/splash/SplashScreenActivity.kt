package nitmeghalaya.cognitia2019.screens.splash

import android.content.Intent
import android.os.Bundle
import android.os.Handler
import androidx.appcompat.app.AppCompatActivity
import nitmeghalaya.cognitia2019.R
import nitmeghalaya.cognitia2019.screens.introslider.IntroSliderActivity

class SplashScreenActivity : AppCompatActivity() {

    private val SPLASH_TIME_OUT = 4000L

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_splash_screen)

        Handler().postDelayed({
            startActivity(Intent(this, IntroSliderActivity::class.java))
            finish()
        }, SPLASH_TIME_OUT)
    }
}
