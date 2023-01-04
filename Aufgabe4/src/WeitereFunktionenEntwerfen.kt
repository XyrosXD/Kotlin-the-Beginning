fun doppelterWert(): Int {
    var zahl = 12 * 3
    return zahl
}
//----------------------------------------------

// Meine kleine Videothek :)
// Das Sortiment: (Liste)
fun videothek() {
var filmeAngebot = mutableListOf<String>(
    "Star Wars",
    "Shrek",
    "Toy Story",
)

// Die Preise (Liste)

var filmePreise = mutableListOf<Double>(
    10.99,
    7.99,
    14.99,
)

// Die Begrüßung

println("Bitte geben Sie hier ihren Namen ein:")
var kundenName = readln()

println("Hallo $kundenName, willkommen in meiner Videothek: Galaxy\n")
println("Aktuell kann ich dir folgende Filme anbieten:")

println("${filmeAngebot[0]} für ${filmePreise[0]} €")
println("${filmeAngebot[1]} für ${filmePreise[1]} €")
println("${filmeAngebot[2]} für ${filmePreise[2]} €")

// Den Kunden bedienen :: unser bestes Angebot

var guenstigsterFilm = filmePreise.indexOf(filmePreise.min())
var guenstigsterFilmName = filmeAngebot[guenstigsterFilm]
var guenstigsterFilmPreis = filmePreise[guenstigsterFilm]

println("Aktuell ist unser bestes Angebot der Film $guenstigsterFilmName für $guenstigsterFilmPreis €\n")

// Den Kunden bedienen :: einen Film auswählen

println("Welcher Film darf es denn sein?")
println("Bitte gib den Namen des Films hier ein:")

var warenkorb =  readln()
var warenkorbName =  filmeAngebot.indexOf(warenkorb)
var warenkorbPreis = filmePreise[warenkorbName]

println("Also der Film: $warenkorb für $warenkorbPreis €\n")

// Den Kunden bedienen :: den Film bezahlen

println("Wie viel Geld hast du?")
println("Bitte gib den Betrag hier ein:")

val bargeld = readln().toDouble()
var wechselgeld = bargeld - warenkorbPreis

println("Vielen Dank, du hast den Film $warenkorb für $warenkorbPreis € gekauft")
println("Du hast mir $bargeld € gegeben und bekommst $wechselgeld € zurück.\n")

println("Danke für den Einkauf $kundenName ich freue mich schon auf deinen nächsten Besuch :wink:\n")

}

//--------------C-------------------------------

fun irgendEinName() {
    var map: MutableMap<String, Int> = mutableMapOf(
        "Herbert" to 46,
        "Gundula" to 85,
        "Franz" to 37,
)}

//----------------------------------------------



//----------------------------------------------

fun main() {
println(doppelterWert())

videothek()

}