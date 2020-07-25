package com.yayandroid.independentfeatures.feature2

import com.yayandroid.independentfeatures.base.Feature
import dagger.Module
import dagger.Provides
import dagger.multibindings.IntoSet

@Module
class Feature2ModuleToApplication {

    @Provides
    @IntoSet
    fun provideFeature1(): Feature = Feature(
            "Feature 2",
            "feature2"
    )

}