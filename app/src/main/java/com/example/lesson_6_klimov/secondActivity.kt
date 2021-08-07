package com.example.lesson_6_klimov

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.TextView

class secondActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_second)

        var tw2 = findViewById<TextView>(R.id.tw2)
        var button2 = findViewById<Button>(R.id.button2)

        var i = intent
        if (i != null) tw2.setText(i.getCharSequenceExtra("salut"))

        //если intent не равен 0, передать можно походу что угодно

    }
    fun clickToFird(view: View) {
        var intent = Intent(this, firdActivity::class.java).apply {
            putExtra("name's Cat", "Vasya")
        }

        startActivity(intent)
    }

}
