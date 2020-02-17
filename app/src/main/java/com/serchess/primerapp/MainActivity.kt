package com.serchess.primerapp

import android.content.Context
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Vibrator
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        supportActionBar?.hide()
        ingresar.setOnClickListener {
            var v=
            getSystemService(Context.VIBRATOR_SERVICE) as Vibrator
        v.vibrate(3000)
        }

    }
}
