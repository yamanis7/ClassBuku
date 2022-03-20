class buku(judul: String,
           pengarang: String,
           penerbit: String,
           tahun: Int) {

    var judulBuku = judul
    var pengarangBuku = pengarang
    var penerbitBuku = penerbit
    var tahunBuku = tahun

    fun cetakBuku() {
        println("Judul = ${judulBuku}")
        println("Pengarang = ${pengarangBuku}")
        println("Penerbit = ${penerbitBuku}")
        println("Tahun = ${tahunBuku}")
    }
}
fun main() {
    val cetak1 = buku("Pemrograman berbasis Objek dengan Java",
        "Indrajani" ,
        "Elexmedia Komputindo",
        2007)

    cetak1.cetakBuku()
    println(" ")

    val cetak2 = buku("Dasar Pemrograman Java",
        "Abdul Kadir",
        "Andi Offset",
        2004)

    cetak2.cetakBuku()
}