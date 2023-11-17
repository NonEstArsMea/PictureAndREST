package raa.example.pictureandrest.domain.useCases

import android.media.Image

class GetImageUseCase(private val repository: ImageCardRepository) {

    fun execute(url: String): Image{
        return repository.getImage(url)
    }

}