package com.ozancanguz.mvmmcurrenciesforusd.data

import com.ozancanguz.mvmmcurrenciesforusd.data.network.CurrencyApi

import com.ozancanguz.mvmmcurrenciesforusd.model.Currency

import retrofit2.Response
import javax.inject.Inject

class RemoteDataSource @Inject constructor(private val currencyApi: CurrencyApi) {

    suspend fun getAllRates(): Response<List<Currency>> {
       return currencyApi.getAllMovies()
    }
}