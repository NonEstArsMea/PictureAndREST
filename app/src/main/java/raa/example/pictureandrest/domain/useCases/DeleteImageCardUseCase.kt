package raa.example.pictureandrest.domain.useCases

class DeleteImageCardUseCase(private val repository: ImageCardRepository) {

    fun execute(id: Int){
        repository.deleteImageCard(id)
    }

}