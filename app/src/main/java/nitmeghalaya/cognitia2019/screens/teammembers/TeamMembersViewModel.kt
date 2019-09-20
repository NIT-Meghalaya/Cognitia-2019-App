package nitmeghalaya.cognitia2019.screens.teammembers

import androidx.lifecycle.ViewModel
import nitmeghalaya.cognitia2019.R
import nitmeghalaya.cognitia2019.model.TeamMember

class TeamMembersViewModel : ViewModel() {

    fun getTeamMembers(): ArrayList<TeamMember> {
        val teamMembers = ArrayList<TeamMember>()

        teamMembers.add(
            TeamMember(
                R.drawable.ic_launcher_background, "Devansh Maurya", "Web & App",
                "HEAD", "xyz@gmail.com"
            )
        )
        teamMembers.add(
            TeamMember(
                R.drawable.ic_launcher_background, "Laribok Syiemlieh", "Web & App",
                "HEAD", "xyz@gmail.com"
            )
        )
        teamMembers.add(
            TeamMember(
                R.drawable.ic_launcher_background, "Hemant", "Web & App",
                "CORDI", "xyz@gmail.com"
            )
        )
        teamMembers.add(
            TeamMember(
                R.drawable.ic_launcher_background, "Pankaj", "Web & App",
                "CORDI", "xyz@gmail.com"
            )
        )

        return teamMembers
    }
}