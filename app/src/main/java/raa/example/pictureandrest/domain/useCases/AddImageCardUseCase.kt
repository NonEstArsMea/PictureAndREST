package raa.example.pictureandrest.domain.useCases

import raa.example.pictureandrest.domain.dataClass.ImageCard

class AddImageCardUseCase(private val repository: ImageCardRepository) {

    fun execute(imageCard: ImageCard){
        repository.addImageCard(imageCard)
    }

}