package com.example.netflix

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.CheckBox
import androidx.databinding.DataBindingUtil
import androidx.fragment.app.Fragment
import androidx.fragment.app.activityViewModels
import com.example.netflix.databinding.HomeBinding

class HomeFragment : Fragment(R.layout.home) {

    private lateinit var binding: HomeBinding
    private val registerViewModel: RegisterViewModel by activityViewModels()
    private val homeViewModel: HomeViewModel by activityViewModels()

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        binding = DataBindingUtil.bind(view)!!
        binding.favstatus = homeViewModel
        binding.favoriteBtnVisibility = registerViewModel

    }
}







