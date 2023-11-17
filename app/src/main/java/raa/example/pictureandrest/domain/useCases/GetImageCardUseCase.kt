package raa.example.pictureandrest.domain.useCases

import raa.example.pictureandrest.domain.dataClass.ImageCard

class GetImageCardUseCase(private val repository: ImageCardRepository) {

    fun execute(id: Int): ImageCard {
        return repository.getImageCard(id)
    }

}