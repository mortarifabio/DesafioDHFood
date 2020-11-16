package com.mortarifabio.dhfoods.view.activity

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import com.google.android.material.textfield.TextInputLayout
import com.mortarifabio.dhfoods.R
import com.mortarifabio.dhfoods.utils.Utils

class LoginActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)
        initComponents()
    }

    private fun initComponents() {
        val loginButton = findViewById<Button>(R.id.btLoginLogin)
        val registerButton = findViewById<Button>(R.id.btLoginRegister)

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
        val etEmail = findViewById<EditText>(R.id.etLoginEmail)
        val tilEmail = findViewById<TextInputLayout>(R.id.tilLoginEmail)
        val etPassword = findViewById<EditText>(R.id.etLoginPassword)
        val tilPassword = findViewById<TextInputLayout>(R.id.tilLoginPassword)

        Utils(this).apply {
            return isEmailValid(etEmail, tilEmail)
                    && isEditTextFilled(etPassword, tilPassword, getString(R.string.password))
        }
    }

}