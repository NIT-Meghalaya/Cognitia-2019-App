package nitmeghalaya.cognitia2019.screens.sponsors


import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup

import nitmeghalaya.cognitia2019.R

/**
 * A simple [Fragment] subclass.
 */
class SponsorFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_sponsor, container, false)
    }


}
