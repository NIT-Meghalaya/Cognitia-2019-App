package nitmeghalaya.cognitia2019.screens.cognitiaevents

import android.view.View
import coil.api.load
import kotlinx.android.synthetic.main.item_cognitia_event.view.*
import nitmeghalaya.cognitia2019.model.CognitiaEvent
import nitmeghalaya.cognitia2019.screens.BaseViewHolder

class CognitiaEventViewHolder(itemView: View): BaseViewHolder<CognitiaEvent>(itemView) {

    override fun bind(item: CognitiaEvent) {
        itemView.apply {
            imageView.load(item.imageResId)
            nameTV.text = item.name
            descriptionTV.text = item.shortDescription
        }
    }
}