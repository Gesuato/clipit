package com.example.clipit

import com.example.clipit.di.appModule
import org.koin.core.component.KoinComponent
import org.koin.core.component.inject
import org.koin.core.context.startKoin

class InjectionFactory: KoinComponent  {
    val viewModel: ViewModelTest by inject()
}

fun initKoin() {
    startKoin {
        modules(appModule())
    }
}