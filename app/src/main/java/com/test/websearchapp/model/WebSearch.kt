package com.test.websearchapp.model

data class WebSearch(
    val _type: String,
    val didUMean: String,
    val relatedSearch: List<String>,
    val totalCount: Int,
    val value: List<Value>
)