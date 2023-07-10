package com.example.clipit.domain.usecases

import com.example.clipit.domain.models.ClipModel
import com.example.clipit.domain.repositories.ClipRepository

class GetClipModelUseCase(private val repository: ClipRepository) {
    suspend fun getClipModelList(): List<ClipModel> = repository.getClipModelList()
}
