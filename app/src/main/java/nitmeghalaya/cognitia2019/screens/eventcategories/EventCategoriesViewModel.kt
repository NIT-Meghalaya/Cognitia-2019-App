package nitmeghalaya.cognitia2019.screens.eventcategories

import androidx.lifecycle.ViewModel
import nitmeghalaya.cognitia2019.R
import nitmeghalaya.cognitia2019.model.EventCategory

class EventCategoriesViewModel: ViewModel() {

    fun getEventCategories(): ArrayList<EventCategory> {
        val eventCategories = arrayListOf<EventCategory>()

        eventCategories.add(EventCategory("Technical events", R.drawable.technical))
        eventCategories.add(EventCategory("CE Departmental Events", R.drawable.civil))
        eventCategories.add(EventCategory("CSE Departmental Events", R.drawable.cse))
        eventCategories.add(EventCategory("ECE Departmental Events", R.drawable.ece))
        eventCategories.add(EventCategory("EEE Departmental Events", R.drawable.electrical))
        eventCategories.add(EventCategory("ME Departmental Events", R.drawable.mechanical))
        eventCategories.add(EventCategory("Gaming Events", R.drawable.gaming))
        eventCategories.add(EventCategory("New Events", R.drawable.gaming))

        return eventCategories
    }
}