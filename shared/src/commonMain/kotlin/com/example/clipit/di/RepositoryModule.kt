package com.example.clipit.di

import com.example.clipit.RepositoryTest
import com.example.clipit.Repository2Test
import org.koin.core.module.dsl.singleOf
import org.koin.dsl.module

val repositoryModule = module {
    singleOf(::RepositoryTest)
    singleOf(::Repository2Test)
}