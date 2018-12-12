package me.mahfud.pertemuan8

import android.content.Context
import android.net.Uri
import android.os.Bundle
import android.support.v4.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import kotlinx.android.synthetic.main.activity_main.*
import kotlinx.android.synthetic.main.fragment_blank_fragment_second.*
import kotlinx.android.synthetic.main.fragment_blank_fragment_second.view.*


private const val ARG_PARAM1 = "param1"
private const val ARG_PARAM2 = "param2"


class BlankFragmentSecond : Fragment() {
    private var listener: OnBlankFragmentListener? = null

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?,
                              savedInstanceState: Bundle?): View? {

        val view = inflater.inflate(R.layout.fragment_blank_fragment_second, container, false)
        view.textViewBaru.setOnClickListener {
            listener?.onButtonAcceptPressed("uri")
        }
        return view
    }

    override fun onAttach(context: Context) {
        super.onAttach(context)

        if (context is OnBlankFragmentListener) {
            listener = context
        } else {
            throw RuntimeException(context.toString() + " must implement OnBlankFragmentListener")
        }
    }

    override fun onDetach() {
        super.onDetach()
        listener = null
    }


    interface OnBlankFragmentListener {

        fun onButtonAcceptPressed(uri: String)

    }

}
