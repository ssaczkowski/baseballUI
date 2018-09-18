package com.ssaczkowski.baseballui

import android.app.Dialog
import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler
import android.support.v7.app.ActionBarDrawerToggle
import android.view.MenuItem
import android.view.WindowManager
import kotlinx.android.synthetic.main.activity_splash.*
import kotlinx.android.synthetic.main.activity_start.*
import android.support.v4.view.GravityCompat
import kotlinx.android.synthetic.main.alert_dialog.*


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

        start_activity_navigation_view.setNavigationItemSelectedListener { it ->

            when(it.itemId){
                R.id.profile->{
                  //  startActivity(Intent(this@StartActivity,SplashActivity::class.java))
                    true
                }
                R.id.friends->{
                      startActivity(Intent(this@StartActivity,FriendsActivity::class.java))
                    true
                }
                R.id.alerts->{
                    var dialog = Dialog(this@StartActivity)
                    dialog.setContentView(R.layout.alert_dialog)
                    dialog.show()
                    dialog.button_view_profile.setOnClickListener {
                        startActivity(Intent(this@StartActivity,ProfileActivity::class.java))
                        finish()
                    }

                    dialog.alert_dialog_close.setOnClickListener {
                        dialog.dismiss()
                    }

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
