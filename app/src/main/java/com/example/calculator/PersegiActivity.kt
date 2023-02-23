package com.example.calculator

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.calculator.databinding.ActivityPersegiBinding

class PersegiActivity:AppCompatActivity() {
    private lateinit var binding: ActivityPersegiBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding= ActivityPersegiBinding.inflate(layoutInflater)
        setContentView(binding.root)
        binding.btnResult.setOnClickListener {
            val sisiValue=binding.inputSisi.text.toString().toIntOrNull()
            val persegi=Persegi()

            persegi.sisi=sisiValue?:0

            val result=persegi.hitung()
            binding.result.text=result.toString()

        }
    }
}