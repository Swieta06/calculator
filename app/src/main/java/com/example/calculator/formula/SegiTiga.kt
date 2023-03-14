package com.example.calculator.formula

import com.example.calculator.formula.abstraction.BangunDatar

class SegiTiga:BangunDatar("Segi tiga") {
    var alas:Int=0
    var tinggi:Int=0
    override fun hitung(onHitung: (keteranga:String) -> Unit): Int {
        var result=(alas*tinggi)/2
        onHitung.invoke("hitung persegi panjang")
        return result
    }
}