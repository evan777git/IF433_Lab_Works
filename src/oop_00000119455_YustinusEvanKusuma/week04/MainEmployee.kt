package oop_00000119455_YustinusEvanKusuma.week04

fun main(){
    val Manager1 = Manager("Kazuma", 77_000_000)
    val Developer1 = Developer("Ivan", 1_000_000, "Malbolge")

    Manager1.work()
    Developer1.work()

    println(" ")

    val bonusManager1 = Manager1.calculateBonus()
    println("Manager ${Manager1.name} mendapatkan bonus sebesar Rp $bonusManager1.")
    val bonusDeveloper1 = Developer1.calculateBonus()
    println("Developer ${Developer1.name} nyolong bonus sebesar Rp $bonusDeveloper1.")
}