package com.example.android_sample_mvvm_model.ui.quotes

import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import com.example.android_sample_mvvm_model.data.QuotesRepository

@Suppress("UNCHECKED_CAST")

class QuotesViewModelFactory(private val quotesRepository: QuotesRepository): ViewModelProvider.NewInstanceFactory() {

    override fun <T : ViewModel?> create(modelClass: Class<T>): T {
        return QuotesViewModel(quotesRepository) as T
    }
}