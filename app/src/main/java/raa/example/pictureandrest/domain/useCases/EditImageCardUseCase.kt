package raa.example.pictureandrest.domain.useCases

import raa.example.pictureandrest.domain.dataClass.ImageCard

class EditImageCardUseCase(private val repository: ImageCardRepository){

    fun execute(newImageCard: ImageCard){
        repository.editImageCard(newImageCard)
    }

}