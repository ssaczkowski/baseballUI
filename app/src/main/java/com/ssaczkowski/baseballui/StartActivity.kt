package com.ssaczkowski.baseballui

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.support.v7.app.ActionBarDrawerToggle
import kotlinx.android.synthetic.main.activity_start.*

class StartActivity : AppCompatActivity() {


    lateinit var toggle: ActionBarDrawerToggle

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_start)

       // toggle = ActionBarDrawerToggle(this, startActivityDrawerLayout, R.string.open,R.string.close)
        //startActivityDrawerLayout.addDrawerListener(toggle)

        toggle.syncState()
        supportActionBar!!.setDisplayHomeAsUpEnabled(true)


    }
}
