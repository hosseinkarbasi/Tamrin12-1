package com.example.netflix

import android.net.Uri
import android.util.Log
import androidx.fragment.app.Fragment
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.navigation.fragment.findNavController
import com.example.netflix.Network.NetworkManager
import okhttp3.MediaType
import okhttp3.MultipartBody
import okhttp3.RequestBody
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response

class RegisterViewModel : ViewModel() {

    val isRegisterLiveData: MutableLiveData<Boolean> = MutableLiveData()
    val data = MutableLiveData<Boolean>()

    init {
        data.value = false
        isRegisterLiveData.value = false
    }

    fun signUp(
        userName: String,
        firstName: String,
        lastName: String,
        email: String,
        phoneNumber: String,
        imageAddresses: Uri,
        nav: Fragment
    ) {
        nav.findNavController().navigate(
            RegisterFragmentDirections.actionRegisterFragmentToProfileFragment(
                userName,
                firstName,
                lastName,
                email,
                phoneNumber,
                imageAddresses
            )
        )
    }

    fun isRegister() {
        isRegisterLiveData.value = true
    }

    fun uploadImageProfile(src: ByteArray) {
        val part = MultipartBody.Part.createFormData(
            "image",
            "hosseink.png",
            RequestBody.create(MediaType.parse("image/*"), src)
        )

        NetworkManager.service.uploadImage("hossein", part).enqueue(
            object : Callback<Any> {

                override fun onResponse(call: Call<Any>, response: Response<Any>) {
                    Log.d("Tag", "success")
                    data.value = true
                }
                override fun onFailure(call: Call<Any>, t: Throwable) {
                    Log.d("Tag", t.message.toString())
                }
            })
    }
}