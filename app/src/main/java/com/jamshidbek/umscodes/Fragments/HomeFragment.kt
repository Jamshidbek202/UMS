package com.jamshidbek.umscodes.Fragments

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.core.os.bundleOf
import androidx.navigation.NavOptions
import androidx.navigation.findNavController
import com.jamshidbek.umscodes.R
import kotlinx.android.synthetic.main.fragment_home.view.*

class HomeFragment : Fragment() {

    lateinit var root:View

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?

    ): View? {

        root = inflater.inflate(R.layout.fragment_home, container, false)

        val bundle = bundleOf("something" to "something")

        val navOption = NavOptions.Builder()

        navOption.setEnterAnim(R.anim.anim_enter)

        root.tariffs.setOnClickListener{
            root.findNavController().navigate(R.id.tariffsFragment2, bundle, navOption.build())
        }

        root.minutes.setOnClickListener{
            root.findNavController().navigate(R.id.minutesFragment2, bundle, navOption.build())
        }

        root.news.setOnClickListener{
            root.findNavController().navigate(R.id.newsFragment, bundle, navOption.build())
        }

        return root
    }
}