package com.example.viiewpager2implementaion.onboard.screens

import android.annotation.SuppressLint
import android.graphics.text.LineBreaker
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.viewpager2.widget.ViewPager2
import com.example.viiewpager2implementaion.R
import com.example.viiewpager2implementaion.databinding.FragmentFirstScreenBinding
import com.example.viiewpager2implementaion.databinding.FragmentSecondScreenBinding

class SecondScreen : Fragment() {

    private var _binding : FragmentSecondScreenBinding? = null
    private val binding get() = _binding!!
    @SuppressLint("InlinedApi")
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        _binding = FragmentSecondScreenBinding.inflate(inflater, container, false)

        val viewPager = activity?.findViewById<ViewPager2>(R.id.viewPager)

        binding.description2.justificationMode = LineBreaker.JUSTIFICATION_MODE_INTER_WORD

        binding.next2.setOnClickListener {
            viewPager?.currentItem = 2
        }

        return binding.root
    }
}