package com.example.shop.model

import java.util.Date

data class Product (
    var id :Int,
    var title: String? = "",
    var description: String? = "",
    var category: String? = "",
    var price: String? = "",

    var images: HashMap<String, Any>?=null,
    var colors: HashMap<String, Any>?=null,
    var sizes: HashMap<String, Any>?=null,
    var orders:Int = 0,
    var offerTime: Date? = null,
    var sizeUnit:String?=null,
    val reviews: List<Review> = emptyList() // Added reviews property
)

