package com.metacoding.practicebinding

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.metacoding.practicebinding.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val binding = ActivityMainBinding.inflate(layoutInflater)

        setContentView(binding.root)

        binding.Button1.setOnClickListener {
            binding.textHello.text = "버튼 1 눌렸어요"
        }

        binding.Button2.setOnClickListener {
            binding.textHello.text = "버튼 2 눌렸어요"
        }

    }
}