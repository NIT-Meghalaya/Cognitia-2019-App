package nitmeghalaya.cognitia2019.model

import com.google.firebase.firestore.PropertyName

class CognitiaTeam(
    @PropertyName("Co-Coordinator")
    @get:PropertyName("Co-Coordinator")
    val cocoordinators: ArrayList<TeamMember> = arrayListOf(),

    @PropertyName("Coordinator")
    @get:PropertyName("Coordinator")
    val coordinators: ArrayList<TeamMember> = arrayListOf(),

    @PropertyName("Members")
    @get:PropertyName("Members")
    val members: ArrayList<TeamMember> = arrayListOf(),


    val generalsecretary: ArrayList<TeamMember> = arrayListOf(),

    val team: String = "",

    val image: String = ""
)