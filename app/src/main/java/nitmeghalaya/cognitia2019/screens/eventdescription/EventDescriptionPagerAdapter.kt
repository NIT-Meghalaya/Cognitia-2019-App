package nitmeghalaya.cognitia2019.screens.eventdescription

import TECHNICAL
import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentManager
import androidx.fragment.app.FragmentPagerAdapter
import com.google.gson.Gson
import nitmeghalaya.cognitia2019.model.CognitiaEvent

class EventDescriptionPagerAdapter(cognitiaEventJson: String, fm: FragmentManager)
    : FragmentPagerAdapter(fm) {

    private val cognitiaEvent = Gson().fromJson(cognitiaEventJson, CognitiaEvent::class.java)

    override fun getItem(position: Int): Fragment =
        when(position) {
            0 -> EventDetailItemFragment.newInstance(CognitiaEvent.DESCRIPTION, cognitiaEvent.description)
            1 -> EventDetailItemFragment.newInstance(CognitiaEvent.RULES, cognitiaEvent.rules)
            2 -> {
                if(cognitiaEvent.category == TECHNICAL) {
                    EventDetailItemFragment.newInstance(CognitiaEvent.ROBOT_SPECIFICATIONS, cognitiaEvent.robotspecs)
                } else {
                    EventDetailTeamFragment.newInstance(cognitiaEvent.team)
                }
            }
            3 -> {
                EventDetailTeamFragment.newInstance(cognitiaEvent.team)
            } else -> EventDetailTeamFragment()
        }

    override fun getCount() =
            when(cognitiaEvent.category) {
                TECHNICAL -> 4
                else -> 3
            }

    override fun getPageTitle(position: Int): CharSequence? =
        when(position) {
            0 -> "Description"
            1 -> "Rules"
            2 -> if(cognitiaEvent.category == TECHNICAL) "Robot Specs" else "Team"
            3 -> "Team"
            else -> ""
        }
}