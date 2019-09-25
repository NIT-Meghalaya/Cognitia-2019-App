package nitmeghalaya.cognitia2019.screens.eventdescription.team

import android.view.View
import coil.api.load
import kotlinx.android.synthetic.main.item_event_detail_team.view.*
import nitmeghalaya.cognitia2019.model.TeamMember
import nitmeghalaya.cognitia2019.screens.BaseViewHolder

class EventDetailTeamViewHolder(itemView: View): BaseViewHolder<TeamMember>(itemView) {

    override fun bind(item: TeamMember) {
        itemView.apply {
            imageView.load(item.image)
            nameTV.text = item.name
            postTV.text = item.position
        }
    }
}