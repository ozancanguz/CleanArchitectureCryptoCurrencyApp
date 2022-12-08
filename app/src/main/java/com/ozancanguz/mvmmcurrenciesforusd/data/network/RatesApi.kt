package com.ozancanguz.mvmmcurrenciesforusd.data.network

import com.ozancanguz.mvmmcurrenciesforusd.model.Rates
import retrofit2.Response
import retrofit2.http.GET

interface RatesApi {


    @GET("v6/latest/USD")
    suspend fun getAllRates(): Response<List<Rates>>



}