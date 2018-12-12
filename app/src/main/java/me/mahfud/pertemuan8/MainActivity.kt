package me.mahfud.pertemuan8

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.EditText
import android.widget.TextView
import kotlinx.android.synthetic.main.activity_main.*
import org.jetbrains.anko.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        buttonSubmit.setOnClickListener {
            val email = editTextEmail.text.toString()
            val name = editTextName.text.toString()
            val address = editTextAddress.text.toString()

            startActivity(intentFor<SecondActivity>(
                    "email" to email,
                    "name" to name,
                    "address" to address
            ))
        }

        buttonSnackbar.setOnClickListener {
//            startActivity<ConstraintActivity>()
            startActivity<ViewPagerActivity>()
//            (buttonSubmit as View).snackbar("Hi there")
        }

        buttonToast.setOnClickListener {
            toast("Hello, this is toast message")
        }

        buttonAlert.setOnClickListener {
            alert("Hi, There", "Have you turning it off and on?") {
                yesButton {
                    toast("It a yes")
                }

                noButton {
                    toast("It is a no")
                }
            }.show()
        }
    }
}
