package nitmeghalaya.cognitia2019.screens.eventdescription.team

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.google.firebase.firestore.ktx.toObject
import nitmeghalaya.cognitia2019.model.CognitiaTeam
import nitmeghalaya.cognitia2019.model.TeamMember
import nitmeghalaya.cognitia2019.repository.FirestoreRepository

class EventDetailTeamViewModel(private val firestoreRepository: FirestoreRepository): ViewModel() {

    fun getTeamMembersList(teamName: String): LiveData<ArrayList<TeamMember>> {
        val teamMembersLiveData = MutableLiveData<ArrayList<TeamMember>>()

        firestoreRepository.getTeamMembers(teamName).addOnSuccessListener {
            val cognitiaTeam = it.toObject<CognitiaTeam>()

            val teamMembers = arrayListOf<TeamMember>()

            cognitiaTeam?.apply {
                coordinators.forEach {
                    it.position = "Coordinator"
                }

                cocoordinators.forEach {
                    it.position = "Co-coordinator"
                }

                members.forEach {
                    it.position = "Member"
                }

                teamMembers.apply {
                    addAll(coordinators)
                    addAll(cocoordinators)
                    addAll(members)
                }
            }

            teamMembersLiveData.value = teamMembers
        }

        return teamMembersLiveData
    }
}