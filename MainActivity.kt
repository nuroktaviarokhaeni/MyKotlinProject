package com.example.mykotlinproject

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

     val nimET = findViewById<EditText>(R.id.nimET)
     val namaET = findViewById<EditText>(R.id.namaET)
     val nilaiET = findViewById<EditText>(R.id.nilaiET)
     val prosesBtn = findViewById<Button>(R.id.ProsesBtn)

     //menghandle button klik
     prosesBtn.setOnClickListener {
         //mendapatkan text untuk
         val nim = nimET.text.toString()
         val nama = namaET.text.toString()
         val nilai = nilaiET.text.toString()

         val intent = Intent(this@MainActivity, SecondActivity::class.java)
         intent.putExtra("Nim", nim)
         intent.putExtra("Nama", nama)
         intent.putExtra("Nilai", nilai)
         startActivity(intent)


        }
    }
}
