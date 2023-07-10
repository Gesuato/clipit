package com.example.clipit

import dev.icerock.moko.mvvm.viewmodel.ViewModel

class ViewModelTest(useCaseTest: UseCaseTest): ViewModel() {
    val test: String = useCaseTest.test
}