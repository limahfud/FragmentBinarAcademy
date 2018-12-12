package me.mahfud.pertemuan8


import android.os.Bundle
import android.support.v4.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import kotlinx.android.synthetic.main.fragment_blank.view.*


// TODO: Rename parameter arguments, choose names that match
// the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
private const val ARG_NAMA = "nama"
private const val ARG_KELAS = "kelas"

/**
 * A simple [Fragment] subclass.
 * Use the [BlankFragment.newInstance] factory method to
 * create an instance of this fragment.
 *
 */
class BlankFragment : Fragment() {
    // TODO: Rename and change types of parameters
    private var nama: String? = null
    private var kelas: String? = null


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        arguments?.let {
            nama = it.getString(ARG_NAMA)
            kelas = it.getString(ARG_KELAS)
        }
    }

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?,
                              savedInstanceState: Bundle?): View? {
        val view = inflater.inflate(R.layout.fragment_blank, container, false)
        view.tvNama.text = nama
        view.tvKelas.text = kelas
        view.imageViewGambar.background =

        return view
    }


    companion object {
        /**
         * Use this factory method to create a new instance of
         * this fragment using the provided parameters.
         *
         * @param nama Parameter 1.
         * @param kelas Parameter 2.
         * @return A new instance of fragment BlankFragment.
         */
        // TODO: Rename and change types and number of parameters
        @JvmStatic
        fun newInstance(nama: String, kelas: String) =
                BlankFragment().apply {
                    arguments = Bundle().apply {
                        putString(ARG_NAMA, nama)
                        putString(ARG_KELAS, kelas)
                    }
                }
    }
}
