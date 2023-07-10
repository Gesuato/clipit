package com.example.clipit

class UseCaseTest(repositoryTest: RepositoryTest, repository2Test: Repository2Test) {
    val test: String = repositoryTest.test + repository2Test.test2
}