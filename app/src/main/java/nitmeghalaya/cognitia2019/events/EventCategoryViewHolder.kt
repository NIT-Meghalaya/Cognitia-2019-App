package nitmeghalaya.cognitia2019.events

import android.view.View
import coil.api.load
import kotlinx.android.synthetic.main.item_event_category.view.*
import nitmeghalaya.cognitia2019.BaseViewHolder
import nitmeghalaya.cognitia2019.model.EventCategory

class EventCategoryViewHolder(itemView: View): BaseViewHolder<EventCategory>(itemView) {

    override fun bind(item: EventCategory) {
        itemView.apply {
            imageView.load(item.imageResId)
            eventCategoryTV.text = item.name
        }
    }
}