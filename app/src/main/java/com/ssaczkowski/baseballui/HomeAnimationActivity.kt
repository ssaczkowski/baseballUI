package com.ssaczkowski.baseballui

import android.app.ActivityOptions
import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_home_animation.*
import android.util.Pair
import android.view.View

class HomeAnimationActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_home_animation)

        home_animation_text_view_animation.setOnClickListener {
            startActivity(Intent(this@HomeAnimationActivity, AnimationActivity::class.java))
        }

        home_animation_text_view_fadeinout.setOnClickListener {
            startActivity(Intent(this@HomeAnimationActivity, FadeActivity::class.java))
            overridePendingTransition(R.anim.fade_in,R.anim.fade_out)
        }

        home_animation_text_view_transition.setOnClickListener {

            var pair : Pair<View,String> =  Pair<View,String> (activity_home_animation_image_view,"image_view_transition")

            var pair2 : Pair<View,String>  = Pair<View,String> (home_animation_text_view_transition,"text_view_transition")

            var intent = Intent(this@HomeAnimationActivity,TransitionActivity::class.java)

            var options = ActivityOptions.makeSceneTransitionAnimation(this,pair,pair2)

            startActivity(intent,options.toBundle())

        }

    }
}
