package com.example.myapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView
import kotlinx.android.synthetic.main.activity_login.*
import kotlinx.android.synthetic.main.activity_profile_user.*

class ProfileUser : AppCompatActivity() {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_profile_user)

        val name = intent.getStringExtra("N")
        val email = intent.getStringExtra("E")
        val password = intent.getStringExtra("P")
        val confirm = intent.getStringExtra("C")

        tvname.text = name
        tvemail.text = email
        tvpasword.text= password
        tvcnfirm.text= confirm



        val username = intent.getStringExtra("name")
        val userpassword = intent.getStringExtra("password")


        nam.text = username
        pass.text = userpassword


    }
}