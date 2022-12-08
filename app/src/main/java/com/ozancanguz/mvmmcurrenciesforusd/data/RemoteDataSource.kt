package com.ozancanguz.mvmmcurrenciesforusd.data

import com.ozancanguz.mvmmcurrenciesforusd.data.network.RatesApi
import com.ozancanguz.mvmmcurrenciesforusd.model.Rates
import retrofit2.Response
import javax.inject.Inject

class RemoteDataSource @Inject constructor(private val ratesApi: RatesApi) {

    suspend fun getAllRates(): Response<List<Rates>> {
       return ratesApi.getAllRates()
    }
}