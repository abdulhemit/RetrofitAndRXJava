package com.example.retrofitandrxjava.Model

data class cryptoModel (
    //@SerializedName("currency")
    // javada gereklidir lakin kotlinde olmasada olur
    val currency: String,

    //@SerializedName("price")
    // javada gereklidir lakin kotlinde olmasada olur
    val price: String
)