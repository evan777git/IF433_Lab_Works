package oop_00000119455_YustinusEvanKusuma.week01

fun main(){
    val gameTitle = "GTA"
    val price = 250_000
    val note: String? = null

    val finalPrice = calculateDiscount(price)

    printReceipt(title = gameTitle, finalPrice = finalPrice, note = note)
}

fun calculateDiscount(price: Int) = if (price > 500_000) (price * 0.8).toInt() else (price * 0.9).toInt()

fun printReceipt(
    title: String,
    finalPrice: Int,
    note: String?
) {
    println("Judul Game  : $title")
    println("Harga Akhir: Rp $finalPrice")
    println("Catatan    : ${note ?: "Tidak ada catatan"}")
}