package nitmeghalaya.cognitia2019.screens.cognitiaevents

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import nitmeghalaya.cognitia2019.R
import nitmeghalaya.cognitia2019.model.CognitiaEvent

class CognitiaEventsRecyclerViewAdapter(private val cognitiaEvents: ArrayList<CognitiaEvent>)
    : RecyclerView.Adapter<CognitiaEventViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int) =
        CognitiaEventViewHolder(
            LayoutInflater
                .from(parent.context)
                .inflate(R.layout.item_cognitia_event, parent, false))

    override fun getItemCount() = cognitiaEvents.size

    override fun onBindViewHolder(holder: CognitiaEventViewHolder, position: Int) {
        holder.bind(cognitiaEvents[position])
    }
}