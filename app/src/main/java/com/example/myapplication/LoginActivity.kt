package com.example.myapplication

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import kotlinx.android.synthetic.main.activity_login.*
import kotlinx.android.synthetic.main.activity_start.*

class LoginActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)

        back.setOnClickListener {
            finish()
        }

        btnsend.setOnClickListener {
            startActivity(
                Intent(this, ProfileUser::class.java)
                    .putExtra("name", editusername.text.toString())
                    .putExtra("password", edituserpassword.text.toString())
            )

        }

        btncreate.setOnClickListener {
            val createIntent = Intent(this, SignUpActivity::class.java)
            startActivity(createIntent)
        }
    }
}