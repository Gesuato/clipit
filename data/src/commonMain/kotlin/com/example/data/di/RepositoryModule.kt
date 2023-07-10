package com.example.data.di

import com.example.data.repositories.RepositoryTest
import com.example.data.repositories.Repository2Test
import org.koin.core.module.dsl.singleOf
import org.koin.dsl.module

val repositoryModule = module {
    singleOf(::RepositoryTest)
    singleOf(::Repository2Test)
}