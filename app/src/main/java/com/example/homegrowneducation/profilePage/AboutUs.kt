package com.example.homegrowneducation.profilePage

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.navigation.findNavController
import com.example.homegrowneducation.R
import com.example.homegrowneducation.databinding.Course1Binding

class AboutUs : Fragment() {



    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        val binding = DataBindingUtil.inflate<Course1Binding>(
            inflater, R.layout.course_1, container, false
        )

        binding.courseBackButton.setOnClickListener {
            view : View -> view.findNavController().navigate(R.id.action_aboutUs_to_profilePage)
        }

        return binding.root
    }


}