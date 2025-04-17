package com.android.rollthedice

import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
        val image1:ImageView=findViewById(R.id.dice1_iv)
        val image2:ImageView=findViewById(R.id.dice2_iv)
        val btn:Button=findViewById(R.id.roll_btn)
        btn.setOnClickListener{
            val randomNo1=(1..6).random()
            val pic1 = when(randomNo1){
                1->R.drawable.dice_1
                2->R.drawable.dice_2
                3->R.drawable.dice_3
                4->R.drawable.dice_4
                5->R.drawable.dice_5
                else->R.drawable.dice_6 }
            val randomNo2=(1..6).random()
            val pic2 = when(randomNo2){
                1->R.drawable.dice_1
                2->R.drawable.dice_2
                3->R.drawable.dice_3
                4->R.drawable.dice_4
                5->R.drawable.dice_5
                else->R.drawable.dice_6 }
            image1.setImageResource(pic1)
            image2.setImageResource(pic2)
        }
    }
}