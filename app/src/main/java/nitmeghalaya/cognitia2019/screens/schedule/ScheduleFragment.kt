package nitmeghalaya.cognitia2019.screens.schedule


import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import kotlinx.android.synthetic.main.fragment_schedule.view.*
import nitmeghalaya.cognitia2019.R
import nitmeghalaya.cognitia2019.screens.BaseFragment

class ScheduleFragment : BaseFragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment

        val view = inflater.inflate(R.layout.fragment_schedule, container, false)
        setActionbarTitle("Schedule")
        view.apply {
            viewPager.adapter = SchedulePagerAdapter(fragmentManager!!)
            tabLayout.setupWithViewPager(viewPager)
        }
        return view
    }


}
