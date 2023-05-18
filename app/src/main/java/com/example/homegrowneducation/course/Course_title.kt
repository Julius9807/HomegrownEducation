package com.example.homegrowneducation.course
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.navigation.findNavController
import com.example.homegrowneducation.R
import com.example.homegrowneducation.databinding.CourseTitleBinding

class Course_title: Fragment() {

    private lateinit var binding: CourseTitleBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = CourseTitleBinding.inflate(layoutInflater)

        binding.courseBackButton.setOnClickListener {view: View ->
            view.findNavController().navigate(R.id.action_course_title_to_mainPage)
        }

        binding.courseArrow1.setOnClickListener { view: View ->
            view.findNavController().navigate(R.id.action_course_title_to_course_2)
        }
        binding.courseArrow2.setOnClickListener { view: View ->
            view.findNavController().navigate(R.id.action_course_title_to_course_2)
        }
        binding.courseArrow3.setOnClickListener { view: View ->
            view.findNavController().navigate(R.id.action_course_title_to_course_3)
        }
        binding.courseArrow4.setOnClickListener { view: View ->
            view.findNavController().navigate(R.id.action_course_title_to_course_4)
        }
        binding.courseArrow4.setOnClickListener { view: View ->
            view.findNavController().navigate(R.id.action_course_title_to_course_5)
        }

        return binding.root
    }
}