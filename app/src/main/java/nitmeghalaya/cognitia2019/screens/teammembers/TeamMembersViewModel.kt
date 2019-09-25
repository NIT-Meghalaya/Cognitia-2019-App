package nitmeghalaya.cognitia2019.screens.teammembers

import androidx.lifecycle.ViewModel
import com.google.gson.Gson
import nitmeghalaya.cognitia2019.model.CognitiaTeam
import nitmeghalaya.cognitia2019.model.TeamMember

class TeamMembersViewModel : ViewModel() {

    private var cognitiaTeam: CognitiaTeam? = null

    fun getTeamMembersList(teamJson: String): ArrayList<TeamMember> {
        val teamMembers = arrayListOf<TeamMember>()

        if (cognitiaTeam == null) {
            cognitiaTeam = getCognitiaTeamFromJson(teamJson)
        }

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

        return teamMembers
    }

    fun getTeamName(teamJson: String): String {
        if (cognitiaTeam == null) {
            cognitiaTeam = Gson().fromJson(teamJson, CognitiaTeam::class.java)
        }

        return cognitiaTeam?.team ?: ""
    }

    private fun getCognitiaTeamFromJson(teamJson: String) =
        Gson().fromJson(teamJson, CognitiaTeam::class.java)
}