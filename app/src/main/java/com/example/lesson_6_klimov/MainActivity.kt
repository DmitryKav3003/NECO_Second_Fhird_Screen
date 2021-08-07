package com.example.lesson_6_klimov

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button


class MainActivity : AppCompatActivity() {

    var button: Button? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

    }
        fun clickSecond(view: View){
            var intent = Intent(this, secondActivity::class.java).apply {
                putExtra("salut", "hello from Activity")

                //intent - нужен для перехода в другое активити в другое активити
                //apply - нужен для передачи чего либо в другое активити
            }
            startActivity(intent)
        }

    }

