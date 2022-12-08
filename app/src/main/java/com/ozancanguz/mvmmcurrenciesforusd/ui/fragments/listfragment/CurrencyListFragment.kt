package com.ozancanguz.mvmmcurrenciesforusd.ui.fragments.listfragment

import android.annotation.SuppressLint
import android.os.Bundle
import android.util.Log
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.viewModels
import androidx.lifecycle.Observer
import androidx.navigation.fragment.findNavController
import com.ozancanguz.mvmmcurrenciesforusd.R
import com.ozancanguz.mvmmcurrenciesforusd.databinding.FragmentCurrencyListBinding
import com.ozancanguz.mvmmcurrenciesforusd.viewmodels.RatesViewModel
import dagger.hilt.android.AndroidEntryPoint
import kotlinx.android.synthetic.main.fragment_currency_list.*
import kotlinx.android.synthetic.main.fragment_currency_list.view.*
import kotlinx.coroutines.ExperimentalCoroutinesApi

@ExperimentalCoroutinesApi
@AndroidEntryPoint
class CurrencyListFragment : Fragment() {

    private var _binding: FragmentCurrencyListBinding? = null
    private val binding get() = _binding!!

    private val ratesViewModel:RatesViewModel by viewModels()

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        _binding = FragmentCurrencyListBinding.inflate(inflater, container, false)
        val view = binding.root


        observeLiveData()




        return view

    }

    private fun observeLiveData() {
        ratesViewModel.requestAllData()
        ratesViewModel.currencyList.observe(viewLifecycleOwner, Observer {

        })
    }


}