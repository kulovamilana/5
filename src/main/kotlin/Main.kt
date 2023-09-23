fun main() {
    // 1. Создание констант (val) age1 и age2
    val age1: Int = 42
    val age2: Int = 21

    // 2. Создание константы avg1 как среднего арифметического age1 и age2
    val avg1: Double = (age1 + age2) / 2.0

    // 3. Исправление типа avg1
    val avg1Fixed: Double = (age1.toDouble() + age2.toDouble()) / 2.0

    // 4. Создание строковых констант для имени и фамилии
    val firstName: String = "Милана"
    val lastName: String = "Кулова"

    // 5. Создание константы fullName (имя + фамилия)
    val fullName: String = "$firstName $lastName"

    // 6. Создание myDetails строкового типа с использованием константы fullName
    val myDetails: String = "Привет, меня зовут $fullName."

    // 7. Объявление константы Triple для представления даты (месяц, день, год)
    val date: Triple<Int, Int, Int> = Triple(9, 7, 2023)

    // 8. Извлечение значений из Triple в константы month, day и year
    val (month, day, year) = date

    // 9. Вывод месяца и года в две константы
    val monthAndYear: Pair<Int, Int> = Pair(month, year)

    // 10. Изменение значения месяца и создание новой Pair
    val newMonth = month + 1
    val newPair: Pair<Int, Int> = Pair(newMonth, year)

    // Вывод результатов
    println("avg1Fixed: $avg1Fixed")
    println("fullName: $fullName")
    println("myDetails: $myDetails")
    println("monthAndYear: $monthAndYear")
    println("newPair: $newPair")
}