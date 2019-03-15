package com.example.android_sample_mvvm_model.ulti

import com.example.android_sample_mvvm_model.data.FakeDatabase
import com.example.android_sample_mvvm_model.data.QuotesRepository
import com.example.android_sample_mvvm_model.ui.quotes.QuotesViewModelFactory

object InjectorUtils {

    fun provideQuotesViewModelFactory():QuotesViewModelFactory {

        val quotesRepository = QuotesRepository.getInstance(FakeDatabase.getInstance().quoteDao)
        return QuotesViewModelFactory(quotesRepository)
    }
}