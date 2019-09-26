package nitmeghalaya.cognitia2019.screens.team


import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.lifecycle.Observer
import kotlinx.android.synthetic.main.fragment_team.view.*
import nitmeghalaya.cognitia2019.R
import nitmeghalaya.cognitia2019.screens.BaseFragment
import org.koin.androidx.viewmodel.ext.android.viewModel



class TeamsFragment: BaseFragment() {

    private val viewModel: TeamsViewModel by viewModel()

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val view = inflater.inflate(R.layout.fragment_team, container, false)

        setActionbarTitle("Teams")

        showLoadingAnimation()
        viewModel.getTeams().observe(this, Observer {
            view.recyclerView.adapter = TeamsRecyclerViewAdapter(it)
            hideLoadingAnimation()
        })

        return view
    }

}
