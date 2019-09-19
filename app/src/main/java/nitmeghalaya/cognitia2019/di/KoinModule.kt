import nitmeghalaya.cognitia2019.screens.eventcategories.EventCategoriesViewModel
import org.koin.androidx.viewmodel.dsl.viewModel
import org.koin.dsl.module

/**
 * Created by Devansh on 19-09-2019
 */

val appModule = module {
    viewModel { EventCategoriesViewModel() }
}