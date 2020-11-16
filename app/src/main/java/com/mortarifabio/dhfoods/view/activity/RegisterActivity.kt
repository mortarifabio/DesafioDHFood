package com.mortarifabio.dhfoods.view.activity

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import com.google.android.material.textfield.TextInputLayout
import com.mortarifabio.dhfoods.R
import com.mortarifabio.dhfoods.utils.Utils

class RegisterActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_register)
        initComponents()
    }

    private fun initComponents() {
        title = getString(R.string.register)
        supportActionBar?.setHomeButtonEnabled(true)
        supportActionBar?.setDisplayHomeAsUpEnabled(true)

        val registerButton = findViewById<Button>(R.id.btRegisterRegister)

        registerButton.setOnClickListener {
            if (canRegister()) {
                val intent = Intent(this, HomeActivity::class.java)
                startActivity(intent)
            }
        }
    }

    private fun canRegister(): Boolean {
        val etName = findViewById<EditText>(R.id.etRegisterName)
        val tilName = findViewById<TextInputLayout>(R.id.tilRegisterName)
        val etEmail = findViewById<EditText>(R.id.etRegisterEmail)
        val tilEmail = findViewById<TextInputLayout>(R.id.tilRegisterEmail)
        val etPassword = findViewById<EditText>(R.id.etRegisterPassword)
        val tilPassword = findViewById<TextInputLayout>(R.id.tilRegisterPassword)
        val etRepPassword = findViewById<EditText>(R.id.etRegisterRepeatPassword)
        val tilRepPassword = findViewById<TextInputLayout>(R.id.tilRegisterRepeatPassword)

        Utils(this).apply {
            return isEditTextFilled(etName, tilName, getString(R.string.name))
                    && isEmailValid(etEmail, tilEmail)
                    && isEditTextFilled(etPassword, tilPassword, getString(R.string.password))
                    && isEditTextFilled(etRepPassword, tilRepPassword, getString(R.string.repeat_password))
                    && isPasswordsEquals(etPassword, etRepPassword, tilRepPassword)
        }
    }

    override fun onSupportNavigateUp(): Boolean {
        onBackPressed()
        return true
    }
}