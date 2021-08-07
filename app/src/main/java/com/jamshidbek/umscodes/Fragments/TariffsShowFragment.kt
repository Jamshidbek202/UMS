package com.jamshidbek.umscodes.Fragments

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.jamshidbek.umscodes.R
import kotlinx.android.synthetic.main.fragment_tariffs_show.view.*

class TariffsShowFragment : Fragment() {

    lateinit var root:View

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        root = inflater.inflate(R.layout.fragment_tariffs_show, container, false)

        var name = arguments?.getString("tariffName")
        var code = arguments?.getString("tariffCode")
        var desc = arguments?.getString("tariffDesc")

        root.tariffs_name_show.text = name.toString()
        root.tariffs_code_show.text = code.toString()
        root.tariffs_desc_show.text = desc.toString()

        return root
    }
}