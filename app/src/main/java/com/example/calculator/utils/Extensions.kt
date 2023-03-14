package com.example.calculator.utils

import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity

fun String.toIntOrNol():Int{
    val number=this.toIntOrNull()
    return number?:0
}
fun AppCompatActivity.toast(msg:String){
    Toast.makeText(this,msg,Toast.LENGTH_SHORT).show()

}