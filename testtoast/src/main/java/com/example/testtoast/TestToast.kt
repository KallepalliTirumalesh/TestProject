package com.example.testtoast

import android.content.Context
import android.widget.Toast

object TestToast {
    fun checkToast(context: Context){
        Toast.makeText(context,"hello",Toast.LENGTH_SHORT).show()
    }
}