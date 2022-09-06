package com.globomantics.login

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.Toast
import com.globomantics.loginverification.LoginVerification

class MainActivity : AppCompatActivity(), View.OnClickListener {

    private val loginVerification = LoginVerification()

    private lateinit var email: EditText
    private lateinit var password: EditText
    private lateinit var login: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        email = findViewById(R.id.editTextTextEmail)
        password = findViewById(R.id.editTextPassword)
        login = findViewById(R.id.buttonLogin)

        login.setOnClickListener(this)
    }

    override fun onClick(p0: View?) {
        if(loginVerification.verify(email.text.toString(), password.text.toString())){
            Log.d("PASSWORD SUCCESSFUL", password.text.toString())
            Toast.makeText(this, "Login Successful", Toast.LENGTH_SHORT).show()
        } else {
            Log.d("LOGIN FAILED", password.text.toString())
            Toast.makeText(this, "Login Failed", Toast.LENGTH_SHORT).show()
        }
    }
}
