import nitmeghalaya.cognitia2019.repository.FirestoreRepository
import nitmeghalaya.cognitia2019.screens.cognitiaevents.CognitiaEventsViewModel
import nitmeghalaya.cognitia2019.screens.eventcategories.EventCategoriesViewModel
import nitmeghalaya.cognitia2019.screens.eventdescription.team.EventDetailTeamViewModel
import nitmeghalaya.cognitia2019.screens.schedule.ScheduleViewModel
import nitmeghalaya.cognitia2019.screens.team.TeamsViewModel
import nitmeghalaya.cognitia2019.screens.teammembers.TeamMembersViewModel
import org.koin.androidx.viewmodel.dsl.viewModel
import org.koin.dsl.module

/**
 * Created by Devansh on 19-09-2019
 */

val firestoreRepositoryModule = module {
    single { FirestoreRepository() }
}

val appModule = module {
    viewModel { EventCategoriesViewModel() }
    viewModel { TeamMembersViewModel() }
    viewModel { CognitiaEventsViewModel(get()) }
    viewModel { EventDetailTeamViewModel(get()) }
    viewModel { ScheduleViewModel() }
    viewModel { TeamsViewModel(get()) }
}