package com.jamshidbek.umscodes.Fragments

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.jamshidbek.umscodes.Adapters.MinutesAdapter
import com.jamshidbek.umscodes.Models.MinutesModel
import com.jamshidbek.umscodes.R
import kotlinx.android.synthetic.main.fragment_minutes.*
import kotlinx.android.synthetic.main.fragment_minutes.view.*

class MinutesFragment : Fragment() {

    lateinit var root:View
    lateinit var list:ArrayList<MinutesModel>
    lateinit var adapter: MinutesAdapter

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        root = inflater.inflate(R.layout.fragment_minutes, container, false)

        list = ArrayList()

        list.add(MinutesModel("20 minutes", "#123*112", "20000 sum"))
        list.add(MinutesModel("30 minutes", "#123*113", "30000 sum"))
        list.add(MinutesModel("40 minutes", "#123*114", "40000 sum"))
        list.add(MinutesModel("50 minutes", "#123*115", "50000 sum"))

        adapter = MinutesAdapter(root.context, list)

        root.minutesRecyclerView.adapter = adapter

        return root
    }
}