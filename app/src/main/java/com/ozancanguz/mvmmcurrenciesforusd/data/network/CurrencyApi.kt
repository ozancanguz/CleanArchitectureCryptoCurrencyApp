package com.ozancanguz.mvmmcurrenciesforusd.data.network

import com.ozancanguz.mvmmcurrenciesforusd.model.Currency
import retrofit2.Response
import retrofit2.http.GET

interface CurrencyApi {

    @GET("sapi/v1/tickers/24hr")
    suspend fun getAllMovies(): Response<List<Currency>>


}