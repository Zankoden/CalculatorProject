package com.example.calculatorproject

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.calculatorproject.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        binding = ActivityMainBinding.inflate(layoutInflater)
        val view = binding.root
        setContentView(view)

        binding.btnPlus.setOnClickListener {
            val input1 = binding.editTextInput1.text.toString().toInt()
            val input2 = binding.editTextInput2.text.toString().toInt()

            binding.resultTextView.text = (input1 + input2).toString()
        }

        binding.btnMinus.setOnClickListener {
            val input1 = binding.editTextInput1.text.toString().toInt()
            val input2 = binding.editTextInput2.text.toString().toInt()

            binding.resultTextView.text = (input1 - input2).toString()
        }
    }
}