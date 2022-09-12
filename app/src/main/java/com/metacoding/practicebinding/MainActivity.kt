package com.metacoding.practicebinding

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.metacoding.practicebinding.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        //바인딩 객체 만들기
        val binding = ActivityMainBinding.inflate(layoutInflater)

        //액티비티 화면 출력하기
        setContentView(binding.root)

        //binding.뷰아이디로 이용하기
        binding.Button1.setOnClickListener {
            binding.textHello.text = "버튼 1 눌렸어요"
        }

        binding.Button2.setOnClickListener {
            binding.textHello.text = "버튼 2 눌렸어요"
        }
    }
}