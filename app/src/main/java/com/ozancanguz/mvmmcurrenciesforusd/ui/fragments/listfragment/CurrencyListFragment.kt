package com.ozancanguz.mvmmcurrenciesforusd.ui.fragments.listfragment

import android.annotation.SuppressLint
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.findNavController
import com.ozancanguz.mvmmcurrenciesforusd.R
import com.ozancanguz.mvmmcurrenciesforusd.databinding.FragmentCurrencyListBinding
import kotlinx.android.synthetic.main.fragment_currency_list.*
import kotlinx.android.synthetic.main.fragment_currency_list.view.*


class CurrencyListFragment : Fragment() {

    private var _binding: FragmentCurrencyListBinding? = null
    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        _binding = FragmentCurrencyListBinding.inflate(inflater, container, false)
        val view = binding.root






        return view

    }


}