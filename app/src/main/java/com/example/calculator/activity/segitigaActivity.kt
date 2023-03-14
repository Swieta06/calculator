package com.example.calculator.activity

import android.os.Bundle
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import com.example.calculator.databinding.ActivitySegitigaBinding
import com.example.calculator.databinding.PersegiPanjangBinding
import com.example.calculator.formula.PersegiPanjang
import com.example.calculator.utils.toIntOrNol

class segitigaActivity:AppCompatActivity() {
    private lateinit var binding: ActivitySegitigaBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivitySegitigaBinding.inflate(layoutInflater)
        setContentView(binding.root)
        binding.btnResult.setOnClickListener {
            if (binding.inputAlas.text.toString().isNotEmpty()&&binding.inputTinggi.text.toString().isNotEmpty()){
                val panjang = binding.inputAlas.text.toString().toIntOrNol()
                val lebar = binding.inputTinggi.text.toString().toIntOrNol()
                val persegiP = PersegiPanjang()
                persegiP.panjang = panjang
                persegiP.lebar = lebar
//            persegi.sisi=sisiValue?:0
                val result = persegiP.hitung() {
                    println(it)
                }
                binding.result.text = result.toString()
            }else{
                Toast.makeText(applicationContext, "Tidak boleh nol", Toast.LENGTH_SHORT).show()
            }

        }
    }
}