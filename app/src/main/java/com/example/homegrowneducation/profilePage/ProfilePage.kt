package com.example.homegrowneducation.profilePage

import android.content.Intent
import android.os.Bundle
import android.widget.TextView
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import com.example.homegrowneducation.R
import com.example.homegrowneducation.databinding.ActivityProfileBinding
import com.example.homegrowneducation.loginRegister.LoginActivity
import com.example.homegrowneducation.loginRegister.MainPage
import com.google.firebase.auth.FirebaseAuth


class ProfilePage: AppCompatActivity(){

    private lateinit var auth: FirebaseAuth
    private lateinit var binding: ActivityProfileBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        var binding = ActivityProfileBinding.inflate(layoutInflater)
        setContentView(binding.root)

        auth = FirebaseAuth.getInstance()

        val user = FirebaseAuth.getInstance().currentUser
        val displayName = user?.displayName
        val displayEmail = user?.email
        if (displayName != null) {
            val textView = findViewById<TextView>(R.id.username)
            textView.text = displayName.toString()
        } else {
            Toast.makeText(this, "Display name not set", Toast.LENGTH_SHORT).show()
        }

        if (displayEmail != null) {
            val textView = findViewById<TextView>(R.id.gmail)
            textView.text = displayEmail.toString()
        } else {
            Toast.makeText(this, "Display email not set", Toast.LENGTH_SHORT).show()
        }


        binding.backbtn.setOnClickListener {
            val intent = Intent(this, MainPage::class.java)
            startActivity(intent)
        }

        binding.myAccountArrow.setOnClickListener {
            val intent = Intent(this, MyAccountActivity::class.java)
            startActivity(intent)
        }

        binding.logoutArrow.setOnClickListener {
            auth.signOut()
            Intent(this, LoginActivity::class.java).also {
                it.flags = Intent.FLAG_ACTIVITY_NEW_TASK or Intent.FLAG_ACTIVITY_CLEAR_TASK
                startActivity(it)
                Toast.makeText(this, "Logout Successfully", Toast.LENGTH_SHORT).show()
            }
        }
    }
}