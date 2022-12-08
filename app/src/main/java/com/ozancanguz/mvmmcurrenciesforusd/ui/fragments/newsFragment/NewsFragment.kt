package com.ozancanguz.mvmmcurrenciesforusd.ui.fragments.newsFragment

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.ozancanguz.mvmmcurrenciesforusd.R
import com.ozancanguz.mvmmcurrenciesforusd.databinding.FragmentCurrencyDetailsBinding
import com.ozancanguz.mvmmcurrenciesforusd.databinding.FragmentNewsBinding


class NewsFragment : Fragment() {

    private var _binding: FragmentNewsBinding? = null
    private val binding get() = _binding!!


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        _binding = FragmentNewsBinding.inflate(inflater, container, false)
        val view = binding.root


        return view
    }


}