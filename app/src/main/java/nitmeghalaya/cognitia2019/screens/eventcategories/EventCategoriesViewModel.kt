package nitmeghalaya.cognitia2019.screens.eventcategories

import androidx.lifecycle.ViewModel
import nitmeghalaya.cognitia2019.R
import nitmeghalaya.cognitia2019.model.EventCategory

class EventCategoriesViewModel: ViewModel() {

    fun getEventCategories(): ArrayList<EventCategory> {
        val eventCategories = arrayListOf<EventCategory>()

        eventCategories.add(EventCategory("Technical events", R.drawable.technical))
        eventCategories.add(EventCategory("Departmental events", R.drawable.departmental))
        eventCategories.add(EventCategory("Other events", R.drawable.gaming))

        return eventCategories
    }
}