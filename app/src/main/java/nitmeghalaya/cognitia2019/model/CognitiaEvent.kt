package nitmeghalaya.cognitia2019.model

data class CognitiaEvent(
    val name: String = "",
    val description: String = "",
    val about: String = "",
    val rules: String = "",
    val robotSpecs: String = "",
    val teamGuidelines: String = "",
    val category: String = "1",
    val image: String = "",
    val team: String = ""
) {
    companion object {
        const val DESCRIPTION = "Description"
        const val ROBOT_SPECIFICATIONS = "Robot Specifications"
        const val ROBOT_SPECS = "Robot Specs"
        const val RULES = "Rules"
        const val TEAM = "Team"
        const val PARENT = "Parent"
    }
}