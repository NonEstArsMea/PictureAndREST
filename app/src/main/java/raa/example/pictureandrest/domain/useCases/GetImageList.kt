package raa.example.pictureandrest.domain.useCases

import raa.example.pictureandrest.domain.dataClass.ImageCard

class GetImageList(private val repository: ImageCardRepository) {

    fun execute(): List<ImageCard>{
        return repository.getImageList()
    }

}