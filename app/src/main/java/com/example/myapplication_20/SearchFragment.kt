package com.example.myapplication_20

import android.content.Intent
import android.net.Uri
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button


class SearchFragment : Fragment() {

    lateinit var google_search_Button: Button
    lateinit var ya_search_Button: Button

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        val view = inflater.inflate(R.layout.fragment_search, container, false)

        google_search_Button = view.findViewById(R.id.google_search_button)
        ya_search_Button = view.findViewById(R.id.ya_search_button)

        google_search_Button.setOnClickListener {
            val googleLink = Uri.parse("https://google.com")
            val openBrouserIntent = Intent(Intent.ACTION_VIEW, googleLink)
            startActivity(openBrouserIntent)
        }

        ya_search_Button.setOnClickListener {
            val googleLink = Uri.parse("https://yandex.ru")
            val openBrouserIntent = Intent(Intent.ACTION_VIEW, googleLink)
            startActivity(openBrouserIntent)
        }

        return view
    }


}