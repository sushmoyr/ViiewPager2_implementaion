package com.example.viiewpager2implementaion.onboard

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.viiewpager2implementaion.R
import com.example.viiewpager2implementaion.databinding.FragmentViewPagerBinding
import com.example.viiewpager2implementaion.onboard.screens.FirstScreen
import com.example.viiewpager2implementaion.onboard.screens.SecondScreen
import com.example.viiewpager2implementaion.onboard.screens.ThirdScreen

class ViewPagerFragment : Fragment() {

    private var _binding: FragmentViewPagerBinding? = null
    private val binding get() = _binding!!
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        _binding = FragmentViewPagerBinding.inflate(inflater, container, false)


        val fragmentList = arrayListOf<Fragment>(
            FirstScreen(),
            SecondScreen(),
            ThirdScreen()
        )

        val adapter = ViewPagerAdapter(
            fragmentList,
            requireActivity().supportFragmentManager,
            lifecycle
        )

        binding.viewPager.adapter = adapter


        return binding.root
    }
    override fun onDestroyView()
    {
        super.onDestroyView()
        _binding = null
    }

}