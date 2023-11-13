package me.darthwithap.kmm.calculator.domain

interface ApiClient {
    // Todo: Add api client methods here (incase needed) or safe-delete
    suspend fun performApiCall(): Unit
}