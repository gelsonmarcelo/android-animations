package br.edu.ifc.fraiburgo.animationexamples

import android.app.ActivityOptions
import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import br.edu.ifc.fraiburgo.animationexamples.databinding.ActivityTransitionBetweenViewsBinding

class TransitionBetweenViewsActivity : AppCompatActivity() {

    private lateinit var binding: ActivityTransitionBetweenViewsBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityTransitionBetweenViewsBinding.inflate(layoutInflater)

        setContentView(binding.root)
        setupListeners()
    }

    private fun setupListeners() {
        binding.nextActivity.setOnClickListener {
            val bundle = ActivityOptions.makeSceneTransitionAnimation(this).toBundle()
            val intent = Intent(this, AfterActivity::class.java)

            startActivity(intent, bundle)
        }
    }
}