package com.example.zadanienaocene

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.ImageView
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var x = 1

        // LEWY PRZYCISK
        findViewById<Button>(R.id.back).setOnClickListener {
            if(x==1) {
                findViewById<ImageView>(R.id.imageView).setImageResource(R.drawable.c)
                x = 3
            } else if (x==2) {
                findViewById<ImageView>(R.id.imageView).setImageResource(R.drawable.a)
                x = 1
                }
            else if (x==3) {
                findViewById<ImageView>(R.id.imageView).setImageResource(R.drawable.b)
                x = 2

            }
        }

        // PRAWY PRZYCISK
        findViewById<Button>(R.id.next).setOnClickListener {
            if (x == 1) {
                findViewById<ImageView>(R.id.imageView).setImageResource(R.drawable.b)
                x = 2
            } else if (x == 2) {
                findViewById<ImageView>(R.id.imageView).setImageResource(R.drawable.c)
                x = 3
            } else if (x == 3) {
                findViewById<ImageView>(R.id.imageView).setImageResource(R.drawable.a)
                x = 1

            }
        }
            fun sil(num: Int): Long {

                return if (num <= 1) 1
                else num * sil(num - 1)


            }

            findViewById<Button>(R.id.silnia).setOnClickListener{
                var num = findViewById<EditText>(R.id.silniaInput).text.toString().toInt()
                var result = sil(num)
                findViewById<TextView>(R.id.textView).text="Silnia Wynosi: "+result.toString()

        }

    }
}