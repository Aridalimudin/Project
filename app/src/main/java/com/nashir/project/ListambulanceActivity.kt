package com.nashir.project

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.ImageButton
import android.widget.ImageView
import android.widget.TextView

class ListambulanceActivity : AppCompatActivity(), View.OnClickListener {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_listambulance)

        val call1: ImageView = findViewById(R.id.call1)
        call1.setOnClickListener(this)

        val txt1: TextView = findViewById(R.id.txt1)
        txt1.setOnClickListener(this)

        val back: ImageView = findViewById(R.id.back)
        back.setOnClickListener(this)
    }

    override fun onClick(v: View?) {
        if (v != null) {
            when (v.id) {
                R.id.call1 -> {
                    val intent =
                        Intent(this@ListambulanceActivity, CallambulanceActivity::class.java)
                    startActivity(intent)
                }
                R.id.txt1 -> {
                    val intent =
                        Intent(this@ListambulanceActivity, MapsActivity::class.java)
                    startActivity(intent)
                }
                R.id.back -> {
                    val intent =
                        Intent(this@ListambulanceActivity, Emergency1Activity::class.java)
                    startActivity(intent)
                }
            }
        }
    }
}