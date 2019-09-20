package nitmeghalaya.cognitia2019.screens.eventdescription

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.navArgs
import kotlinx.android.synthetic.main.fragment_event_detail.view.*
import nitmeghalaya.cognitia2019.R

class EventDetailFragment : Fragment() {

    private val args: EventDetailFragmentArgs by navArgs()

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val view = inflater.inflate(R.layout.fragment_event_detail, container, false)

        view.apply {
            viewPager.adapter = EventDescriptionPagerAdapter(args.event, childFragmentManager)
            tabLayout.setupWithViewPager(viewPager)

            collapsingToolbar.isTitleEnabled = true
            toolbar.title = args.eventName
        }
        return view
    }


}
