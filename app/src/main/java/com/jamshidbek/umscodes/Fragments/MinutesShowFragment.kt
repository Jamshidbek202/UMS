package com.jamshidbek.umscodes.Fragments

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.jamshidbek.umscodes.R
import kotlinx.android.synthetic.main.fragment_minutes_show.view.*
import kotlinx.android.synthetic.main.minutes_item.view.*

class MinutesShowFragment : Fragment() {

    lateinit var root:View

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        root = inflater.inflate(R.layout.fragment_minutes_show, container, false)

        var minutes = arguments?.getString("minutesMinutes")
        var code = arguments?.getString("minutesCode")
        var desc = arguments?.getString("minutesDesc")

        root.minutes_minutes_show.text = minutes.toString()
        root.minutes_code_show.text = code.toString()
        root.minutes_desc_show.text = desc.toString()

        return root
    }
}