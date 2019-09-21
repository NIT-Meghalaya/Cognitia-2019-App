package nitmeghalaya.cognitia2019.screens.teammembers

import androidx.lifecycle.ViewModel
import nitmeghalaya.cognitia2019.model.TeamMember

class TeamMembersViewModel : ViewModel() {

    fun getTeamMembers(): ArrayList<TeamMember> {
        val teamMembers = ArrayList<TeamMember>()

        teamMembers.add(
            TeamMember(
                "Devansh Maurya", "Web & App"
            )
        )
        teamMembers.add(
            TeamMember("Laribok Syiemlieh", "Web & App")
        )
        teamMembers.add(
            TeamMember("Hemant", "Web & App")
        )
        teamMembers.add(
            TeamMember("Pankaj", "Web & App")
        )

        return teamMembers
    }
}