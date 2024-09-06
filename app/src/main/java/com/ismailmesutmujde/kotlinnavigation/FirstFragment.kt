package com.ismailmesutmujde.kotlinnavigation

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.Navigation
import com.ismailmesutmujde.kotlinnavigation.databinding.FragmentFirstBinding


class FirstFragment : Fragment() {

    private lateinit var bindingFirstFragment : FragmentFirstBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        bindingFirstFragment = FragmentFirstBinding.inflate(inflater, container, false)
        val view = bindingFirstFragment.root
        return view
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        bindingFirstFragment.button1.setOnClickListener {
            val action = FirstFragmentDirections.actionFirstFragmentToSecondFragment()
            Navigation.findNavController(it).navigate(action)
        }
    }

}