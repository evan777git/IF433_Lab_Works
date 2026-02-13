package oop_00000119455_YustinusEvanKusuma.week02

import java.util.Scanner
import kotlin.random.Random

fun main(){
    val scanner = Scanner(System.`in`)

    print("Masukkan nama hero: ")
    val heroName = scanner.nextLine()

    print("Masukkan damage Hero: ")
    val heroDmg = scanner.nextInt()

    scanner.nextLine()

    val hero = Hero(heroName, baseDamage = heroDmg)

    // Musuh
    var enemyHp = 100

    while(hero.isAlive() && enemyHp > 0){
        println("\n--- Tampilan Menu ---")
        println("1. Serang")
        println("2. Kabur")
        print("Pilih aksi: ")
        val pilihan = scanner.nextInt()
        scanner.nextLine()

        if(pilihan == 1){

            hero.attack("Musuh")

            enemyHp -= hero.baseDamage
            if (enemyHp < 0) enemyHp = 0

            println("Sisa HP Musuh: $enemyHp")

            if (enemyHp > 0){
                val enemyDamage = (10..20).random()
                println("Musuh menyerang balik!")
                hero.takeDamage(enemyDamage)
            }

        } else if (pilihan == 2){
            println("Kamu kabur dari pertarungan!")
            break
        } else {
            println("Pilihan tidak valid!")
        }
    }

    println("\n=== HASIL PERTARUNGAN ===")

    if(hero.isAlive() && enemyHp == 0){
        println("${hero.name} Menang!")
    } else if (!hero.isAlive()) {
        println("Musuh Menang!")
    } else{
        println("Pertarungan dihentikan.")
    }
}