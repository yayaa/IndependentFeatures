package com.yayandroid.independentfeatures.base

import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.android.components.ApplicationComponent
import dagger.multibindings.ElementsIntoSet

/**
 * Provide empty set of abstractions to ensure compilation even if no feature provides them
 */
@InstallIn(ApplicationComponent::class)
@Module
class BaseModule {

    @Provides
    @ElementsIntoSet
    fun provideFeatureSet(): Set<Feature> = emptySet()

    @Provides
    @ElementsIntoSet
    fun provideApplicationPluginSet(): Set<ApplicationPlugin> = emptySet()

}