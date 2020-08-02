package com.yayandroid.independentfeatures.feature2

import com.yayandroid.independentfeatures.base.Feature
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.android.components.ApplicationComponent
import dagger.multibindings.IntoSet

@InstallIn(ApplicationComponent::class)
@Module
class Feature2ModuleToApplication {

    @Provides
    @IntoSet
    fun provideFeature2(): Feature = Feature(
            "Feature 2",
            "feature2"
    )

}