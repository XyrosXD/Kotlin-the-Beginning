fun int(): Int {
    var jacke = 5
    return jacke
}

fun double(): Double {
    var wie = 6.234
    return wie
}

fun string(): String {
    var hose = "Hallo"
    return hose
}

fun liste(): MutableList<String> {
    var liste: MutableList<String> = mutableListOf(
    "Hallo",
    "Welt",
    "!",)
    return liste
}

fun map(): MutableMap<String, Boolean> {
    var map: MutableMap<String, Boolean> = mutableMapOf(
    "Lernen wir die Sprache Französisch?" to false,
    "Lernen wir die Sprache Kotlin?" to true, )
    return map
}

fun nichts() {}

fun main() {
    println(int())
    println(double())
    println(string())
    println(liste())
    println(map())
    println(nichts())

}