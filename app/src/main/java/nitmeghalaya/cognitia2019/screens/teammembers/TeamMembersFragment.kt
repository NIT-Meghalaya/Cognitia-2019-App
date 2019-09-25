package nitmeghalaya.cognitia2019.screens.teammembers

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.navArgs
import com.azoft.carousellayoutmanager.CarouselLayoutManager
import com.azoft.carousellayoutmanager.CarouselZoomPostLayoutListener
import com.yarolegovich.discretescrollview.transform.Pivot
import com.yarolegovich.discretescrollview.transform.ScaleTransformer
import kotlinx.android.synthetic.main.fragment_team_members.view.*
import nitmeghalaya.cognitia2019.R
import nitmeghalaya.cognitia2019.screens.BaseFragment
import org.koin.androidx.viewmodel.ext.android.viewModel


class TeamMembersFragment : BaseFragment() {

    private val viewModel: TeamMembersViewModel by viewModel()
    private val args: TeamMembersFragmentArgs by navArgs()

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        val view = inflater.inflate(R.layout.fragment_team_members, container, false)

        setActionbarTitle(viewModel.getTeamName(args.teamJson))

        val layoutManager = CarouselLayoutManager(CarouselLayoutManager.HORIZONTAL,false)
        layoutManager.setPostLayoutListener(CarouselZoomPostLayoutListener())
        view.apply {
            discreteScrollView.apply {
                setHasFixedSize(true)
                adapter = TeamMemberRecyclerViewAdapter(viewModel.getTeamMembersList(args.teamJson))
                setOverScrollEnabled(true)

                setItemTransformer(
                    ScaleTransformer.Builder()
                        .setMaxScale(1.05f)
                        .setMinScale(0.8f)
                        .setPivotX(Pivot.X.CENTER) // CENTER is a default one
                        .setPivotY(Pivot.Y.BOTTOM) // CENTER is a default one
                        .build()
                )

                addScrollStateChangeListener(TeamMembersScrollStateChangedListener(
                    view.nameTV, view.postTV, view.emailTV))
            }
        }

        return view
    }
}
