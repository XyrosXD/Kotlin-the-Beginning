// Teilaufgabe a) == Ergebnis ist 15
fun subtrahieren(): Int {
    var zahl1 = 28
    var zahl2 = 13
    return zahl1 - zahl2
}

// Teilaufgabe b) == Ergebnis ist Gelb
fun lieblingsFarbe(): String {
    val farben: List<String> = listOf("Rot", "Blau", "Gelb", "Grün", "Lila", "Pink")
    var meineFarbe: String = farben[farben.size-4]
    return meineFarbe
}

// Teilaufgabe c) == Ergebnis ist 60
fun ersteZahl(): Int {
    return (20 - 18) * 6
}

fun zweiteZahl(): Int {
    return 25 / 5
}

fun main() {
    println(subtrahieren())
    println(lieblingsFarbe())
    val ergebnis = ersteZahl() * zweiteZahl()
    println(ergebnis)
}