package com.example.computershop.data

import com.example.computershop.R
import com.example.computershop.data.model.Computer

class Datasource {

    fun getComputers(): List<Computer>{
        return listOf(
            Computer("PC - CSL Sprint 5607 ", 899.0, R.drawable.computer1, "Mit dem PC - CSL Sprint 5607 präsentieren wir Ihnen einen WQHD Gaming-PC", false),
            Computer("PC - CSL Sprint 4557 ", 659.0, R.drawable.computer2, "Mit dem PC - CSL Sprint 4557 präsentieren wir Ihnen einen WQHD Gaming-PC", false),
            Computer("PC - CSL Sprint 8990 ", 479.0, R.drawable.computer3, "Mit dem PC - CSL Sprint 8990 präsentieren wir Ihnen einen WQHD Gaming-PC", true),
            Computer("PC - CSL Sprint 2550 ", 1229.0, R.drawable.computer4, "Mit dem PC - CSL Sprint 2550 präsentieren wir Ihnen einen WQHD Gaming-PC", false),
            Computer("PC - CSL Sprint 1133 ", 789.0, R.drawable.computer5, "Mit dem PC - CSL Sprint 1133 präsentieren wir Ihnen einen WQHD Gaming-PC", true),
        )
    }
}