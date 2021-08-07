package com.example.lesson_6_klimov

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.ImageView
import android.widget.TextView

class firdActivity : AppCompatActivity() {

    var twCat: TextView? = null
    var iwCat: ImageView? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_fird)

        twCat = findViewById(R.id.twCat)
        iwCat = findViewById(R.id.iwCat)

        var q = intent
        if (q != null) twCat?.setText(q.getCharSequenceExtra("name's Cat"))
    }
    fun underSetText(view: View){

        iwCat?.setImageResource(R.drawable.cat4)
        twCat?.setText("hi Cat")
    }
}