package com.example.calculator

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.calculator.databinding.ActivityPersegiBinding
import com.example.calculator.databinding.PersegiPanjangBinding

class PersegiPanjangActivity:AppCompatActivity() {
    private lateinit var binding: PersegiPanjangBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding= PersegiPanjangBinding.inflate(layoutInflater)
        setContentView(binding.root)
        binding.btnResult.setOnClickListener {
//            val sisiValue=binding.inputPanjang.text.toString().toIntOrNull()
           val persegiP=PersegiPanjang()
//            persegi.sisi=sisiValue?:0
            val result=persegiP.hitung()
            binding.result.text=result.toString()


        }
    }
}