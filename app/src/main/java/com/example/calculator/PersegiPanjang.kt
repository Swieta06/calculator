package com.example.calculator

class PersegiPanjang:BangunDatar("PersegiPanjang") {
    var panjang:Int=0
    var lebar:Int=0
    override fun hitung(): Int {
        var result=panjang*lebar
        return result

    }

}