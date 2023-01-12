package com.example.computershop

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.databinding.DataBindingUtil
import androidx.recyclerview.widget.PagerSnapHelper
import com.example.computershop.adapter.ComputerAdapter
import com.example.computershop.data.Datasource
import com.example.computershop.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = DataBindingUtil.setContentView(this, R.layout.activity_main)

        val datasource = Datasource()
        val computerList = datasource.getComputers()

        binding.computerRecycler.adapter = ComputerAdapter(this,computerList)

    }
}