package com.example.mvvmhilt.repository

import javax.inject.Inject
import javax.inject.Singleton

@Singleton
class UserRepository @Inject constructor() {
    fun login(email: String, password: String): Boolean {
        // 실제로는 API 통신 등 처리
        return email == "test@test.com" && password == "123456"
    }
}
