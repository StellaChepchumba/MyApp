package com.example.leaves

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class ablong : AppCompatActivity() {
    lateinit var btnPrev7: Button
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_ablong)
        castViews7()
        clickPrev7()

    }
    fun castViews7(){
        btnPrev7=findViewById(R.id.btnPrev7)
    }
    fun clickPrev7(){
        btnPrev7.setOnClickListener {
            val btnPrev7= Intent(baseContext,heartshape::class.java)
            startActivity(btnPrev7)
        }

    }
}

