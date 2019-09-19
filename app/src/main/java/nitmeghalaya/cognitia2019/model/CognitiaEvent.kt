package nitmeghalaya.cognitia2019.model

import nitmeghalaya.cognitia2019.R

data class CognitiaEvent(
    val shortDescription: String = "",
    val name: String = "",
    val description: String = "",
    val about: String = "",
    val rules: String = "",
    val robotSpecs: String = "",
    val teamGuidelines: String = "",
    val parent: String = "",
    val imageResId: Int = R.drawable.technical
) {
    companion object {
        var DESCRIPTION = "Description"
        var ROBOT_SPECIFICATIONS = "Robot Specifications"
        var ROBOT_SPECS = "Robot Specs"
        var RULES = "Rules"
        var TEAM = "Team"
        var PARENT = "Parent"
    }
}