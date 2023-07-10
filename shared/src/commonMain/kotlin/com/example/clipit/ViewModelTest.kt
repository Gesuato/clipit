package com.example.clipit

import com.example.domain.usecases.UseCaseTest
import dev.icerock.moko.mvvm.viewmodel.ViewModel

class ViewModelTest(useCaseTest: UseCaseTest): ViewModel() {
    val test: String = useCaseTest.test()
}