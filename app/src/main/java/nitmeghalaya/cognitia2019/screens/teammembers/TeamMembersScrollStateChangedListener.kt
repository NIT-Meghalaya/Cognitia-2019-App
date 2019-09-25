package nitmeghalaya.cognitia2019.screens.teammembers

import android.widget.TextView
import com.yarolegovich.discretescrollview.DiscreteScrollView

class TeamMembersScrollStateChangedListener(
    private val nameTV: TextView,
    private val postTV: TextView,
    private val emailTV: TextView) :
    DiscreteScrollView.ScrollStateChangeListener<TeamMemberViewHolder> {

    override fun onScroll(
        p0: Float,
        p1: Int,
        p2: Int,
        p3: TeamMemberViewHolder?,
        p4: TeamMemberViewHolder?
    ) {

    }

    override fun onScrollEnd(currentItemHolder: TeamMemberViewHolder, adapterPosition: Int) {
        val teamMember = currentItemHolder.teamMemberItem

        teamMember.apply {
            nameTV.text = teamMember.name
            postTV.text = teamMember.position
            emailTV.text = teamMember.email
        }
    }

    override fun onScrollStart(p0: TeamMemberViewHolder, p1: Int) {
    }
}