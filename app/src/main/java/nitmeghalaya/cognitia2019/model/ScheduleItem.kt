package nitmeghalaya.cognitia2019.model

data class ScheduleItem (
    val name: String = "",
    val startTime: String = "",
    val endTime: String = "",
    val date: String = "",
    val image: String = "",
    var dominantColor: Int = 0,
    var imageResId: Int = 0
)