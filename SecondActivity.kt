package com.example.mykotlinproject

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView

class SecondActivity : AppCompatActivity() {

    lateinit var hasil:String
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_second)
        
        //get from intent
        var intent = intent
        val nim = intent.getStringExtra( "Nim")
        val nama = intent.getStringExtra("Nama")
        val nilai = intent.getStringExtra("Nilai")
        
        //perulangan untuk range_nilai
        if (nilai.toInt()>=80){
            hasil="A"
        }
        if (nilai.toInt()<80 && nilai.toInt()>=60){
            hasil="B"
        }
        if (nilai.toInt()<60 && nilai.toInt()>=40){
            hasil="C"
        }
        if (nilai.toInt()<40&& nilai.toInt()>0){
            hasil="D"
        }
        if (nilai.toInt()==0){
            hasil="E"
        }
        //textview
        val resultTv = findViewById<TextView>(R.id.resultTV)
        
        //setText
        resultTv.text = "Nim : "+nim+"\nNama : "+nama+"\nNilai : "+nilai+"\nKeterangan : "+hasil
    }
}
