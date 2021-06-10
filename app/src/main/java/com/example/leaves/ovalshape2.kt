package com.example.leaves

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class ovalshape2 : AppCompatActivity() {
    lateinit var btnNext3:Button
    lateinit var btnPrev3:Button
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_ovalshape2)
        castViews3()
        clickNext3()
    }
    fun castViews3(){
        btnPrev3=findViewById(R.id.btnPrev3)
        btnNext3=findViewById(R.id.btnNext3)

    }
    fun clickNext3(){
        btnNext3.setOnClickListener {
            val intent= Intent(baseContext,round::class.java)
            startActivity(intent)
        }
        btnPrev3.setOnClickListener {
            val intent= Intent(baseContext,cordateshape::class.java)
            startActivity(intent)
        }
    }
}

