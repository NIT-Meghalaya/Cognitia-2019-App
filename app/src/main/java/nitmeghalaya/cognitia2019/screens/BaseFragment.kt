package nitmeghalaya.cognitia2019.screens

import androidx.fragment.app.Fragment

abstract class BaseFragment : Fragment() {

    fun setActionbarTitle(title: String) {
        (activity as MainActivity).supportActionBar?.title = title
    }
}