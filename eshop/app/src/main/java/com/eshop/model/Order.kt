package com.example.shop.model

import java.util.Date

class Order (
    val id: String,
    val userId: String,
    val productList: List<Product>,
    val totalPrice: Double,
    val orderDate: Date,
    val status: String // e.g., "Pending", "Shipped", "Delivered"
)