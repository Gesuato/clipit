package com.example.clipit.di

import com.example.clipit.ViewModelTest
import org.koin.core.module.dsl.singleOf
import org.koin.dsl.module

val commonModule = module {
    singleOf(::ViewModelTest)
}