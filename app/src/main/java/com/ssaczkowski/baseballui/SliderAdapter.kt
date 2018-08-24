package com.ssaczkowski.baseballui

import android.annotation.SuppressLint
import android.content.Context
import android.support.v4.view.PagerAdapter
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.RelativeLayout
import kotlinx.android.synthetic.main.slide_layout.view.*

class SliderAdapter(var context: Context) : PagerAdapter() {


    private val layoutInfalter: LayoutInflater

    init {
        layoutInfalter = LayoutInflater.from(context)
    }

    var slide_background: IntArray = intArrayOf(R.drawable.gradientintro2, R.drawable.gradient, R.drawable.gradientintro3)
    var slide_images: IntArray = intArrayOf(R.drawable.ic_baseball_intro1, R.drawable.ic_baseball_intro2, R.drawable.ic_baseball_intro3)
    var slide_headings = arrayOf(R.string.welcome, R.string.slide_intro_enjoy, R.string.slide_intro_social)
    var slide_description = arrayOf(R.string.slide_intro_welcome_description, R.string.slide_intro_enjoy_description, R.string.slide_intro_social_description)

    override fun isViewFromObject(view: View, `object`: Any): Boolean {
        return view === `object` as (RelativeLayout)
    }

    override fun getCount(): Int {
        return slide_headings.size
    }

    override fun instantiateItem(container: ViewGroup, position: Int): Any {
        val view = layoutInfalter.inflate(R.layout.slide_layout, container, false)

        view.slide_layout_relativeLayout.setBackgroundResource(slide_background[position])
        view.slide_imageView.setImageResource(slide_images[position])
        view.slide_textView_tittle.setText(slide_headings[position])
        view.slide_textView_description.setText(slide_description[position])

       /* if (position == 1) {
            view.slide_textView_point1.setTextColor(context.resources.getColor(R.color.colorWhite))
            view.slide_textView_point1.setTextColor(context.resources.getColor(R.color.colorTransparentWhite))
            view.slide_textView_point1.setTextColor(context.resources.getColor(R.color.colorTransparentWhite))
        } else if (position == 2) {
            view.slide_textView_point2.setTextColor(context.resources.getColor(R.color.colorTransparentWhite))
            view.slide_textView_point2.setTextColor(context.resources.getColor(R.color.colorWhite))
            view.slide_textView_point2.setTextColor(context.resources.getColor(R.color.colorTransparentWhite))
        } else if (position == 3) {
            view.slide_textView_point3.setTextColor(context.resources.getColor(R.color.colorTransparentWhite))
            view.slide_textView_point3.setTextColor(context.resources.getColor(R.color.colorTransparentWhite))
            view.slide_textView_point3.setTextColor(context.resources.getColor(R.color.colorWhite))
        }
*/
        container.addView(view)

        return view
    }

    override fun destroyItem(container: ViewGroup, position: Int, `object`: Any) {
        container.removeView(`object` as RelativeLayout)
    }


}