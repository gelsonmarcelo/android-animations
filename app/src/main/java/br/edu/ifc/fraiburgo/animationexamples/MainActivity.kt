package br.edu.ifc.fraiburgo.animationexamples

import android.os.Bundle
import android.transition.Scene
import android.transition.TransitionManager
import android.view.View
import androidx.appcompat.app.AppCompatActivity
import br.edu.ifc.fraiburgo.animationexamples.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityMainBinding.inflate(layoutInflater)

        setContentView(binding.root)
    }
}