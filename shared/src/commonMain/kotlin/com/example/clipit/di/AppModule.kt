package com.example.clipit.di

import com.example.domain.di.domainModules

fun appModule() = domainModules() + commonModule