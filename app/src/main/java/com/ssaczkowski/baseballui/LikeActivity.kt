package com.ssaczkowski.baseballui

import android.animation.Animator
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import com.airbnb.lottie.LottieAnimationView
import kotlinx.android.synthetic.main.activity_like.*

class LikeActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_like)

        animation_view_like.visibility = View.GONE
        imageView2.setOnClickListener {
            animation(animation_view_like)
            animation_view_like.visibility = View.VISIBLE
            animation_view_like.playAnimation()
        }

    }

    private fun animation(animation: LottieAnimationView){
        animation.addAnimatorListener(object: Animator.AnimatorListener{
            override fun onAnimationRepeat(animation: Animator?) {
                //TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
            }

            override fun onAnimationEnd(animation: Animator?) {
                animation_view_like.visibility = View.GONE
            }

            override fun onAnimationCancel(animation: Animator?) {
               // TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
            }

            override fun onAnimationStart(animation: Animator?) {
               // TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
            }

        })
    }
}
