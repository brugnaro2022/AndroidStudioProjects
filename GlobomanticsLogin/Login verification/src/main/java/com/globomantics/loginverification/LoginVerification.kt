package com.globomantics.loginverification

class LoginVerification {
    fun verify(email: String, password: String): Boolean {
        return email == "test@globomantics.com" &&
                password == "test123"
    }
}