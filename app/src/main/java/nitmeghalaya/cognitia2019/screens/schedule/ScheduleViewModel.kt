package nitmeghalaya.cognitia2019.screens.schedule

import androidx.lifecycle.ViewModel
import nitmeghalaya.cognitia2019.model.ScheduleItem

class ScheduleViewModel :  ViewModel() {

    fun getSchedule(): ArrayList<ScheduleItem> {
        val ScheduleItems = ArrayList<ScheduleItem>()

        ScheduleItems.add(
            ScheduleItem(
                "GAT", "9:00 AM", "11:00 AM","28"
            )
        )

        ScheduleItems.add(
            ScheduleItem(
                "Prison Break", "12:00 PM", "2:00 PM","28"
            )
        )

        return ScheduleItems
    }
}