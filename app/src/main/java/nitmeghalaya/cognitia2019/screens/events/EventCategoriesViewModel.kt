package nitmeghalaya.cognitia2019.screens.events

import androidx.lifecycle.ViewModel
import nitmeghalaya.cognitia2019.model.EventCategory

class EventCategoriesViewModel: ViewModel() {

    fun getEventCategories(): ArrayList<EventCategory> {
        val eventCategories = arrayListOf<EventCategory>()

        eventCategories.add(EventCategory("Technical events"))
        eventCategories.add(EventCategory("Departmental events"))
        eventCategories.add(EventCategory("Other events"))

        return eventCategories
    }
}