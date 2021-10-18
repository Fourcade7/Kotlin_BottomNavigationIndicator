package com.pr7.kotlin_demo_bottomnavigationindicator

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        bottomNavigation.setOnNavigationItemSelectedListener { item->

            when(item.itemId){
                R.id.bottom_navigation_home ->{Toast.makeText(this,"Mwahahahahah",Toast.LENGTH_SHORT).show() }
            }

            true
        }

//        bottomNavigation.apply {
//            setOnNavigationItemSelectedListener {
//                pageName.text = it.title
//                true
//            }
//            pageName.text = menu.findItem(selectedItemId).title
//        }
    }
}