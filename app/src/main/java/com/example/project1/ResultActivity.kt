package com.example.project1


import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.project1.MainActivity.Companion.EMAIL_ARG
import com.example.project1.MainActivity.Companion.MESSAGE_ARG
import com.example.project1.databinding.ActivityResultBinding

class ResultActivity : AppCompatActivity() {
    private lateinit var binding: ActivityResultBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityResultBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.tvEmail.text = intent.extras?.getString(EMAIL_ARG)
        binding.tvMessage.text = intent.extras?.getString(MESSAGE_ARG)

        binding.btnClear.setOnClickListener {
            binding.tvEmail.text = ""
            binding.tvMessage.text = ""
        }
    }
}
