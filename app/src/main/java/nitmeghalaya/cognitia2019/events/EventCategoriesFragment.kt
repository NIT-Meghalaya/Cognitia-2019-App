package nitmeghalaya.cognitia2019.events

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import kotlinx.android.synthetic.main.fragment_events.view.*
import nitmeghalaya.cognitia2019.R
import org.koin.androidx.viewmodel.ext.android.viewModel

class EventCategoriesFragment : Fragment() {

    private val viewModel: EventCategoriesViewModel by viewModel()

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?,
                              savedInstanceState: Bundle?): View? {
        val view = inflater.inflate(R.layout.fragment_events, container, false)
        view.recyclerView.adapter = EventCategoryRecyclerViewAdapter(viewModel.getEventCategories())
        return view
    }

}
