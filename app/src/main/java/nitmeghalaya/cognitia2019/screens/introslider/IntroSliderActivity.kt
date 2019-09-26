package nitmeghalaya.cognitia2019.screens.introslider

import android.os.Bundle
import androidx.fragment.app.Fragment
import com.github.paolorotolo.appintro.AppIntro2
import nitmeghalaya.cognitia2019.R

class IntroSliderActivity : AppIntro2() {

    public override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        window.statusBarColor = resources.getColor(R.color.colorPrimaryDark)

        addSlide(SampleSlide.newInstance(R.layout.slide_0))
        addSlide(SampleSlide.newInstance(R.layout.slide_1))
        addSlide(SampleSlide.newInstance(R.layout.slide_2))
        addSlide(SampleSlide.newInstance(R.layout.slide_3))
        addSlide(SampleSlide.newInstance(R.layout.slide_4))

        showStatusBar(true)
        showSkipButton(false)
    }

    override fun onDonePressed(currentFragment: Fragment) {
        // Do something when users tap on Done button.
        super.onDonePressed(currentFragment)
        finish()
    }
}
