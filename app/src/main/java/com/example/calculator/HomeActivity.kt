package com.example.calculator

import android.content.Intent
import android.os.Binder
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.calculator.databinding.ActivityHomeBinding

class HomeActivity:AppCompatActivity() {
    private lateinit var binding: ActivityHomeBinding
    override fun onCreate(savedInstanceState: Bundle?) {

        super.onCreate(savedInstanceState)
        binding= ActivityHomeBinding.inflate(layoutInflater)
        setContentView(binding.root)
//        binding.btnPersegi.setOnClickListener {
//            val intent=Intent(applicationContext,PersegiActivity::class.java)
//            startActivity(intent)
//        }

        binding.btnPersegi.setOnClickListener {
            intentTo(PersegiActivity::class.java)
        }
        binding.btnPersegiPanjang.setOnClickListener {
            intentTo(PersegiPanjangActivity::class.java)
        }
    }
    private fun intentTo(classs:Class<*>){
        val intent=Intent(this,classs)
        startActivity(intent)

    }


}