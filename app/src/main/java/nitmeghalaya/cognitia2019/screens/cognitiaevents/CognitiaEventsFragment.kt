package nitmeghalaya.cognitia2019.screens.cognitiaevents


import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.navArgs
import kotlinx.android.synthetic.main.fragment_cognitia_events.view.*
import nitmeghalaya.cognitia2019.R
import nitmeghalaya.cognitia2019.screens.BaseFragment
import org.koin.androidx.viewmodel.ext.android.viewModel

class CognitiaEventsFragment : BaseFragment() {

    private val viewModel: CognitiaEventsViewModel by viewModel()
    val args: CognitiaEventsFragmentArgs by navArgs()

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val view = inflater.inflate(R.layout.fragment_cognitia_events, container, false)

        view.recyclerView.adapter = CognitiaEventsRecyclerViewAdapter(viewModel.getCognitiaEventList())

        return view
    }


}
