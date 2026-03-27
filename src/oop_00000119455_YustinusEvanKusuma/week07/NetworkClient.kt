package oop_00000119455_YustinusEvanKusuma.week07

class NetworkClient private constructor(val url: String) {
    fun connect(){
        println("Connecting to $url...")
    }
}