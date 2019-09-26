package nitmeghalaya.cognitia2019.screens.sponsors

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import nitmeghalaya.cognitia2019.R
import nitmeghalaya.cognitia2019.model.Sponsor

class SponsorRecyclerViewAdapter(private val sponsors: List<Sponsor>)
    : RecyclerView.Adapter<SponsorViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int) = SponsorViewHolder(
        LayoutInflater.from(parent.context).inflate(R.layout.item_sponsor, parent, false))

    override fun getItemCount() = sponsors.size

    override fun onBindViewHolder(holder: SponsorViewHolder, position: Int) {
        holder.bind(sponsors[position])
    }
}