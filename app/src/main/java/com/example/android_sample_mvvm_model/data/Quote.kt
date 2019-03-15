package com.example.android_sample_mvvm_model.data

data class Quote ( val quoteText: String, val author:String){
    override fun toString(): String {
        return "$quoteText - $author"
    }
}