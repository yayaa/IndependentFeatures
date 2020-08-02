package com.yayandroid.independentfeatures.base

interface FeatureDependencyProvider {

    fun <T> dependencies(): T

}