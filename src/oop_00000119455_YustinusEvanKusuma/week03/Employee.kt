package oop_00000119455_YustinusEvanKusuma.week03

class Employee(val name: String) {
    var salary: Int = 0
        set(value) {
            println("Mencoba set gaji ke: $value")
            // PERINGATAN: KODE DIBAWAH INI SALAH DAN BERBAHAYA!
            // Kita memanggil setter di dalam setter (Recursive)
            this.salary = value
        }
}