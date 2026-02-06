package oop_00000119455_YustinusEvanKusuma.week01

fun main(){
    val gameTitle = "GTA"
    val price = 250_000

    val finalPrice = calculateDiscount(price)

    printReceipt(title = gameTitle, finalPrice = finalPrice)
}

fun calculateDiscount(price: Int) = if (price > 500_000) (price * 0.2).toInt() else (price * 0.1).toInt()

fun printReceipt(
    title: String,
    finalPrice: Int
) {
    println("Judul Game  : $title")
    println("Harga Akhir: Rp $finalPrice")
} 