package com.example.calculator.formula

import com.example.calculator.formula.abstraction.BangunDatar
import java.util.jar.Attributes.Name

class PersegiPanjang: BangunDatar(NAME) {
    var panjang:Int=0
    var lebar:Int=0
    override fun hitung(onHitung: (keteranga:String) -> Unit): Int {
        var result=panjang*lebar
        onHitung.invoke("hitung persegi panjang")
        return result

    }
    companion object{
        private const val NAME="persegi panjang"
    }

}