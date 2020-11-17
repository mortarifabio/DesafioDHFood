package com.mortarifabio.dhfoods.view.activity

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.mortarifabio.dhfoods.R
import com.mortarifabio.dhfoods.databinding.ActivityLoginBinding
import com.mortarifabio.dhfoods.utils.Utils

class LoginActivity : AppCompatActivity() {

    private lateinit var binding: ActivityLoginBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityLoginBinding.inflate(layoutInflater)
        setContentView(binding.root)
        initComponents()
    }

    private fun initComponents() {
        val loginButton = binding.btLoginLogin
        val registerButton = binding.btLoginRegister

        loginButton.setOnClickListener {
            if (canLogin()) {
                val intent = Intent(this, HomeActivity::class.java)
                startActivity(intent)
            }
        }

        registerButton.setOnClickListener {
            val intent = Intent(this, RegisterActivity::class.java)
            startActivity(intent)
        }
    }

    private fun canLogin(): Boolean {
        val etEmail = binding.etLoginEmail
        val tilEmail = binding.tilLoginEmail
        val etPassword = binding.etLoginPassword
        val tilPassword = binding.tilLoginPassword

        Utils(this).apply {
            return isEmailValid(etEmail, tilEmail)
                    && isEditTextFilled(etPassword, tilPassword, getString(R.string.password))
        }
    }

}