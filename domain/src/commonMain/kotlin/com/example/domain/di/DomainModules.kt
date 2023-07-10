package com.example.domain.di

import com.example.data.di.repositoryModule

fun domainModules() = listOf(repositoryModule, useCaseModule)