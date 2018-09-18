package com.ssaczkowski.baseballui

import android.animation.AnimatorSet
import android.animation.ObjectAnimator
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import kotlinx.android.synthetic.main.activity_animation.*

class AnimationActivity : AppCompatActivity() {


    private var animationDuration: Long = 1000;

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_animation)

        animation_activity_button_x_and_y.setOnClickListener {
            var animatorX = ObjectAnimator.ofFloat(animation_activity_image_view_1, "x", 200f)
            var animatorY = ObjectAnimator.ofFloat(animation_activity_image_view_1, "y", 400f)

            animatorX.setDuration(animationDuration)
            animatorY.setDuration(animationDuration)

            var animatorSet = AnimatorSet()

            animatorSet.playTogether(animatorX, animatorY)
            animatorSet.start()

        }

        animation_activity_button_beta_and_alfa.setOnClickListener {
            var animatorX = ObjectAnimator.ofFloat(animation_activity_image_view_2,"x",4000f)
            animatorX.setDuration(animationDuration)

            var alphaAnimation = ObjectAnimator.ofFloat(animation_activity_image_view_2, View.ALPHA,1.0f,0.0f)
            alphaAnimation.setDuration(animationDuration)

            var animatorSet = AnimatorSet()
            animatorSet.playTogether(animatorX, alphaAnimation)
            animatorSet.start()
        }

        animation_activity_button_rotation.setOnClickListener {
            var rotateAnimation = ObjectAnimator.ofFloat(animation_activity_image_view_3,"rotation",0f, 370f)
            rotateAnimation.setDuration(animationDuration)

            var animatorSet = AnimatorSet()
            animatorSet.playTogether(rotateAnimation)
            animatorSet.start()
        }



    }
}
