package com.example.leaves

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MainActivity : AppCompatActivity() {
    lateinit var btnNext:Button
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        castViews()
        clickNext()
    }
    fun castViews(){
        btnNext=findViewById(R.id.btnNext)
    }
    fun clickNext(){
        btnNext.setOnClickListener {
            val intent=Intent(baseContext,cordateshape::class.java)
            startActivity(intent)
        }
    }
}