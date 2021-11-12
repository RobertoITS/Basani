package com.roberto.basani

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.LayoutInflater
import com.google.android.material.tabs.TabLayout
import com.roberto.basani.databinding.StartPageBinding
import kotlin.concurrent.thread

class StartPage : AppCompatActivity() {
    private lateinit var binding: StartPageBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = StartPageBinding.inflate(layoutInflater)
        val view = binding.root
        setContentView(view)

        binding.table.addTab(binding.table.newTab().setText(getString(R.string.start)))
        binding.table.addTab(binding.table.newTab().setText(getString(R.string.load)))
        binding.table.addTab(binding.table.newTab().setText(getString(R.string.search)))
        binding.table.tabGravity = TabLayout.GRAVITY_FILL
        val adapter = com.roberto.basani.adapters.TabAdapter(
            this,
            supportFragmentManager,
            binding.table.tabCount
        )
        binding.pager.adapter = adapter
        binding.pager.addOnPageChangeListener(TabLayout.TabLayoutOnPageChangeListener(binding.table))
        binding.table.addOnTabSelectedListener(object: TabLayout.OnTabSelectedListener{
            override fun onTabSelected(tab: TabLayout.Tab?) {
                binding.pager.currentItem = tab!!.position
            }

            override fun onTabUnselected(tab: TabLayout.Tab?) {
            }

            override fun onTabReselected(tab: TabLayout.Tab?) {
            }

        })

    }
}