package nitmeghalaya.cognitia2019.repository

import EVENTS
import SPONSORS
import TEAMS
import com.google.firebase.firestore.FirebaseFirestore
import com.google.firebase.firestore.ktx.firestore
import com.google.firebase.ktx.Firebase

class FirestoreRepository {

    private val db: FirebaseFirestore = Firebase.firestore

    fun getEventsList(categoryName: String) = db.collection(EVENTS).document(categoryName).get()

    fun getTeamMembers(teamName: String) = db.collection(TEAMS).document(teamName).get()

    fun getTeams() = db.collection(TEAMS).get()

    fun getSponsors() = db.collection(SPONSORS).get()
}