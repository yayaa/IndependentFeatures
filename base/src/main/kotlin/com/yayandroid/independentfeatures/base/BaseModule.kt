package com.yayandroid.independentfeatures.base

import com.squareup.anvil.annotations.ContributesTo
import dagger.Module
import dagger.Provides
import dagger.multibindings.ElementsIntoSet

/**
 * Provide empty set of abstractions to ensure compilation even if no feature provides them
 */
@ContributesTo(ApplicationScope::class)
@Module
class BaseModule {

    @Provides
    @ElementsIntoSet
    fun provideFeatureSet(): Set<Feature> = emptySet()

    @Provides
    @ElementsIntoSet
    fun provideApplicationPluginSet(): Set<ApplicationPlugin> = emptySet()

}