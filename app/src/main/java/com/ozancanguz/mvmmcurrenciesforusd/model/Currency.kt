package com.ozancanguz.mvmmcurrenciesforusd.model


import com.google.gson.annotations.SerializedName

data class Currency(
    @SerializedName("askPrice")
    val askPrice: String,
    @SerializedName("at")
    val at: Long,
    @SerializedName("baseAsset")
    val baseAsset: String,
    @SerializedName("bidPrice")
    val bidPrice: String,
    @SerializedName("highPrice")
    val highPrice: String,
    @SerializedName("lastPrice")
    val lastPrice: String,
    @SerializedName("lowPrice")
    val lowPrice: String,
    @SerializedName("openPrice")
    val openPrice: String,
    @SerializedName("quoteAsset")
    val quoteAsset: String,
    @SerializedName("symbol")
    val symbol: String,
    @SerializedName("volume")
    val volume: String
)