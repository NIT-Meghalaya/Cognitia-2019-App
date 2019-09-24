package nitmeghalaya.cognitia2019.screens.schedule

import android.view.View
import coil.api.load
import kotlinx.android.synthetic.main.item_schedule.view.*
import nitmeghalaya.cognitia2019.R
import nitmeghalaya.cognitia2019.model.ScheduleItem
import nitmeghalaya.cognitia2019.screens.BaseViewHolder

class DayScheduleViewHolder(view: View): BaseViewHolder<ScheduleItem>(view) {
    override fun bind(item: ScheduleItem) {
        itemView.apply {
            startTimeTV.text = item.startTime
            endTimeTV.text = item.endTime
            eventTitleTV.text = item.name
            imageView.load(R.drawable.technical)
        }
    }
}