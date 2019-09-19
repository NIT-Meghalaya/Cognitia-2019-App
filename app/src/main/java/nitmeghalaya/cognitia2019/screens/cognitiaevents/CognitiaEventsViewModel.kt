package nitmeghalaya.cognitia2019.screens.cognitiaevents

import androidx.lifecycle.ViewModel
import nitmeghalaya.cognitia2019.model.CognitiaEvent

class CognitiaEventsViewModel: ViewModel() {

    fun getCognitiaEventList(): ArrayList<CognitiaEvent> {
        val cognitiaEvents = arrayListOf<CognitiaEvent>()

        cognitiaEvents.add(CognitiaEvent("Wonderful world", "Best event", "Awesome"))

        return cognitiaEvents
    }

}