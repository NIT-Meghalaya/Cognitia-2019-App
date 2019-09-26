package nitmeghalaya.cognitia2019.screens.sponsors

import android.view.View
import coil.api.load
import kotlinx.android.synthetic.main.item_sponsor.view.*
import nitmeghalaya.cognitia2019.model.Sponsor
import nitmeghalaya.cognitia2019.screens.BaseViewHolder

class SponsorViewHolder(itemView: View): BaseViewHolder<Sponsor>(itemView) {

    override fun bind(item: Sponsor) {
        itemView.imageView.load(item.imageUrl)
    }
}