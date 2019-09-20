package nitmeghalaya.cognitia2019.screens.teammembers

import android.content.Context
import android.util.TypedValue
import android.view.View
import coil.api.load
import coil.transform.RoundedCornersTransformation
import kotlinx.android.synthetic.main.item_team_member.view.*
import nitmeghalaya.cognitia2019.model.TeamMember
import nitmeghalaya.cognitia2019.screens.BaseViewHolder
import android.util.DisplayMetrics
import android.util.Log


class TeamMemberViewHolder(itemView: View):BaseViewHolder<TeamMember>(itemView) {

    override fun bind(item: TeamMember) {
        itemView.apply {
            imageView.load(item.imageResId) {
                transformations(RoundedCornersTransformation(dipToPixels(context,4)))
            }
            nametV.text = item.name + " ("+item.position + ")"
            emailTV.text = item.email
        }
    }

    fun dipToPixels(context: Context, dipValue: Int): Float {
        val metrics = context.getResources().getDisplayMetrics()
        val converted = TypedValue.applyDimension(TypedValue.COMPLEX_UNIT_DIP, dipValue.toFloat(), metrics)
        Log.v("Round", converted.toString())
        return converted

    }
}