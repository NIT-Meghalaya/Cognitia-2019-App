package nitmeghalaya.cognitia2019.screens.cognitiaevents

import android.view.View
import androidx.navigation.findNavController
import coil.api.load
import kotlinx.android.synthetic.main.item_cognitia_event.view.*
import nitmeghalaya.cognitia2019.R
import nitmeghalaya.cognitia2019.model.CognitiaEvent
import nitmeghalaya.cognitia2019.screens.BaseFragment
import nitmeghalaya.cognitia2019.screens.BaseViewHolder
import toJson

class CognitiaEventViewHolder(private val baseFragment: BaseFragment, itemView: View)
    : BaseViewHolder<CognitiaEvent>(itemView) {

    override fun bind(item: CognitiaEvent) {
        itemView.apply {
            imageView.load(item.image) {
                placeholder(R.drawable.cognitia_logo)
                crossfade(true)
                crossfade(500)
            }
            nameTV.text = item.name
            descriptionTV.text = item.about
        }

        itemView.setOnClickListener {
            navigateToEventDetails(it, item)
        }

        itemView.buttonExplore.setOnClickListener {
            navigateToEventDetails(it, item)
        }
    }

    private fun navigateToEventDetails(view: View, item: CognitiaEvent) {
        val action = CognitiaEventsFragmentDirections
            .actionEventsFragmentToEventDetailFragment(item.toJson<CognitiaEvent>(), item.name, item.image)
        view.findNavController().navigate(action)
        baseFragment.hideActionBar()
    }
}