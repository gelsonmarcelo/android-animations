package br.edu.ifc.fraiburgo.animationexamples

import android.os.Bundle
import android.transition.Explode
import android.transition.Fade
import android.transition.Slide
import android.transition.TransitionManager
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.core.view.isVisible
import androidx.fragment.app.Fragment
import br.edu.ifc.fraiburgo.animationexamples.databinding.FragmentBasicAnimationBinding

class BasicAnimationFragment : Fragment() {

    private lateinit var binding: FragmentBasicAnimationBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        binding = FragmentBasicAnimationBinding.inflate(layoutInflater)

        setupListeners()

        return binding.root
    }

    private fun setupListeners() {
        binding.fadeButton.setOnClickListener {
            TransitionManager.beginDelayedTransition(binding.animatedContainer, Fade())
            binding.image.isVisible = binding.image.isVisible.not()
        }

        binding.explodeButton.setOnClickListener {
            TransitionManager.beginDelayedTransition(binding.animatedContainer, Explode())
            binding.image.isVisible = binding.image.isVisible.not()
        }

        binding.slideButton.setOnClickListener {
            TransitionManager.beginDelayedTransition(binding.animatedContainer, Slide())
            binding.image.isVisible = binding.image.isVisible.not()
        }
    }
}