package raa.example.pictureandrest.domain.useCases

import android.media.Image
import raa.example.pictureandrest.domain.dataClass.ImageCard

interface ImageCardRepository {

    fun addImageCard(imageCard: ImageCard)
    fun deleteImageCard(id: Int)
    fun editImageCard(newImageCard: ImageCard)
    fun getImageCard(id: Int): ImageCard
    fun getImageList(): List<ImageCard>
    fun getImage(url: String) :Image



}