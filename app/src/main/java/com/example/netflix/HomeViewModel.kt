package com.example.netflix

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class HomeViewModel : ViewModel() {

    val fav1: MutableLiveData<Boolean> = MutableLiveData()
    val fav2: MutableLiveData<Boolean> = MutableLiveData()
    val fav3: MutableLiveData<Boolean> = MutableLiveData()
    val fav4: MutableLiveData<Boolean> = MutableLiveData()
    val fav5: MutableLiveData<Boolean> = MutableLiveData()
    val fav6: MutableLiveData<Boolean> = MutableLiveData()
    val fav7: MutableLiveData<Boolean> = MutableLiveData()
    val fav8: MutableLiveData<Boolean> = MutableLiveData()
    val fav9: MutableLiveData<Boolean> = MutableLiveData()
    val fav10: MutableLiveData<Boolean> = MutableLiveData()
    val fav11: MutableLiveData<Boolean> = MutableLiveData()
    val fav12: MutableLiveData<Boolean> = MutableLiveData()
    val fav13: MutableLiveData<Boolean> = MutableLiveData()
    val fav14: MutableLiveData<Boolean> = MutableLiveData()
    val fav15: MutableLiveData<Boolean> = MutableLiveData()
    val fav16: MutableLiveData<Boolean> = MutableLiveData()
    val fav17: MutableLiveData<Boolean> = MutableLiveData()
    val fav18: MutableLiveData<Boolean> = MutableLiveData()
    val fav19: MutableLiveData<Boolean> = MutableLiveData()
    val fav20: MutableLiveData<Boolean> = MutableLiveData()
    val fav21: MutableLiveData<Boolean> = MutableLiveData()


    init {
        fav1.value = false
        fav2.value = false
        fav3.value = false
        fav4.value = false
        fav5.value = false
        fav6.value = false
        fav7.value = false
        fav8.value = false
        fav9.value = false
        fav10.value = false
        fav11.value = false
        fav12.value = false
        fav13.value = false
        fav14.value = false
        fav15.value = false
        fav16.value = false
        fav17.value = false
        fav18.value = false
        fav19.value = false
        fav20.value = false
        fav21.value = false
    }

    fun favorite1() {
        fav1.value = true
    }

    fun favorite2() {
        fav2.value = true
    }

    fun favorite3() {
        fav3.value = true
    }

    fun favorite4() {
        fav4.value = true
    }

    fun favorite5() {
        fav5.value = true
    }

    fun favorite6() {
        fav6.value = true
    }

    fun favorite7() {
        fav7.value = true
    }

    fun favorite8() {
        fav8.value = true
    }

    fun favorite9() {
        fav9.value = true
    }

    fun favorite10() {
        fav10.value = true
    }

    fun favorite11() {
        fav11.value = true
    }

    fun favorite12() {
        fav12.value = true
    }

    fun favorite13() {
        fav13.value = true
    }

    fun favorite14() {
        fav14.value = true
    }

    fun favorite15() {
        fav15.value = true
    }

    fun favorite16() {
        fav16.value = true
    }

    fun favorite17() {
        fav17.value = true
    }

    fun favorite18() {
        fav18.value = true
    }

    fun favorite19() {
        fav19.value = true
    }

    fun favorite20() {
        fav20.value = true
    }

    fun favorite21() {
        fav21.value = true
    }

}