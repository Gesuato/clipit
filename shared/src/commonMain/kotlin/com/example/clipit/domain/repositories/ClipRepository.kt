package com.example.clipit.domain.repositories

import com.example.clipit.domain.models.ClipModel

interface ClipRepository {
    suspend fun getClipModelList(): List<ClipModel>
}