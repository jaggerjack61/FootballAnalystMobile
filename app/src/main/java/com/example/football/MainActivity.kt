package com.example.football

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val btn=findViewById<Button>(R.id.button)
        val text: EditText =findViewById(R.id.editText)
        btn.setOnClickListener {
            val intent= Intent(this,WebviewActivity::class.java)
            intent.putExtra("url",text.text.toString())
            startActivity(intent)
        }
    }
}