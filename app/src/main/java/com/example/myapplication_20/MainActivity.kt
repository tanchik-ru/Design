package com.example.myapplication_20

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.PersistableBundle
import android.widget.Button
import androidx.fragment.app.Fragment
import com.google.android.material.bottomnavigation.BottomNavigationMenuView
import com.google.android.material.bottomnavigation.BottomNavigationView

private const val Last_selected_fragment = "item"

class MainActivity : AppCompatActivity() {

    lateinit var switchFragmentButton: Button
    lateinit var bottomNavigationMenu: BottomNavigationView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        bottomNavigationMenu=findViewById(R.id.bottom_navigation_menu)


        fun replaceFragment (fragment:Fragment){

            supportFragmentManager
                .beginTransaction()
                .replace(R.id.fragment_conteiner,fragment)
                .commit()
        }

        bottomNavigationMenu.setOnItemSelectedListener { item->

            var fragment:Fragment?=null

            when(item.itemId){
                R.id.fragment_1 -> {
                    fragment = StartFragment()

                }
                R.id.fragment_2 -> {
                    fragment = SearchFragment() }

                R.id.fragment_3 -> {
                    fragment = EndFragment() }
            }
            replaceFragment (fragment!!)
            true
        }

        bottomNavigationMenu.selectedItemId = savedInstanceState?.getInt(Last_selected_fragment)?: R.id.fragment_1

    }

    override fun onSaveInstanceState(outState: Bundle, outPersistentState: PersistableBundle) {
        super.onSaveInstanceState(outState, outPersistentState)
        outState.putInt(Last_selected_fragment,bottomNavigationMenu.selectedItemId)
    }
}