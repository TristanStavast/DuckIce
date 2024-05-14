package com.example.duckice

import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import androidx.fragment.app.Fragment
import com.google.android.material.bottomnavigation.BottomNavigationView

private val fragEat = EatFragment()
private val fragPlay = PlayFragment()
private val fragBath = BathFragment()

class MenuBar : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_menu_bar)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
        replaceFrag(fragEat)
        val bottomBar = findViewById<BottomNavigationView>(R.id.NavBar)
        bottomBar.setOnItemSelectedListener {
            when(it.itemId)
            {
                R.id.eat->replaceFrag(fragEat)
                R.id.play->replaceFrag(fragPlay)
                R.id.bath->replaceFrag(fragBath)
            }
            true
        }
    }

    private fun replaceFrag(fragment: Fragment)
    {
        if(fragment != null)
        {
            val trans = supportFragmentManager.beginTransaction()
            trans.replace(R.id.frameLayout, fragment)
            trans.commit()
        }
    }
}