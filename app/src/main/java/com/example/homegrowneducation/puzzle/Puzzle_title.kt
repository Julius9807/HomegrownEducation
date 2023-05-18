package com.example.homegrowneducation.puzzle

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.navigation.findNavController
import com.example.homegrowneducation.R
import com.example.homegrowneducation.databinding.PuzzleTitleBinding

class Puzzle_title: Fragment() {

    private lateinit var binding: PuzzleTitleBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
    binding = PuzzleTitleBinding.inflate(layoutInflater)

    binding.puzzleBackButton.setOnClickListener{
            view : View -> view.findNavController().navigate(R.id.action_puzzle_title_to_puzzle_easy)
    }

    binding.easyPuzzleArrow.setOnClickListener{
        view : View -> view.findNavController().navigate(R.id.action_puzzle_title_to_puzzle_easy)
    }
    binding.normalPuzzleArrow.setOnClickListener {
        view : View -> view.findNavController().navigate(R.id.action_puzzle_title_to_puzzle_normal)
    }
    binding.hardPuzzleArrow.setOnClickListener {
        view : View -> view.findNavController().navigate(R.id.action_puzzle_title_to_puzzle_hard)
    }
        return binding.root
    }
}