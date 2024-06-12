fun main() {

    //evenNumberPlusTen()
    //cityNames()
}

// Even number plus ten
fun evenNumberPlusTen() {
    val myArray = arrayOf(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20)

    for (i in myArray.indices) {
        val result: Int = if (myArray[i] % 2 == 1) myArray[i] else myArray[i] + 10

        //println(myArray[i])
        println(result)
    }
}

// City names
fun cityNames() {
    val arrayCityNames = arrayOf("london", "manchester", "liverpool", "birmingham", "leeds")
    for (i in arrayCityNames.indices) {
        val city = arrayCityNames[i]

        val modifierName = countCityName(city)
        println(modifierName)
    }
}

private fun countCityName(name: String): String {
    val newName: CharArray = name.toCharArray()

    newName[0] = newName[0].uppercaseChar()
    newName[newName.size - 1] = newName[newName.size - 1].uppercaseChar()

    return String(newName)
}














