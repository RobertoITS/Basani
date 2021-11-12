package com.roberto.basani.adapters

import android.content.Context
import android.view.View
import androidx.fragment.app.FragmentManager
import androidx.fragment.app.FragmentPagerAdapter
import androidx.viewpager.widget.PagerAdapter

class TabAdapter(private val context: Context,
                 fm: FragmentManager,
                 private val tabCount: Int) : FragmentPagerAdapter(fm) {
}
