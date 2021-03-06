package nitmeghalaya.cognitia2019.screens.eventdescription

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.lifecycle.Observer
import kotlinx.android.synthetic.main.fragment_event_detail_team.view.*
import nitmeghalaya.cognitia2019.R
import nitmeghalaya.cognitia2019.screens.eventdescription.team.EventDetailTeamRecyclerViewAdapter
import nitmeghalaya.cognitia2019.screens.eventdescription.team.EventDetailTeamViewModel
import org.koin.androidx.viewmodel.ext.android.viewModel

/**
 * A simple [Fragment] subclass.
 */
class EventDetailTeamFragment : Fragment() {

    private val viewModel: EventDetailTeamViewModel by viewModel()

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
        val view = inflater.inflate(R.layout.fragment_event_detail_team, container, false)

        viewModel.getTeamMembersList(arguments?.getString(TEAM) ?: "")
            .observe(this, Observer {
            view.recyclerView.adapter = EventDetailTeamRecyclerViewAdapter(it)
        })

        return view
    }


}
