package com.example.homegrowneducation.course

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.homegrowneducation.databinding.CourseMainBinding

class Course_main : AppCompatActivity() {
    private lateinit var binding: CourseMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = CourseMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

    }
}