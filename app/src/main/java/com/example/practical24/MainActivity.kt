package com.example.practical24

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.databinding.DataBindingUtil
import com.example.practical24.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    //private val myName: MyName = MyName("Aleks Haecky","da")
    private lateinit var binding : ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        binding = DataBindingUtil.setContentView(this, R.layout.activity_main)

        binding.tvStudIDF.text = "21WMR05283"

        binding.btnUpdate.setOnClickListener {

        }

    }
}