package com.example.calculator.formula.abstraction

/**
 * @param name:ini untuk nama
 * */
abstract class BangunDatar(val name: String) {
    /**
     * ini adalah fungsi untuk menghitung
     *
     *
     * */
    abstract fun hitung(onHitung:(keteranagan:String) -> Unit):Int



}