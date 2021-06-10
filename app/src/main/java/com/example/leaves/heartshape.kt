package com.example.leaves

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class heartshape : AppCompatActivity() {
    lateinit var btnPrev6:Button
    lateinit var btnNext6:Button
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_heartshape)

        castViews6()
        clickNext6()
    }
    fun castViews6(){
        btnPrev6=findViewById(R.id.btnPrev2)
        btnNext6=findViewById(R.id.btnNext2)

    }
    fun clickNext6(){
        btnNext6.setOnClickListener {
            val btnNext6= Intent(baseContext,ablong::class.java)
            startActivity(btnNext6)
        }
        btnPrev6.setOnClickListener {
            val btnPrev6= Intent(baseContext,heartshape::class.java)
            startActivity(btnPrev6)
        }

    }
}

