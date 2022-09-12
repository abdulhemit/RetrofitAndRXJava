package com.example.retrofitandrxjava.Service

import com.example.retrofitandrxjava.Model.cryptoModel
import io.reactivex.Observable
import retrofit2.http.GET


interface CryptoAPI {


    // GET, POST, UPDATE, DELETE
    //https://raw.githubusercontent.com/
    // atilsamancioglu/K21-JSONDataSet/master/crypto.json

    @GET("atilsamancioglu/K21-JSONDataSet/master/crypto.json")
    fun getData(): Observable<List<cryptoModel>>

    //fun getData():Call<List<cryptoModel>>

}