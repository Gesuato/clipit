package com.example.domain.usecases

import com.example.data.repositories.Repository2Test
import com.example.data.repositories.RepositoryTest

class UseCaseTest(
    private val repositoryTest: RepositoryTest,
    private val repository2Test: Repository2Test
) {
    fun test() = repositoryTest.number.toString() + repository2Test.name
}