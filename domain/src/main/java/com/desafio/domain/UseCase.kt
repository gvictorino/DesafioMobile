package com.desafio.domain

abstract class UseCase<out T> {
    abstract fun execute() : T
}