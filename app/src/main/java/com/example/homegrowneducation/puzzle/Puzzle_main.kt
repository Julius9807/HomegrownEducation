package com.example.homegrowneducation.puzzle

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.homegrowneducation.databinding.PuzzleMainBinding


class Puzzle_main : AppCompatActivity() {

    private lateinit var binding: PuzzleMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = PuzzleMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

    }

}