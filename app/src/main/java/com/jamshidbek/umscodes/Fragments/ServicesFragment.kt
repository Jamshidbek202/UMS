package com.jamshidbek.umscodes.Fragments

import android.content.Intent
import android.net.Uri
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.jamshidbek.umscodes.Adapters.ItemClick
import com.jamshidbek.umscodes.Adapters.ServicesAdapter
import com.jamshidbek.umscodes.Models.ServicesModel
import com.jamshidbek.umscodes.R
import kotlinx.android.synthetic.main.fragment_services.*
import kotlinx.android.synthetic.main.fragment_services.view.*

class ServicesFragment : Fragment() {

    lateinit var root : View
    lateinit var list : ArrayList<ServicesModel>
    lateinit var adapter: ServicesAdapter

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        root = inflater.inflate(R.layout.fragment_services, container, false)

        list = ArrayList()

        list.add(ServicesModel("Check the balance and limits of tariffs plan", "*100#"))
        list.add(ServicesModel("Check the remainder of all internet packs", "*102#"))
        list.add(ServicesModel("Check internet packs with bonuses", "*102*0#"))
        list.add(ServicesModel("Check the remainder of minutes", "*103#"))
        list.add(ServicesModel("Check minute packs with bonuses", "*103*0#"))
        list.add(ServicesModel("Check SMS packs packs", "*104#"))
        list.add(ServicesModel("Check SMS packs with bonuses", "*104*0#"))
        list.add(ServicesModel("Portal for turning services on and off", "*111#"))

        adapter = ServicesAdapter(root.context, list, object : ItemClick{
            override fun onClick(list: ArrayList<ServicesModel>, position: Int) {
                val intent = Intent(Intent.ACTION_DIAL)
                intent.data = Uri.parse("tel:${list[position].code}")
                startActivity(intent)
            }
        })
        root.services_recyclerView.adapter = adapter

        return root
    }
}