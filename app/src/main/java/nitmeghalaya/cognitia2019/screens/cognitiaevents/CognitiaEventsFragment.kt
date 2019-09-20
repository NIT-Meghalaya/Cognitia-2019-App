package nitmeghalaya.cognitia2019.screens.cognitiaevents


import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.lifecycle.Observer
import androidx.navigation.fragment.navArgs
import kotlinx.android.synthetic.main.fragment_cognitia_events.view.*
import nitmeghalaya.cognitia2019.R
import nitmeghalaya.cognitia2019.screens.BaseFragment
import org.koin.androidx.viewmodel.ext.android.viewModel

class CognitiaEventsFragment : BaseFragment() {

    private val viewModel: CognitiaEventsViewModel by viewModel()
    private val args: CognitiaEventsFragmentArgs by navArgs()

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val view = inflater.inflate(R.layout.fragment_cognitia_events, container, false)

        setActionbarTitle(args.eventsCategory)

        val category = if(args.eventsCategory == "Technical events") "robotics" else args.eventsCategory

        viewModel.getCognitiaEventList(category).observe(this, Observer {
            view.recyclerView.adapter = CognitiaEventsRecyclerViewAdapter(this, it)
        })

        return view
    }
}
