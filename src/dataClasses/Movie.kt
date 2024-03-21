package clases.dataClasses

data class Movie(
    val name: String,
    val genre: String,
    val duration: Int,
) {
    var createdAtr: String = "13-03-2024";
}
