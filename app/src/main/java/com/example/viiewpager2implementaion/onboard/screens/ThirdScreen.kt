package com.example.viiewpager2implementaion.onboard.screens

import android.annotation.SuppressLint
import android.graphics.text.LineBreaker
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.findNavController
import com.example.viiewpager2implementaion.R
import com.example.viiewpager2implementaion.databinding.FragmentThirdScreenBinding

class ThirdScreen : Fragment() {

    private var _binding : FragmentThirdScreenBinding? = null
    private val binding get() = _binding!!
    @SuppressLint("InlinedApi")
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        _binding = FragmentThirdScreenBinding.inflate(inflater, container, false)

        binding.description3.justificationMode = LineBreaker.JUSTIFICATION_MODE_INTER_WORD

        binding.next3.setOnClickListener {
            findNavController().navigate(R.id.action_viewPagerFragment_to_homeFragment)
        }

        return binding.root
    }

}