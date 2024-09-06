package com.ismailmesutmujde.kotlinnavigation

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.Navigation
import com.ismailmesutmujde.kotlinnavigation.databinding.FragmentSecondBinding


class SecondFragment : Fragment() {

    private lateinit var bindingSecondFragment : FragmentSecondBinding


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        bindingSecondFragment = FragmentSecondBinding.inflate(inflater, container, false)
        val view = bindingSecondFragment.root
        return view
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        bindingSecondFragment.button2.setOnClickListener {
            val action = SecondFragmentDirections.actionSecondFragmentToFirstFragment()
            Navigation.findNavController(it).navigate(action)
        }
    }
}