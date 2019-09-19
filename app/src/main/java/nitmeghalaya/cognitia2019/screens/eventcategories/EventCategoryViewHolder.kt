package nitmeghalaya.cognitia2019.screens.eventcategories

import android.view.View
import androidx.navigation.findNavController
import coil.api.load
import kotlinx.android.synthetic.main.item_event_category.view.*
import nitmeghalaya.cognitia2019.model.EventCategory
import nitmeghalaya.cognitia2019.screens.BaseViewHolder

class EventCategoryViewHolder(itemView: View): BaseViewHolder<EventCategory>(itemView) {

    override fun bind(item: EventCategory) {
        itemView.apply {
            imageView.load(item.imageResId)
            eventCategoryTV.text = item.name

            setOnClickListener {
                val action = EventCategoriesFragmentDirections
                    .actionEventCategoriesFragmentToEventsFragment(item.name)
                findNavController().navigate(action)
            }
        }
    }
}