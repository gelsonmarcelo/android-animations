package br.edu.ifc.fraiburgo.animationexamples

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import br.edu.ifc.fraiburgo.animationexamples.databinding.ActivityAfterBinding

class AfterActivity : AppCompatActivity() {
    private lateinit var binding: ActivityAfterBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityAfterBinding.inflate(layoutInflater)

        setContentView(binding.root)
        setupListeners()
    }

    private fun setupListeners() {
        binding.previousActivity.setOnClickListener {
            finish()
//            overridePendingTransition(R.anim.fade_in, R.anim.fade_out)
        }
    }
}