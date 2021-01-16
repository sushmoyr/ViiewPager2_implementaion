package com.example.viiewpager2implementaion

import android.graphics.Color
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.viiewpager2implementaion.databinding.FragmentHomeBinding
import nl.dionsegijn.konfetti.models.Shape
import nl.dionsegijn.konfetti.models.Size

class HomeFragment : Fragment() {

    private var _binding : FragmentHomeBinding? = null
    private val binding get() = _binding!!
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        _binding = FragmentHomeBinding.inflate(inflater, container, false)
        Particle()

        binding.imageView6.setOnClickListener{
            Snow()
        }


        return binding.root
    }

    private fun Particle()
    {
        binding.viewConfetti.build()
            .addColors(Color.CYAN, Color.GREEN, Color.MAGENTA, Color.YELLOW)
            .setDirection(0.0, 359.0)
            .setSpeed(3f, 9f)
            .setFadeOutEnabled(true)
            .setTimeToLive(2500L)
            .addShapes(Shape.RECT, Shape.CIRCLE)
            .addSizes(Size(12))
            .setPosition(-50f, binding.viewConfetti.width + 50f, -50f, 50f)
            .stream(400, 4500L)
    }

    private fun Snow()
    {
        binding.viewConfetti.build()
            .addColors(Color.CYAN)
            .setDirection(0.0, 359.0)
            .setSpeed(1f, 3f)
            .setFadeOutEnabled(true)
            .setTimeToLive(5500L)
            .addShapes(Shape.CIRCLE)
            .addSizes(Size(6))
            .setPosition(-50f, binding.viewConfetti.width + 50f, -50f, 50f)
            .stream(100, 8500L)
    }

}