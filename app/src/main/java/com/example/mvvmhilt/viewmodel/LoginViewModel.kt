package com.example.mvvmhilt.viewmodel

import androidx.lifecycle.ViewModel
import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import com.example.mvvmhilt.repository.UserRepository
import dagger.hilt.android.lifecycle.HiltViewModel
import javax.inject.Inject

@HiltViewModel
class LoginViewModel @Inject constructor(
    private val userRepository: UserRepository
) : ViewModel() {

    val email = MutableLiveData("")
    val password = MutableLiveData("")

    private val _toastMessage = MutableLiveData<String?>()
    val toastMessage: LiveData<String?> get() = _toastMessage

    fun onLoginClicked() {
        val isValid = userRepository.login(email.value ?: "", password.value ?: "")
        _toastMessage.value = if (isValid) "Login successful" else "Login failed"
    }

    fun clearToast() {
        _toastMessage.value = null
    }
}
