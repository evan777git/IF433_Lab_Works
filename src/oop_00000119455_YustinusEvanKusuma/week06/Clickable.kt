package oop_00000119455_YustinusEvanKusuma.week06

interface Clickable {
    // ERROR: Property in an interface cannot have a backing field
    val name: String = "Tombol Rahasia"

    // Function without body
    fun click()
}