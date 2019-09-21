package nitmeghalaya.cognitia2019.screens.teammembers


import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.azoft.carousellayoutmanager.CarouselLayoutManager
import com.azoft.carousellayoutmanager.CarouselZoomPostLayoutListener
import com.azoft.carousellayoutmanager.CenterScrollListener
import kotlinx.android.synthetic.main.fragment_team_members.view.*
import nitmeghalaya.cognitia2019.R
import nitmeghalaya.cognitia2019.screens.BaseFragment
import org.koin.androidx.viewmodel.ext.android.viewModel



/**
 * A simple [Fragment] subclass.
 */
class TeamMembersFragment : BaseFragment() {

    private val viewModel: TeamMembersViewModel by viewModel()

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        val view = inflater.inflate(R.layout.fragment_team_members, container, false)
        setActionbarTitle("Team Members")
        val layoutManager = CarouselLayoutManager(CarouselLayoutManager.HORIZONTAL,true)
        layoutManager.setPostLayoutListener(CarouselZoomPostLayoutListener());
        view.recyclerView.layoutManager = layoutManager
        view.recyclerView.setHasFixedSize(true)

        view.recyclerView.adapter = TeamMemberRecyclerViewAdapter(viewModel.getTeamMembers())
        view.recyclerView.addOnScrollListener(CenterScrollListener())
        return view
    }


}
