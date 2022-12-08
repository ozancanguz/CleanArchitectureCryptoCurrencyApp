package com.ozancanguz.mvmmcurrenciesforusd.ui.fragments.listfragment

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.viewModels
import androidx.lifecycle.Observer
import androidx.recyclerview.widget.LinearLayoutManager
import com.ozancanguz.mvmmcurrenciesforusd.adapter.CurrencyAdapter
import com.ozancanguz.mvmmcurrenciesforusd.databinding.FragmentCurrencyListBinding
import com.ozancanguz.mvmmcurrenciesforusd.viewmodels.RatesViewModel
import dagger.hilt.android.AndroidEntryPoint
import kotlinx.coroutines.ExperimentalCoroutinesApi

@ExperimentalCoroutinesApi
@AndroidEntryPoint
class CurrencyListFragment : Fragment() {

    private var _binding: FragmentCurrencyListBinding? = null
    private val binding get() = _binding!!

    private val ratesViewModel:RatesViewModel by viewModels()
    private var currencyAdapter=CurrencyAdapter()


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        _binding = FragmentCurrencyListBinding.inflate(inflater, container, false)
        val view = binding.root

        // init rv
        binding.recyclerView.layoutManager=LinearLayoutManager(requireContext())
        binding.recyclerView.adapter=currencyAdapter

        observeLiveData()




        return view

    }

    private fun observeLiveData() {
        ratesViewModel.requestAllData()
        ratesViewModel.currencyList.observe(viewLifecycleOwner, Observer {
            currencyAdapter.updateData(it)
        })
    }


}