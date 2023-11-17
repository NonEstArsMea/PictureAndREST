package raa.example.pictureandrest.domain.dataClass

import android.media.Image

data class ImageCard(
    val heading: String,
    val text: String,
    val id: Int,
    val image: Image,
    val url: String,
)
