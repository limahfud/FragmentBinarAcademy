package me.mahfud.pertemuan8

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.support.v4.app.Fragment
import android.support.v4.app.FragmentManager
import android.support.v4.app.FragmentStatePagerAdapter
import kotlinx.android.synthetic.main.activity_view_pager.*
import org.jetbrains.anko.toast
import android.support.design.widget.TabLayout



class ViewPagerActivity : AppCompatActivity(), BlankFragmentSecond.OnBlankFragmentListener{

    override fun onButtonAcceptPressed(uri: String) {
        toast("Ini udah di klik di fragment dan tampil di activity")
    }

    private lateinit var mDemoCollectionPagerAdapter: DemoCollectionPagerAdapter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_view_pager)

        val users = listOf(
                User("Susilo", "Kelas A"),
                User("Susanti", "Kelas A"),
                User("Sujatmiko", "Kelas B"))


        mDemoCollectionPagerAdapter = DemoCollectionPagerAdapter(supportFragmentManager, users)
        viewPagerExample.adapter = mDemoCollectionPagerAdapter

        tabLayout.setupWithViewPager(viewPagerExample)
    }

    class DemoCollectionPagerAdapter(fm: FragmentManager, val listUser: List<User>)
        : FragmentStatePagerAdapter(fm) {

        override fun getCount(): Int  = listUser.size + 1

        override fun getItem(i: Int): Fragment {
            if (i < listUser.size) {
                val user = listUser[i]
                return BlankFragment.newInstance(user.name, user.clazz)
            } else {
                return BlankFragmentSecond()
            }

        }

        override fun getPageTitle(position: Int): CharSequence = when (position) {
            1 -> "Satu"
            2 -> "Dua"
            3 -> "Tiga"
            else -> "Empat"
        }
    }

    data class User(val name: String, val clazz: String)
}
