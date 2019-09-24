package nitmeghalaya.cognitia2019.screens.teammembers

import android.util.Log
import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.google.firebase.firestore.ktx.toObject
import nitmeghalaya.cognitia2019.model.CognitiaTeam
import nitmeghalaya.cognitia2019.model.TeamMember
import nitmeghalaya.cognitia2019.repository.FirestoreRepository

class TeamMembersViewModel(private val firestoreRepository: FirestoreRepository) : ViewModel() {

    fun getTeamMembers(): LiveData<ArrayList<TeamMember>> {
        val teamMembersLiveData = MutableLiveData<ArrayList<TeamMember>>()

        firestoreRepository.getTeamMembers("")
            .addOnSuccessListener {
                val team = it.toObject<CognitiaTeam>() ?: CognitiaTeam()

                team.coordinators.forEach {
                    it.position = "Coordinator"
                }

                team.cocoordinators.forEach {
                    it.position = "Co-coordinator"
                }

                team.members.forEach {
                    it.position = "Member"
                }

                teamMembersLiveData.value = arrayListOf()

                teamMembersLiveData.value?.apply {
                    addAll(team.coordinators)
                    addAll(team.cocoordinators)
                    addAll(team.members)
                }

                teamMembersLiveData.value = teamMembersLiveData.value
            }
            .addOnFailureListener {
                Log.e("Team Members", "Failed to get")
            }

        return teamMembersLiveData
    }
}