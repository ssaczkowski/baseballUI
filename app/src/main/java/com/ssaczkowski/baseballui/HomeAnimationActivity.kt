package com.ssaczkowski.baseballui

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_home_animation.*

class HomeAnimationActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_home_animation)

        home_animation_text_view_animation.setOnClickListener {
            startActivity(Intent(this@HomeAnimationActivity, AnimationActivity::class.java))
        }
    }
}
