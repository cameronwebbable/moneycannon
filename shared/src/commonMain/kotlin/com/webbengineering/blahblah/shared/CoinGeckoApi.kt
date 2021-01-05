package com.webbengineering.blahblah.shared

import com.webbengineering.blahblah.shared.Models.Coin
import com.webbengineering.blahblah.shared.Models.CoinMarketData

import io.ktor.client.*
import io.ktor.client.features.json.*
import io.ktor.client.features.json.serializer.*
import io.ktor.client.request.*
import io.ktor.http.*

class CoinGeckoApi {
    suspend fun coinList(): List<Coin> {
        val httpClient = HttpClient {
            install(JsonFeature) {
                serializer = KotlinxSerializer()
                accept(ContentType.Application.Json)
            }
        }
        val resp = httpClient.get<List<Coin>>("https://api.coingecko.com/api/v3/coins/list")

        httpClient.close()

        return resp
    }

    suspend fun coinsMarket(): List<CoinMarketData> {
        val httpClient = HttpClient {
            install(JsonFeature) {
                serializer = KotlinxSerializer()
                accept(ContentType.Application.Json)
            }
        }
        val resp = httpClient.get<List<CoinMarketData>>("https://api.coingecko.com/api/v3/coins/markets?vs_currency=usd&order=market_cap_desc&per_page=100&page=1&sparkline=false")
        println(resp)
        httpClient.close()

        return resp
    }


}