package raa.example.pictureandrest.domain.dataClass

import android.media.Image

data class ImageCard(
    val heading: String,
    val text: String,
    val image: Image,
    val url: String,
    var id: Int = NEW_ID
){
    companion object{
        const val NEW_ID = -1
    }
}
