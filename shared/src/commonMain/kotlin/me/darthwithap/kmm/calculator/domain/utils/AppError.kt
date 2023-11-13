package me.darthwithap.kmm.calculator.domain.utils

enum class AppError {
    // Todo: Add kinds of errors that can occur in the app
    CalculationError,
    InvalidExpressionError,
    ApiError,
    UnknownError
}

class AppException(error: AppError) : Exception(message = "Error: ${error.name}")