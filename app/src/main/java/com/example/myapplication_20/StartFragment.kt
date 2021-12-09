package com.example.myapplication_20

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.Toast


class StartFragment : Fragment() {

    lateinit var toastButton: Button

      override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        val view = inflater.inflate(R.layout.fragment_start, container, false)

          toastButton=view.findViewById(R.id.toast_button)
          toastButton.setOnClickListener {
              Toast.makeText(context,"it's just a fish",Toast.LENGTH_LONG) .show()
          }
          return view
    }


}