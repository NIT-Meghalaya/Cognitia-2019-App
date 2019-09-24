package nitmeghalaya.cognitia2019.screens.schedule

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.LinearLayoutManager
import com.google.gson.Gson
import kotlinx.android.synthetic.main.fragment_day_schedule.view.*
import nitmeghalaya.cognitia2019.R
import nitmeghalaya.cognitia2019.model.ScheduleItem
import nitmeghalaya.cognitia2019.screens.teammembers.TeamMembersViewModel
import org.koin.androidx.viewmodel.ext.android.viewModel

class DayScheduleFragment: Fragment() {


    private val viewModel: ScheduleViewModel by viewModel()

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val view = inflater.inflate(R.layout.fragment_day_schedule, container, false)

        view.apply {
            scheduleRecyclerView.apply {
                adapter = DayScheduleRecyclerViewAdapter(viewModel.getSchedule())
                layoutManager = LinearLayoutManager(context)
            }
        }

        return view
    }

}