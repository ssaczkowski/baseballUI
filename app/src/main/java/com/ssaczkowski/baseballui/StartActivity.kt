package com.ssaczkowski.baseballui

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler
import android.support.v7.app.ActionBarDrawerToggle
import android.view.MenuItem
import android.view.WindowManager
import kotlinx.android.synthetic.main.activity_splash.*
import kotlinx.android.synthetic.main.activity_start.*
import android.support.v4.view.GravityCompat



class StartActivity : AppCompatActivity() {


    lateinit var toggle: ActionBarDrawerToggle

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_start)

        window.setFlags(
                WindowManager.LayoutParams.FLAG_HARDWARE_ACCELERATED,
                WindowManager.LayoutParams.FLAG_HARDWARE_ACCELERATED)

        toggle = ActionBarDrawerToggle(this, start_activity_drawer_layout, R.string.open,R.string.close)
        start_activity_drawer_layout.addDrawerListener(toggle)

        toggle.syncState()
        supportActionBar!!.setDisplayHomeAsUpEnabled(true)

        start_activity_navigation_view.setNavigationItemSelectedListener {

            when(it.itemId){
                R.id.profile->{
                  //  startActivity(Intent(this@StartActivity,SplashActivity::class.java))
                    true
                }
                else -> false
            }
        }

    }

    override fun onOptionsItemSelected(item: MenuItem?): Boolean {
        if(toggle.onOptionsItemSelected(item)){
            return true
        }
        return super.onOptionsItemSelected(item)
    }


}
