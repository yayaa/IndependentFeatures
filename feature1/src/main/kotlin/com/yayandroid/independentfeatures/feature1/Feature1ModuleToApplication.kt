package com.yayandroid.independentfeatures.feature1

import android.app.Application
import com.squareup.anvil.annotations.ContributesTo
import com.yayandroid.independentfeatures.base.ApplicationPlugin
import com.yayandroid.independentfeatures.base.ApplicationScope
import com.yayandroid.independentfeatures.base.Feature
import dagger.Module
import dagger.Provides
import dagger.multibindings.IntoSet

@ContributesTo(ApplicationScope::class)
@Module
class Feature1ModuleToApplication {

    /**
     * This dependency is provided to Application and used by another module - see MainActivity.
     * Using multi binding to abstract feature concept
     */
    @Provides
    @IntoSet
    fun provideFeature1(): Feature = Feature(
            "Feature 1",
            "feature1"
    )

    /**
     * This dependency is provided to Application to be registered during onCreate.
     */
    @Provides
    @IntoSet
    fun provideFeature1ApplicationPlugin(): ApplicationPlugin = Feature1ApplicationPlugin()

    /**
     * This dependency is provided to Application but then it is used by Feature1Activity.
     * As an example for any library that requires to have single instance for Application,
     * but required only for a specific feature and should not exist if that feature is not compiled.
     */
    @Provides
    @ApplicationScope
    fun provideDependencyNeedToHaveApplicationLifecycle(application: Application): DependencyNeedToHaveApplicationLifecycle =
            DependencyNeedToHaveApplicationLifecycle(application)

}