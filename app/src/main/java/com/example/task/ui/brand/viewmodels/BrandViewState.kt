package com.example.task.ui.brand.viewmodels

import com.example.task.ui.models.Brand

sealed class BrandViewState {
    object LOADING : BrandViewState()
    class SUCCESS(val payload: Brand) : BrandViewState()
    class FAILURE(val errorMsg: String) : BrandViewState()
}
