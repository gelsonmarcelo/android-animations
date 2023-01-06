package br.edu.ifc.fraiburgo.animationexamples

import android.os.Bundle
import android.transition.Scene
import android.transition.Transition
import android.transition.TransitionInflater
import android.transition.TransitionManager
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import br.edu.ifc.fraiburgo.animationexamples.databinding.FragmentAnimationChangingScreenBinding

class AnimationChangingScreenFragment : Fragment() {

    private lateinit var binding: FragmentAnimationChangingScreenBinding
    private lateinit var sceneOne: Scene
    private lateinit var sceneTwo: Scene
    private var startAnimation = true
    private lateinit var customTransition: Transition

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        binding = FragmentAnimationChangingScreenBinding.inflate(layoutInflater)

        customTransition = TransitionInflater.from(requireContext())
            .inflateTransition(R.transition.custom_scene_transition)

        setupListeners()
        setupScenes()

        return binding.root
    }

    private fun setupListeners() {
        binding.changeSceneButton.setOnClickListener {
            changeScene()
        }
    }

    private fun setupScenes() {
        sceneOne = Scene.getSceneForLayout(
            binding.animatedContainer,
            R.layout.fragment_animation_changing_screen_1,
            requireContext()
        )

        sceneTwo = Scene.getSceneForLayout(
            binding.animatedContainer,
            R.layout.fragment_animation_changing_screen_2,
            requireContext()
        )
    }

    private fun changeScene() {
        startAnimation = if (startAnimation) {
            TransitionManager.go(sceneTwo, customTransition)
            false
        } else {
            TransitionManager.go(sceneOne, customTransition)
            true
        }
    }
}
