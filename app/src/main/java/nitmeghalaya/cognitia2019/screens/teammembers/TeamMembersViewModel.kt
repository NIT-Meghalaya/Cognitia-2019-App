package nitmeghalaya.cognitia2019.screens.teammembers

import androidx.lifecycle.ViewModel
import nitmeghalaya.cognitia2019.model.TeamMember

class TeamMembersViewModel : ViewModel() {

    fun getTeamMembers(): ArrayList<TeamMember> {
        val teamMembers = ArrayList<TeamMember>()

        teamMembers.add(
            TeamMember(
                "Devansh Maurya",
                "xyz",
                "https://firebasestorage.googleapis.com/v0/b/cognitia-2019.appspot.com/o/DevanshApp.jpg?alt=media&token=739eea03-de80-448c-a679-ac92ebb70cf4",
                "Web & App"
            )
        )
        teamMembers.add(
            TeamMember("Laribok Syiemlieh",
                "xyz",
                "https://firebasestorage.googleapis.com/v0/b/cognitia-2019.appspot.com/o/laribok.jpg?alt=media&token=e0fac04f-2c5e-4128-b507-fe823ae02843",
                "Web & App"
            )
        )
        teamMembers.add(
            TeamMember("Hemant",
                "xyz",
                "https://firebasestorage.googleapis.com/v0/b/cognitia-2019.appspot.com/o/hemantApp.jpg?alt=media&token=a841e1d0-4624-431d-ad8e-ccb8ca6f615e",
                "Web & App"
            )
        )
        teamMembers.add(
            TeamMember("Pankaj",
                "xyz",
                "https://firebasestorage.googleapis.com/v0/b/cognitia-2019.appspot.com/o/pankaj.jpg?alt=media&token=eb3cee5c-fff9-4bef-89fb-9629b06f936c",
                "Web & App"
            )
        )

        return teamMembers
    }
}