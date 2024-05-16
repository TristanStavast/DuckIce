package com.example.duckice

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.ImageButton
import android.widget.TextView
import android.widget.Toast
import androidx.lifecycle.findViewTreeViewModelStoreOwner


class EatFragment : Fragment() {




    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val inc = "20%"

        val layout = inflater.inflate(R.layout.fragment_info, container, false)
        val eatlayout = inflater.inflate(R.layout.fragment_eat, container, false)
        val ibtnEat : ImageButton = eatlayout.findViewById(R.id.imgbtnEat)
        val txtEatView : TextView = layout.findViewById(R.id.lblInfo)

        ibtnEat.setOnClickListener()
        {
            txtEatView.text = inc
        }
        // Inflate the layout for this fragment
        return eatlayout
    }


}