package nitmeghalaya.cognitia2019.screens.team

import android.util.Log
import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.google.firebase.firestore.ktx.toObjects
import nitmeghalaya.cognitia2019.model.CognitiaTeam
import nitmeghalaya.cognitia2019.repository.FirestoreRepository

class TeamsViewModel(private val firestoreRepository: FirestoreRepository): ViewModel() {

    fun getTeams(): LiveData<List<CognitiaTeam>> {
        val teamsLiveData = MutableLiveData<List<CognitiaTeam>>()

        firestoreRepository.getTeams().addOnSuccessListener {
            teamsLiveData.value = it.toObjects()
        }.addOnFailureListener {
            Log.e("Teams", "Error: $it")
        }

        return teamsLiveData
    }

}