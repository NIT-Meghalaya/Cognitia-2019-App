package nitmeghalaya.cognitia2019.screens.events

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import nitmeghalaya.cognitia2019.R
import nitmeghalaya.cognitia2019.model.EventCategory

class EventCategoryRecyclerViewAdapter(private val eventCategories: ArrayList<EventCategory>):
    RecyclerView.Adapter<EventCategoryViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): EventCategoryViewHolder =
        EventCategoryViewHolder(
            LayoutInflater
                .from(parent.context)
                .inflate(R.layout.item_event_category, parent, false)
        )

    override fun getItemCount() = eventCategories.size

    override fun onBindViewHolder(holder: EventCategoryViewHolder, position: Int) {
        holder.bind(eventCategories[position])
    }
}