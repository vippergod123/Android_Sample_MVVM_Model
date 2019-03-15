package com.example.android_sample_mvvm_model.data

class FakeDatabase private constructor() {

    var quoteDao = FakeQuoteDao()
    companion object {
        @Volatile private var instance: FakeDatabase?  = null

        fun getInstance () =
                instance ?: synchronized(this) {
                    instance ?: FakeDatabase().also { instance = it}
                }
    }
}

