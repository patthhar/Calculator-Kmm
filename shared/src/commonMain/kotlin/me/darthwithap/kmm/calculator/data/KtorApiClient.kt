package me.darthwithap.kmm.calculator.data

import io.ktor.client.HttpClient
import io.ktor.client.request.post
import io.ktor.client.request.url
import io.ktor.client.statement.HttpResponse
import io.ktor.http.ContentType
import io.ktor.http.contentType
import io.ktor.utils.io.errors.IOException
import me.darthwithap.kmm.calculator.domain.ApiClient
import me.darthwithap.kmm.calculator.domain.utils.AppError
import me.darthwithap.kmm.calculator.domain.utils.AppException

class KtorApiClient(
    private val httpClient: HttpClient
) : ApiClient {
    override suspend fun performApiCall() {
        val response: HttpResponse = try {
            httpClient.post {
                url("")
                contentType(ContentType.Application.Json)
                //setBody()
            }
        } catch (e: IOException) {
            throw AppException(AppError.ApiError)
        }

        return try {
            //response.body<SomeModel>().domainModel
        } catch (e: Exception) {
            throw AppException(AppError.ApiError)
        }
    }
}