fun printFullName(firstName: String, lastName: String) {
    println(firstName + " " + lastName)
}

fun main() {
    // Задание 1.
    printFullName("Выгонов", "Костя")

    // Задание 2.
    printFullName(lastName = "АОАОА", firstName = "Адольф")

    // Задание 3.
    val fullName = calculateFullName("Макс", "Трушин")
    println("Полное имя: $fullName")

    // Задание 4.
    val (fullNamePair, length) = calculateFullNamePair("Абоба", "Санёчек")
    println("Полное имя: $fullNamePair, Длина: $length")

    // Задание 5.
    println(isPrime(6))
    println(isPrime(3))

    // Задание 6.
    println(fibonacci(6))
}

// Задание 3.
fun calculateFullName(firstName: String, lastName: String): String {
    return "$firstName $lastName"
}

// Задание 4.
fun calculateFullNamePair(firstName: String, lastName: String): Pair<String, Int> {
    val fullName = "$firstName $lastName"
    return Pair(fullName, fullName.length -1)
}

//Задание 5.
fun isPrime(number: Int): Boolean {
    if (number <= 1) {
        return false
    }
    for (i in 2..Math.sqrt(number.toDouble()).toInt()) {
        if (number % i == 0) {
            return false
        }
    }
    return true
}

//Задание 6
fun fibonacci(n: Int): Int {
    if (n <= 1) {
        return 1
    }
    return fibonacci(n - 1) + fibonacci(n - 2)
}