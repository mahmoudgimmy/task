package com.example.task.ui.models

import android.os.Parcelable
import androidx.paging.PagingData
import com.google.gson.annotations.SerializedName
import kotlinx.parcelize.Parcelize

data class BrandResponse(
    @SerializedName("data") val products:
            List<Product>,
            @SerializedName("brand") val brand: Brand

)

data class ProductDetailsResponse(
    @SerializedName("data") val product: Product,
)

@Parcelize
data class Brand(
    val id: String,
    val name: String,
    val banner: String,
    val logo: String,
    val description: String,
) : Parcelable

@Parcelize
data class Cursor(
    val current: Int,
    val previous: String,
    val next: String,
    val count: Int,
) : Parcelable
