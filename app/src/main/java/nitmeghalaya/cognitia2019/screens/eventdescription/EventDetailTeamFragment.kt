package nitmeghalaya.cognitia2019.screens.eventdescription

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import nitmeghalaya.cognitia2019.R

/**
 * A simple [Fragment] subclass.
 */
class EventDetailTeamFragment : Fragment() {

    companion object {

        private const val TEAM = "team"

        fun newInstance(team: String): EventDetailTeamFragment {
            val fragment = EventDetailTeamFragment()
            val bundle = Bundle()
            bundle.putString(TEAM, team)
            fragment.arguments = bundle
            return fragment
        }
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_event_detail_team, container, false)
    }


}
