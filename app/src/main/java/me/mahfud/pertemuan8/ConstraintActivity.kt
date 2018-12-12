package me.mahfud.pertemuan8

import android.os.Bundle
import android.support.design.widget.Snackbar
import android.support.v7.app.AppCompatActivity
import android.support.v7.widget.LinearLayoutManager
import android.support.v7.widget.RecyclerView
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup

import kotlinx.android.synthetic.main.activity_constraint.*
import kotlinx.android.synthetic.main.content_constraint.*
import kotlinx.android.synthetic.main.content_second.view.*
import kotlinx.android.synthetic.main.layout_item_user.view.*

class ConstraintActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_constraint)
        setSupportActionBar(toolbar)

        val listUser = listOf<User>(
                User("A", 10, "Jogja"),
                User("B", 11, "Jogja A"),
                User("C", 12, "Jogja B"),
                User("D", 13, "Jogja C"),
                User("E", 14, "Jogja D")
        )

        recyclerViewUser.layoutManager = LinearLayoutManager(this)
        recyclerViewUser.adapter = UserAdapter(listUser)
    }

    class UserAdapter(val listUser: List<User>) : RecyclerView.Adapter<UserHolder>() {
        override fun onCreateViewHolder(parent: ViewGroup, p1: Int): UserHolder {
            val view = LayoutInflater.from(parent.context).inflate(R.layout.layout_item_user, parent, false)
            return UserHolder(view)
        }

        override fun getItemCount(): Int = listUser.size

        override fun onBindViewHolder(holder: UserHolder, position: Int) {
            holder.bind(listUser[position])
        }
    }

    class UserHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {

        fun bind(user: User) {
            itemView.userName.text = user.name
            itemView.userAddress.text = user.address
            itemView.userAge.text = user.age.toString()
        }
    }

}
