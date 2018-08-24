package com.ssaczkowski.baseballui

import android.support.v7.app.AppCompatActivity
import android.os.Bundle

class IntroActivity : AppCompatActivity() {

    private lateinit var slideAdapter: SliderAdapter


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_intro)
        slideAdapter = SliderAdapter(this)

        

    }
}
