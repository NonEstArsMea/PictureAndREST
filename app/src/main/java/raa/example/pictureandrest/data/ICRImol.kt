package raa.example.pictureandrest.data

import android.media.Image
import android.provider.ContactsContract.CommonDataKinds.Im
import raa.example.pictureandrest.domain.dataClass.ImageCard
import raa.example.pictureandrest.domain.useCases.ImageCardRepository
import java.lang.RuntimeException

object ICRImol: ImageCardRepository {

    private val imageCardList = mutableListOf<ImageCard>()

    private var imageCardID = 0
    override fun addImageCard(imageCard: ImageCard) {
        if(imageCard.id == ImageCard.NEW_ID) {
            imageCard.id = imageCardID++
        }
       imageCardList.add(imageCard)
    }

    override fun deleteImageCard(_id: Int) {
        imageCardList.removeIf { it.id == _id }
    }

    override fun editImageCard(newImageCard: ImageCard) {
        imageCardList.removeIf{it.id == newImageCard.id}
        addImageCard(newImageCard)
    }

    override fun getImageCard(id: Int): ImageCard {
        return imageCardList.find { it.id == id } ?: throw RuntimeException("ID not find ${id}")
    }

    override fun getImageList(): List<ImageCard> {
        return imageCardList.toList()
    }

    override fun getImage(url: String): Image {
        return TODO()
    }
}