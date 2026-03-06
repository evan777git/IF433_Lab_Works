package oop_00000119455_YustinusEvanKusuma.week05

fun main() {
    val math = MathHelper()

    val luasPersegi = math.hitungLuas(7)
    val luasPersegiPanjang = math.hitungLuas(7, 3)
    val luasLingkaran = math.hitungLuas(3.5)

    println("Luas Persegi: $luasPersegi")
    println("Luas Persegi Panjang: $luasPersegiPanjang")
    println("Luas Lingkaran: $luasLingkaran")
}