package com.roberto.basani

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.LayoutInflater
import com.roberto.basani.databinding.StartPageBinding
import kotlin.concurrent.thread

class StartPage : AppCompatActivity() {
    private lateinit var binding: StartPageBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = StartPageBinding.inflate(layoutInflater)
        val view = binding.root
        setContentView(view)

        binding.startPage.translationX = -800F
        binding.startPage.alpha = 0F
        binding.startPage.animate().translationX(0F).alpha(1F).setDuration(1000).setStartDelay(600).start()

        val intent = Intent(this, MainActivity::class.java)

        //Thread.sleep(3000)

        startActivity(intent)
        //overridePendingTransition(R.anim.fade_in, R.anim.fade_out)

    }
}