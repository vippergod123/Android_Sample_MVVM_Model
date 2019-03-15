package com.example.android_sample_mvvm_model.ui.quotes

import androidx.lifecycle.ViewModel
import com.example.android_sample_mvvm_model.data.Quote
import com.example.android_sample_mvvm_model.data.QuotesRepository

class QuotesViewModel(private val quotesRepository: QuotesRepository):ViewModel() {

    fun getQuotes() = quotesRepository.getQuotes()

    fun addQuote(quote: Quote) = quotesRepository.addQuote(quote)
}