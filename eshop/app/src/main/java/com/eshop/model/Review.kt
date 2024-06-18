package com.example.shop.model

import java.util.Date

class Review (
    val id: String,
    val productId: String,
    val userId: String,
    val rating: Int,
    val comment: String,
    val reviewDate: Date
)