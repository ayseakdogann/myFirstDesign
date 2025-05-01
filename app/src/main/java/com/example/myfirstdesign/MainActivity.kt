package com.example.myfirstdesign

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.core.content.ContextCompat // <- bu önemli!

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        setContentView(R.layout.activity_main)

        // Status bar rengini ayarla
        window.statusBarColor = ContextCompat.getColor(this, R.color.anaRenk)
    }
}
