package nitmeghalaya.cognitia2019.screens.events

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import kotlinx.android.synthetic.main.fragment_events.view.*
import nitmeghalaya.cognitia2019.R
import nitmeghalaya.cognitia2019.screens.BaseFragment
import org.koin.androidx.viewmodel.ext.android.viewModel

class EventCategoriesFragment : BaseFragment() {

    private val viewModel: EventCategoriesViewModel by viewModel()

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?,
                              savedInstanceState: Bundle?): View? {
        val view = inflater.inflate(R.layout.fragment_events, container, false)
        setActionbarTitle("Events")
        view.recyclerView.adapter = EventCategoryRecyclerViewAdapter(viewModel.getEventCategories())
        return view
    }

}
