package com.test.websearchapp.model

data class Image(
    val base64Encoding: String,
    val height: Int,
    val imageWebSearchUrl: Any,
    val name: Any,
    val provider: ProviderX,
    val thumbnail: String,
    val thumbnailHeight: Int,
    val thumbnailWidth: Int,
    val title: Any,
    val url: String,
    val webpageUrl: String,
    val width: Int
)