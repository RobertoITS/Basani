package com.roberto.basani.adapters

import android.content.Context
import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentManager
import androidx.fragment.app.FragmentPagerAdapter
import com.roberto.basani.LoadFragment
import com.roberto.basani.SearchFragment
import com.roberto.basani.StartFragment

class TabAdapter(private val context: Context,
                 fm: FragmentManager,
                 private val tabCount: Int) : FragmentPagerAdapter(fm) {
    override fun getCount(): Int {
        return tabCount
    }

    override fun getItem(position: Int): Fragment {
        return when (position){
            0 ->{
                StartFragment()
            }
            1 ->{
                LoadFragment()
            }
            2 ->{
                SearchFragment()
            }
            else ->{
                null!!
            }
        }
    }
}
