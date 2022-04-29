package com.tgwing.tgwingapp


import android.content.Intent
import android.os.Bundle
import android.os.Handler
import android.os.Looper
import android.view.Menu
import android.view.MenuItem
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import androidx.appcompat.widget.Toolbar


class IntroActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.intro_activity)

        val handler = Handler(Looper.getMainLooper())
        handler.postDelayed({val intent = Intent(this, MainActivity::class.java)
            startActivity(intent)
        }, 1500)
    }

    override fun onPause() {
        super.onPause()
        finish()
    }
}