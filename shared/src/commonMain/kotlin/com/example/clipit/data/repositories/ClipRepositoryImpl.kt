package com.example.clipit.data.repositories

import com.example.clipit.domain.models.ClipModel
import com.example.clipit.domain.repositories.ClipRepository

class ClipRepositoryImpl : ClipRepository {
    override suspend fun getClipModelList(): List<ClipModel> {
        return listOf(ClipModel("TODO"))
    }
}
