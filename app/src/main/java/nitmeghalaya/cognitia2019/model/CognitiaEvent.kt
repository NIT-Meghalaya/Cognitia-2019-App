package nitmeghalaya.cognitia2019.model

import nitmeghalaya.cognitia2019.R

data class CognitiaEvent(
    val name: String = "",
    val description: String = "",
    val about: String = "",
    val rules: String = "",
    val robotSpecs: String = "",
    val teamGuidelines: String = "",
    val category: Int = 1,
    val image: Int = R.drawable.technical,
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