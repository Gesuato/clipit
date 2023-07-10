package com.example.domain.di

import com.example.domain.usecases.UseCaseTest
import org.koin.core.module.dsl.singleOf
import org.koin.dsl.module

val useCaseModule = module {
    singleOf(::UseCaseTest)
}