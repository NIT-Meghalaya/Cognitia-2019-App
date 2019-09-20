package nitmeghalaya.cognitia2019.screens.teammembers

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import nitmeghalaya.cognitia2019.R
import nitmeghalaya.cognitia2019.model.TeamMember

class TeamMemberRecyclerViewAdapter(private val teamMembers: ArrayList<TeamMember>) :
    RecyclerView.Adapter<TeamMemberViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): TeamMemberViewHolder =
        TeamMemberViewHolder(
            LayoutInflater
                .from(parent.context)
                .inflate(R.layout.item_team_member, parent, false)
        )


    override fun getItemCount() = teamMembers.size

    override fun onBindViewHolder(holder: TeamMemberViewHolder, position: Int) {
        holder.bind(teamMembers[position])
    }
}