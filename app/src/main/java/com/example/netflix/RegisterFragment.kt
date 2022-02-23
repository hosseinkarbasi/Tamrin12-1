package com.example.netflix

import android.net.Uri
import android.os.Bundle
import android.util.Patterns
import android.view.View
import androidx.activity.result.contract.ActivityResultContracts
import androidx.databinding.DataBindingUtil
import androidx.fragment.app.Fragment
import androidx.fragment.app.activityViewModels
import com.example.netflix.databinding.RegisterBinding
import java.io.InputStream

class RegisterFragment : Fragment(R.layout.register) {

    private lateinit var imageAddresses: Uri
    private lateinit var binding: RegisterBinding
    private val registerViewModel: RegisterViewModel by activityViewModels()

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        binding = DataBindingUtil.bind(view)!!

        with(binding) {
            btnRegister.setOnClickListener {

                if (!validateFirstName() || !validateLastName() || !validateEmail()) {
                    return@setOnClickListener

                } else {
                    val stream: InputStream? =
                        requireContext().contentResolver.openInputStream(imageAddresses)
                    registerViewModel.uploadImageProfile(stream!!.readBytes())

                    registerViewModel.isRegister()

                    registerViewModel.signUp(
                        edUserName.text.toString(),
                        edFirstName.text.toString(),
                        edLastName.text.toString(),
                        edEmail.text.toString(),
                        edPhoneNumber.text.toString(),
                        imageAddresses,
                        this@RegisterFragment
                    )
                }
            }
            selectImageFromGallery()
        }
    }

    private fun RegisterBinding.selectImageFromGallery() {
        val loadImage = registerForActivityResult(ActivityResultContracts.GetContent()) {
            imageAddresses = it
            btnSelectImgProfile.setImageURI(it)
        }
        btnSelectImgProfile.setOnClickListener {
            loadImage.launch("image/*")
        }
    }

    private fun validateFirstName(): Boolean {
        return if (binding.edFirstName.text!!.isEmpty()) {
            binding.textInputFirstName.error = "Field can not be empty"
            false
        } else {
            binding.textInputFirstName.error = null
            true
        }
    }

    private fun validateLastName(): Boolean {
        return if (binding.edLastName.text!!.isEmpty()) {
            binding.textInputLastName.error = "Field can not be empty"
            false
        } else {
            binding.textInputLastName.error = null
            true
        }
    }

    private fun validateEmail(): Boolean {
        return if (binding.edEmail.text!!.isEmpty()) {
            binding.textInputEmail.error = "Field can not be empty"
            false
        } else if (!Patterns.EMAIL_ADDRESS.matcher(binding.edEmail.text.toString()).matches()) {
            binding.textInputEmail.error = "Please enter a valid email address"
            false
        } else {
            binding.textInputEmail.error = null
            true
        }
    }
}




