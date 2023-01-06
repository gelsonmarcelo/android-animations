package br.edu.ifc.fraiburgo.animationexamples

import android.content.Intent
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController
import br.edu.ifc.fraiburgo.animationexamples.databinding.FragmentStartBinding

class StartFragment : Fragment() {

    private lateinit var binding: FragmentStartBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        binding = FragmentStartBinding.inflate(layoutInflater)

        setupListeners()

        return binding.root
    }

    private fun setupListeners() {
        binding.basicAnimationsButton.setOnClickListener {
            navigateToBasicAnimationFragment()
        }

        binding.animationsChangingScreen.setOnClickListener {
            navigateToAnimationChangingScreenFragment()
        }

        binding.animationsBetweenActivity.setOnClickListener {
            startAnimationBetweenActivity()
        }
    }

    private fun navigateToBasicAnimationFragment() {
        findNavController().navigate(R.id.basicAnimationFragment)
    }

    private fun navigateToAnimationChangingScreenFragment() {
        findNavController().navigate(R.id.animationChangingScreenFragment)
    }

    private fun startAnimationBetweenActivity() {
        val intent = Intent(requireContext(), TransitionBetweenViewsActivity::class.java)
        startActivity(intent)
    }
}