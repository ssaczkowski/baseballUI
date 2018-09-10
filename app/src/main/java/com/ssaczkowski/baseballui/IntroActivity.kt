package com.ssaczkowski.baseballui

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_intro.*

class IntroActivity : AppCompatActivity() {

    private lateinit var slideAdapter: SliderAdapter


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_intro)
        slideAdapter = SliderAdapter(this)

        intro_activity_viewPager.adapter = slideAdapter

        intro_activity_btn_jump.setOnClickListener {
            startActivity(Intent(this@IntroActivity,StartActivity::class.java))
        }

    }
}
