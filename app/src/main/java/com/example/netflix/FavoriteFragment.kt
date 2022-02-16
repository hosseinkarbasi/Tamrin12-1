package com.example.netflix

import android.os.Bundle
import android.view.View
import androidx.databinding.DataBindingUtil
import androidx.fragment.app.Fragment
import androidx.fragment.app.activityViewModels
import com.example.netflix.databinding.FavoriteBinding

class FavoriteFragment : Fragment(R.layout.favorite) {

    private val favoriteViewModel: HomeViewModel by activityViewModels()
    private lateinit var binding: FavoriteBinding

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        binding = DataBindingUtil.bind(view)!!
        binding.status = favoriteViewModel
    }
}

