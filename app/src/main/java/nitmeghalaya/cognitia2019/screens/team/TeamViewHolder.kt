package nitmeghalaya.cognitia2019.screens.team

import android.view.View
import androidx.navigation.findNavController
import coil.api.load
import kotlinx.android.synthetic.main.item_team.view.*
import nitmeghalaya.cognitia2019.model.CognitiaTeam
import nitmeghalaya.cognitia2019.screens.BaseViewHolder
import toJson

class TeamViewHolder(itemView: View): BaseViewHolder<CognitiaTeam>(itemView) {

    override fun bind(item: CognitiaTeam) {
        itemView.apply {
            imageView.load(item.image)
            teamNameTV.text = item.team

            setOnClickListener {
                val action = TeamsFragmentDirections
                    .actionTeamsFragmentToTeamMembersFragment(item.toJson<CognitiaTeam>())
                findNavController().navigate(action)
            }
        }
    }
}