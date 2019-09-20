package nitmeghalaya.cognitia2019.model

import nitmeghalaya.cognitia2019.R

data class TeamMember(
    val imageResId: Int = R.drawable.cognitia_logo,
    val name: String = "",
    val team: String = "",
    val position: String = "",
    val email: String = ""
){
    companion object {
        var NAME = "Name"
        var POSITION = "Position"
        var TEAM = "Team"
        var EMAIL= "Email-Id"
    }
}
