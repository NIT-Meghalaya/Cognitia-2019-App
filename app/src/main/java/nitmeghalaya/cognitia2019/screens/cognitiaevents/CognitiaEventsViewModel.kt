package nitmeghalaya.cognitia2019.screens.cognitiaevents

import android.util.Log
import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.google.gson.Gson
import nitmeghalaya.cognitia2019.model.CognitiaEvent
import nitmeghalaya.cognitia2019.repository.FirestoreRepository

class CognitiaEventsViewModel(private val firestoreRepository: FirestoreRepository): ViewModel() {

    fun getCognitiaEventList(categoryName: String): LiveData<ArrayList<CognitiaEvent>> {
        val eventsLiveData = MutableLiveData<ArrayList<CognitiaEvent>>()

        firestoreRepository.getEventsList(categoryName)
            .addOnSuccessListener {
                eventsLiveData.value = makeEventsLstFromMap(it.data as Map<String, Map<String, String>>)
            }
            .addOnFailureListener {
                Log.e("Events List", "Failed to get")
            }

        return eventsLiveData
    }

    private fun makeEventsLstFromMap(map: Map<String, Map<String, String>>): ArrayList<CognitiaEvent> {
        val eventsList = arrayListOf<CognitiaEvent>()

        map.forEach { (_, value) ->
            val gson = Gson()
            val json = gson.toJsonTree(value)
            eventsList.add(gson.fromJson(json, CognitiaEvent::class.java))
        }

        return eventsList
    }
}