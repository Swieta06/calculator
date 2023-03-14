package com.example.calculator.formula

import com.example.calculator.formula.abstraction.BangunDatar

class Persegi: BangunDatar(NAME){
    var sisi:Int=0
    override fun hitung(onHitung: (keteranga:String) -> Unit): Int {
        val  result=sisi*sisi
        onHitung.invoke("hitung persegi")
        return result
    }
companion object{
    private const val NAME="persegi"
}
}