package com.example.android_sample_mvvm_model.data

class QuotesRepository private constructor( private val quoteDao: FakeQuoteDao) {

    fun addQuote(quote: Quote) {
        quoteDao.addQuote(quote)
    }

    fun getQuotes() = quoteDao.getQuotes()


    companion object {
        @Volatile private var instance: QuotesRepository?  = null

        fun getInstance (quoteDao: FakeQuoteDao) =
            instance ?: synchronized(this) {
                instance ?: QuotesRepository(quoteDao).also { instance = it}
            }
    }
}