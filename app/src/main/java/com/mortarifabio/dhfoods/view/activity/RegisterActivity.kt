package com.mortarifabio.dhfoods.view.activity

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.mortarifabio.dhfoods.R
import com.mortarifabio.dhfoods.databinding.ActivityRegisterBinding
import com.mortarifabio.dhfoods.utils.Utils

class RegisterActivity : AppCompatActivity() {

    private lateinit var binding: ActivityRegisterBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityRegisterBinding.inflate(layoutInflater)
        setContentView(binding.root)
        initComponents()
    }

    private fun initComponents() {
        title = getString(R.string.register)
        supportActionBar?.setHomeButtonEnabled(true)
        supportActionBar?.setDisplayHomeAsUpEnabled(true)

        val registerButton = binding.btRegisterRegister

        registerButton.setOnClickListener {
            if (canRegister()) {
                val intent = Intent(this, HomeActivity::class.java)
                startActivity(intent)
            }
        }
    }

    private fun canRegister(): Boolean {
        val etName = binding.etRegisterName
        val tilName = binding.tilRegisterName
        val etEmail = binding.etRegisterEmail
        val tilEmail = binding.tilRegisterEmail
        val etPassword = binding.etRegisterPassword
        val tilPassword = binding.tilRegisterPassword
        val etRepPassword = binding.etRegisterRepeatPassword
        val tilRepPassword = binding.tilRegisterRepeatPassword

        Utils(this).apply {
            return isEditTextFilled(etName, tilName, getString(R.string.name))
                    && isEmailValid(etEmail, tilEmail)
                    && isEditTextFilled(etPassword, tilPassword, getString(R.string.password))
                    && isEditTextFilled(
                etRepPassword,
                tilRepPassword,
                getString(R.string.repeat_password)
            )
                    && isPasswordsEquals(etPassword, etRepPassword, tilRepPassword)
        }
    }

    override fun onSupportNavigateUp(): Boolean {
        onBackPressed()
        return true
    }
}