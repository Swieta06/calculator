package com.example.calculator.activity

import android.os.Bundle
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import com.example.calculator.formula.PersegiPanjang
import com.example.calculator.databinding.PersegiPanjangBinding
import com.example.calculator.utils.toIntOrNol
import com.example.calculator.utils.toast

class PersegiPanjangActivity : AppCompatActivity() {
    private lateinit var binding: PersegiPanjangBinding

    private val histories:MutableList<Int> = mutableListOf()
    //private val histories2:List<Int> = listOf()
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = PersegiPanjangBinding.inflate(layoutInflater)
        setContentView(binding.root)


        binding.btnResult.setOnClickListener {
            if(binding.inputPanjang.text.toString().isNotEmpty()&&binding.inputLebar.text.toString().isNotEmpty()){
                val panjang = binding.inputPanjang.text.toString().toIntOrNol()
                val lebar = binding.inputLebar.text.toString().toIntOrNol()
                val persegiP = PersegiPanjang()
                persegiP.panjang = panjang
                persegiP.lebar = lebar
//            persegi.sisi=sisiValue?:0
                val result = persegiP.hitung() {
                    println(it)
                }
                histories.add(result)


                val history: ()->String={
                    var text=""
                    for (item in histories){
                        text=text+"$item,"
                    }
                    text
                }
                binding.tvHistory.text=history()


//                var textHistory=""
//                for (item in histories){
//                    textHistory=textHistory+item.toString()
//                    binding.tvHistory.text=textHistory
//                }
//                binding.result.text = result.toString()

            }else{
                toast("gak boleh noll")
            }

        }
    }
}