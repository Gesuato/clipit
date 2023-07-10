package com.example.clipit.di

import com.example.clipit.UseCaseTest
import org.koin.core.module.dsl.singleOf
import org.koin.dsl.module

val useCaseModule = module {
    singleOf(::UseCaseTest)
}