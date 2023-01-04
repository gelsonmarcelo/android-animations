package br.edu.ifc.fraiburgo.animationexamples

import android.os.Bundle
import android.transition.Fade
import android.transition.TransitionManager
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
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
            TransitionManager.beginDelayedTransition(binding.root, Fade())
        }
    }
}