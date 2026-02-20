package oop_00000119455_YustinusEvanKusuma.week03

fun main() {
    val e = Employee("Budi")

    e.salary = -1000 // Harusnya print error
    e.salary = 5000000
    println("Gaji: ${e.salary}")

    e.increasePerformance()

    println("Pajak yang harus dibayar: ${e.tax}")
}