package com.example.myapplication

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import kotlinx.android.synthetic.main.activity_sign_up.*
import kotlinx.android.synthetic.main.activity_start.*

class SignUpActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_sign_up)


        btnregister.setOnClickListener {
            val registerIntent = Intent(this, ProfileUser::class.java)
                .putExtra("N",editName.text.toString())
                .putExtra("E",editEmail.text.toString())
                .putExtra("P",editPassword.text.toString())
                .putExtra("C",editConfirm.text.toString())

            startActivity(registerIntent)
        }


    }
}