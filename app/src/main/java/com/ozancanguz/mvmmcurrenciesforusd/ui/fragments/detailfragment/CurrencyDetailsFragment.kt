package com.ozancanguz.mvmmcurrenciesforusd.ui.fragments.detailfragment

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.ozancanguz.mvmmcurrenciesforusd.R
import com.ozancanguz.mvmmcurrenciesforusd.databinding.FragmentCurrencyDetailsBinding
import com.ozancanguz.mvmmcurrenciesforusd.databinding.FragmentCurrencyListBinding

class CurrencyDetailsFragment : Fragment() {


    private var _binding: FragmentCurrencyDetailsBinding? = null
    private val binding get() = _binding!!


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        _binding = FragmentCurrencyDetailsBinding.inflate(inflater, container, false)
        val view = binding.root



        return view

    }


}