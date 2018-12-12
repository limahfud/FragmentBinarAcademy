package me.mahfud.pertemuan8

import android.os.Bundle
import android.support.design.widget.Snackbar
import android.support.v7.app.AppCompatActivity

import kotlinx.android.synthetic.main.activity_second.*
import kotlinx.android.synthetic.main.content_second.*

class SecondActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_second)
        setSupportActionBar(toolbar)

        textViewName.text = intent.getStringExtra("name")
        textViewEmail.text = intent.getStringExtra("email")
        textViewAddress.text = intent.getStringExtra("address")

    }

}
