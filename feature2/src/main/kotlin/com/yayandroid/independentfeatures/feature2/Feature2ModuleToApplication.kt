package com.yayandroid.independentfeatures.feature2

import com.squareup.anvil.annotations.ContributesTo
import com.yayandroid.independentfeatures.base.ApplicationScope
import com.yayandroid.independentfeatures.base.Feature
import dagger.Module
import dagger.Provides
import dagger.multibindings.IntoSet

@ContributesTo(ApplicationScope::class)
@Module
class Feature2ModuleToApplication {

    @Provides
    @IntoSet
    fun provideFeature2(): Feature = Feature(
            "Feature 2",
            "feature2"
    )

}