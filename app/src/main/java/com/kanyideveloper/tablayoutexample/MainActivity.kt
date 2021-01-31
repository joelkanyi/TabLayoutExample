package com.kanyideveloper.tablayoutexample

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.viewpager.widget.ViewPager
import com.google.android.material.tabs.TabLayout
import com.kanyideveloper.tablayoutexample.adapters.ViewPagerAdapter
import com.kanyideveloper.tablayoutexample.fragments.FavouritesFragment
import com.kanyideveloper.tablayoutexample.fragments.HomeFragment
import com.kanyideveloper.tablayoutexample.fragments.SettingsFragment

class MainActivity : AppCompatActivity() {

    private lateinit var viewPager : ViewPager
    private lateinit var tabs: TabLayout

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        viewPager = findViewById(R.id.viewPager)
        tabs = findViewById(R.id.tabLayout)

        setupTabs()
    }

    private fun setupTabs(){
        val adapter = ViewPagerAdapter(supportFragmentManager)
        adapter.addFragment(HomeFragment(),"Home")
        adapter.addFragment(FavouritesFragment(),"Favourites")
        adapter.addFragment(SettingsFragment(),"Settings")

        viewPager.adapter = adapter
        tabs.setupWithViewPager(viewPager)

        tabs.getTabAt(0)!!.setIcon(R.drawable.ic_baseline_home_24)
        tabs.getTabAt(1)!!.setIcon(R.drawable.ic_baseline_favorite_24)
        tabs.getTabAt(2)!!.setIcon(R.drawable.ic_baseline_settings_24)
    }
}