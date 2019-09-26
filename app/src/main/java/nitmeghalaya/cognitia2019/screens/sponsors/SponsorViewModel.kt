package nitmeghalaya.cognitia2019.screens.sponsors

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.google.firebase.firestore.ktx.toObjects
import nitmeghalaya.cognitia2019.model.Sponsor
import nitmeghalaya.cognitia2019.repository.FirestoreRepository

class SponsorViewModel(private val firestoreRepository: FirestoreRepository): ViewModel() {

    fun getSponsors(): LiveData<List<Sponsor>> {
        val sponsorsLiveData = MutableLiveData<List<Sponsor>>()

        firestoreRepository.getSponsors().addOnSuccessListener {
            val sponsors = it.toObjects<Sponsor>()
            sponsorsLiveData.value = sponsors
        }

        return sponsorsLiveData
    }

}