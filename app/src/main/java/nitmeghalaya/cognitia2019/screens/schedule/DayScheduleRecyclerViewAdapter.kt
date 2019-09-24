package nitmeghalaya.cognitia2019.screens.schedule

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import nitmeghalaya.cognitia2019.R
import nitmeghalaya.cognitia2019.model.ScheduleItem

class DayScheduleRecyclerViewAdapter(private val scheduleItemsList: ArrayList<ScheduleItem>) :
    RecyclerView.Adapter<DayScheduleViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): DayScheduleViewHolder =
        (
                DayScheduleViewHolder(
                    LayoutInflater
                        .from(parent.context)
                        .inflate(R.layout.item_schedule, parent, false)
                )
                )

    override fun getItemCount() = scheduleItemsList.size

    override fun onBindViewHolder(holder: DayScheduleViewHolder, position: Int) {
        holder.bind(scheduleItemsList[position])
    }
}