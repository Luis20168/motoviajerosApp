package com.example.motoviajerosapp.ui.main

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.motoviajerosapp.R
import com.example.motoviajerosapp.databinding.FragmentHomeBinding


class HomeFragment : Fragment() {

    private var _binding:FragmentHomeBinding?= null
    private val binding get() = _binding!!




    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        _binding= FragmentHomeBinding.inflate(layoutInflater,container, false)

        return binding.root
    }


}