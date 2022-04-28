package com.tgwing.tgwingapp


import android.os.Bundle
import android.view.Menu
import android.view.MenuItem
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import androidx.appcompat.widget.Toolbar


class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val toolbar = findViewById<Toolbar>(R.id.toolbar)
        setSupportActionBar(toolbar) //액티비티의 앱바(App Bar)로 지정
        supportActionBar?.setDisplayShowTitleEnabled(false)

    }

    override fun onCreateOptionsMenu(menu: Menu?): Boolean {
        //return super.onCreateOptionsMenu(menu);
        val menuInflater = menuInflater
        menuInflater.inflate(R.menu.menu_toolbar, menu)
        return true
    }



}