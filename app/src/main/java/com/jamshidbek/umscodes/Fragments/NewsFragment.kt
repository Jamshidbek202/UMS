package com.jamshidbek.umscodes.Fragments

import android.content.Intent
import android.net.Uri
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.jamshidbek.umscodes.R
import kotlinx.android.synthetic.main.fragment_news.view.*

class NewsFragment : Fragment() {

    lateinit var root:View

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        root = inflater.inflate(R.layout.fragment_news, container, false)

        root.btn_news1_more.setOnClickListener{
            var browserIntent = Intent(Intent.ACTION_VIEW, Uri.parse("https://corp.mobi.uz/ru/news/2021/23130/"))
            startActivity(browserIntent)
        }

        root.btn_news2_more.setOnClickListener{
            var browserIntent = Intent(Intent.ACTION_VIEW, Uri.parse("https://corp.mobi.uz/ru/news/2021/22881/"))
            startActivity(browserIntent)
        }

        return root
    }
}