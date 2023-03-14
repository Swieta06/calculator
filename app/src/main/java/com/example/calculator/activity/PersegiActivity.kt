package com.example.calculator.activity

import android.os.Bundle
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import com.example.calculator.formula.Persegi
import com.example.calculator.databinding.ActivityPersegiBinding

class PersegiActivity:AppCompatActivity() {
    private lateinit var binding: ActivityPersegiBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding= ActivityPersegiBinding.inflate(layoutInflater)
        setContentView(binding.root)
        binding.btnResult.setOnClickListener {
            if(binding.inputSisi.text.toString().isNotEmpty()){
                val sisiValue=binding.inputSisi.text.toString().toIntOrNull()
                val persegi= Persegi()

                persegi.sisi=sisiValue?:0

                val result=persegi.hitung { keterangan ->
                    println(keterangan)
                }
                val result2=persegi.hitung (::onHitung)
                binding.result.text=result.toString()

            }else{
                Toast.makeText(applicationContext, "Tidak boleh nol", Toast.LENGTH_SHORT).show()
            }

        }
    }
    private fun onHitung(keterangan:String){
        println(keterangan)
    }
}