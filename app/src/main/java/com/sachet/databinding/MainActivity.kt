package com.sachet.databinding

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast
import androidx.databinding.DataBindingUtil
import com.sachet.databinding.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = DataBindingUtil.setContentView(this, R.layout.activity_main)
        binding.submitButton.setOnClickListener {
            displayGreeting()
        }
    }

    private fun displayGreeting(){
            if (binding.nameEditText.text.toString() != ""){
                binding.greetingTextView.text = "Hello! ${binding.nameEditText.text}"
            }
            else{
                Toast.makeText(this, "Please enter a name first", Toast.LENGTH_SHORT).show()
            }
    }
}