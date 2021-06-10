package com.example.leaves

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class cordateshape : AppCompatActivity() {
    lateinit var btnPrev2:Button
    lateinit var btnNext2:Button
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_cordateshape)

        castViews2()
        clickNext2()
    }
    fun castViews2(){
        btnPrev2=findViewById(R.id.btnPrev2)
        btnNext2=findViewById(R.id.btnNext2)

    }
    fun clickNext2(){
        btnNext2.setOnClickListener {
            val btnNext2= Intent(baseContext,ovalshape2::class.java)
            startActivity(btnNext2)
        }
        btnPrev2.setOnClickListener {
            val btnPrev2= Intent(baseContext,MainActivity::class.java)
            startActivity(btnPrev2)
        }

    }
}

