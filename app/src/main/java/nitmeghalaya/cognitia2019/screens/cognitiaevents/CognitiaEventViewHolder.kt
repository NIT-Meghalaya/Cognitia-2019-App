package nitmeghalaya.cognitia2019.screens.cognitiaevents

import android.view.View
import androidx.navigation.findNavController
import coil.api.load
import kotlinx.android.synthetic.main.item_cognitia_event.view.*
import nitmeghalaya.cognitia2019.R
import nitmeghalaya.cognitia2019.model.CognitiaEvent
import nitmeghalaya.cognitia2019.screens.BaseViewHolder

class CognitiaEventViewHolder(itemView: View): BaseViewHolder<CognitiaEvent>(itemView) {

    override fun bind(item: CognitiaEvent) {
        itemView.apply {
            imageView.load(item.image)
            nameTV.text = item.name
            descriptionTV.text = item.description
        }

        itemView.setOnClickListener {
            navigateToEventDetails(it)
        }

        itemView.buttonExplore.setOnClickListener {
            navigateToEventDetails(it)
        }
    }

    private fun navigateToEventDetails(view: View) {
        view.findNavController().navigate(R.id.action_eventsFragment_to_eventDetailFragment)
    }
}