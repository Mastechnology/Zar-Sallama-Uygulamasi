package com.example.diceroller

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import android.widget.Toast

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        //Burada butonumuzu tanımlıyoruz..
        val zarButon: Button = findViewById(R.id.button)

        //Butonumuzu dinlemeye alıyoruz burada..
        zarButon.setOnClickListener{
            //Burada bir tane bildirim metni oluşturuyoruz..
            val toast = Toast.makeText(this, "Zarlar sallandı!", Toast.LENGTH_SHORT)
            toast.show()
            zariSallamaFonksiyonu()

        }
    }

    //zar sallama fonksiyonu
    private fun zariSallamaFonksiyonu() {
        //zar sallayalım..
        val zar = Zar(6)
        val zariSalla = zar.salla()

        //Burada zar output elemanını tanımlıyoruz..
        val zarDeger: TextView = findViewById(R.id.roller_deger)
        //zar değerini ekrana yazalım..
        zarDeger.text = zariSalla.toString()
    }
}

//Burada bir tane zar sınıfı oluşturuyoruz, bunu kullanacağız..
class Zar(val sayiKenar: Int){
    fun salla(): Int {
        return (1..sayiKenar).random();
    }
}