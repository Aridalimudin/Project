package com.nashir.project

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.ImageButton
import android.widget.ImageView

class Emergency1Activity : AppCompatActivity(), View.OnClickListener {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_emergency1)

        val back: ImageView = findViewById(R.id.back)
        back.setOnClickListener(this)
        val ambulance: ImageView = findViewById(R.id.ambulance)
        ambulance.setOnClickListener(this)
    }

    override fun onClick(v: View?) {
        if (v != null) {
            when (v.id) {
                R.id.back -> {
                    val intent = Intent(this@Emergency1Activity, MenuActivity::class.java)
                    startActivity(intent)
                }

                R.id.ambulance -> {
                    val intent = Intent(this@Emergency1Activity, ListambulanceActivity::class.java)
                    startActivity(intent)
                }
            }
        }
    }
}