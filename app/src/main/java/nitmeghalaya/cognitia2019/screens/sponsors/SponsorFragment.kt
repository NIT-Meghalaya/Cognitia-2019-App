package nitmeghalaya.cognitia2019.screens.sponsors


import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.lifecycle.Observer
import kotlinx.android.synthetic.main.fragment_sponsor.view.*
import nitmeghalaya.cognitia2019.R
import nitmeghalaya.cognitia2019.screens.BaseFragment
import org.koin.androidx.viewmodel.ext.android.viewModel

class SponsorFragment : BaseFragment() {

    private val viewModel: SponsorViewModel by viewModel()

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        showLoadingAnimation()
        setActionbarTitle("Sponsors")
        val view = inflater.inflate(R.layout.fragment_sponsor, container, false)

        viewModel.getSponsors().observe(this, Observer {
            view.recyclerView.adapter = SponsorRecyclerViewAdapter(it)
            hideLoadingAnimation()
        })

        return view
    }


}