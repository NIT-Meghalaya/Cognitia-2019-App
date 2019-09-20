package nitmeghalaya.cognitia2019.screens.eventdescription


import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import kotlinx.android.synthetic.main.fragment_event_detail_item.view.*
import nitmeghalaya.cognitia2019.R

class EventDetailItemFragment : Fragment() {

    companion object {

        const val TITLE = "title"
        const val DESCRIPTION = "description"

        fun newInstance(title: String, description: String): EventDetailItemFragment {
            val fragment = EventDetailItemFragment()
            val args = Bundle()
            args.putString(TITLE, title)
            args.putString(DESCRIPTION, description)
            fragment.arguments = args
            return fragment
        }
    }

    private lateinit var title: String
    private lateinit var description: String

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        title = arguments?.getString(TITLE) ?: ""
        description = arguments?.getString(DESCRIPTION) ?: ""
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val view = inflater.inflate(R.layout.fragment_event_detail_item, container, false)

        view.apply {
            titleTV.text = title
            descriptionTV.text = description
        }

        return view
    }


}
