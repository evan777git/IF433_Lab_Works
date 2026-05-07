package oop_00000119455_YustinusEvanKusuma.week10

// Untuk filter pencarian berdasarkan nama
interface INamedEntity {
    val name: String
}

data class Coin(override val name: String, val balance: Double): INamedEntity
data class Transaction(val id: String, val amount: Double)