package com.yayandroid.independentfeatures.feature1

import com.yayandroid.independentfeatures.base.Feature
import dagger.Module
import dagger.Provides
import dagger.multibindings.IntoSet

@Module
class Feature1ModuleToApplication {

    @Provides
    @IntoSet
    fun provideFeature1(): Feature = Feature(
            "Feature 1",
            "feature1"
    )

}