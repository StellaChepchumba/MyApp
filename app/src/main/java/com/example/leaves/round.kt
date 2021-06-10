package com.example.leaves

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class round : AppCompatActivity() {
    lateinit var btnNext5:Button
    lateinit var btnPrev5:Button
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_round)
        castViews()
        clickNext()
    }
    fun castViews(){
        btnPrev5=findViewById(R.id.btnPrev5)
        btnNext5=findViewById(R.id.btnNext5)

    }
    fun clickNext(){
        btnNext5.setOnClickListener {
            val intent= Intent(baseContext,round::class.java)
            startActivity(intent)
        }
        btnPrev5.setOnClickListener {
            val intent= Intent(baseContext,ovalshape2::class.java)
            startActivity(intent)
        }
    }
}

