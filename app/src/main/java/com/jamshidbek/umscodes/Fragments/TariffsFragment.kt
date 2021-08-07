package com.jamshidbek.umscodes.Fragments

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.jamshidbek.umscodes.Adapters.TariffsAdapter
import com.jamshidbek.umscodes.Models.TariffsModel
import com.jamshidbek.umscodes.R
import kotlinx.android.synthetic.main.fragment_tariffs.view.*

class TariffsFragment : Fragment() {

    lateinit var root:View
    lateinit var list:ArrayList<TariffsModel>
    lateinit var adapter: TariffsAdapter

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        root = inflater.inflate(R.layout.fragment_tariffs, container, false)

        list = ArrayList()

        list.add(TariffsModel("Mobi 20", "#182*92", "20 gb internet"))
        list.add(TariffsModel("Mobi 30", "#182*93", "30 gb internet"))
        list.add(TariffsModel("Mobi 40", "#182*94", "40 gb internet"))
        list.add(TariffsModel("Mobi 50", "#182*95", "50 gb internet"))

        adapter = TariffsAdapter(root.context, list)
        root.tariffsRecyclerView.adapter = adapter

        return root
    }

}