package nitmeghalaya.cognitia2019.screens.schedule

import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentManager
import androidx.fragment.app.FragmentStatePagerAdapter

class SchedulePagerAdapter(fm : FragmentManager) :
    FragmentStatePagerAdapter(fm, BEHAVIOR_RESUME_ONLY_CURRENT_FRAGMENT) {

    override fun getItem(position: Int): Fragment =
        when(position){
            0 -> DayScheduleFragment()
            1 -> DayScheduleFragment()
            else -> DayScheduleFragment()
        }

    override fun getCount() = 2

    override fun getPageTitle(position: Int) =
        when(position) {
            0 -> "September 27"
            1 -> "September 28"
            else -> ""
        }
}