package com.example.netflix

import android.os.Bundle
import android.view.View
import androidx.databinding.DataBindingUtil
import androidx.fragment.app.Fragment
import androidx.fragment.app.activityViewModels
import androidx.navigation.fragment.navArgs
import com.example.netflix.databinding.ProfileBinding
import com.google.android.material.snackbar.Snackbar

class ProfileFragment : Fragment(R.layout.profile) {
    private lateinit var binding: ProfileBinding
    private val registerViewModel: RegisterViewModel by activityViewModels()

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        binding = DataBindingUtil.bind(view)!!
        val navArgs: ProfileFragmentArgs by navArgs()

        registerViewModel.data.observe(viewLifecycleOwner) {
            if (it) {
                Snackbar.make(
                    view,
                    "Your Information Saved",
                    Snackbar.LENGTH_LONG
                ).show()
            }
        }

        with(binding) {
            profileImage.setImageURI(navArgs.imageUri)
            tvFirstName.text = navArgs.firstname
            tvUserName.text = navArgs.username
            tvEmail.text = navArgs.email
            tvLastName.text = navArgs.lastname
            tvPhoneNumber.text = navArgs.phonenumber
        }
    }
}