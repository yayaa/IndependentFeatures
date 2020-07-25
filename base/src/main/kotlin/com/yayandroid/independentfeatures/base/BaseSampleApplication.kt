package com.yayandroid.independentfeatures.base

import android.app.Application

/**
 * Base Application is to be used by all the features and top level application
 * to coordinate all the components. CoreApplicationComponent is created here and
 * it should contain any dependency that should be shared among all the features.
 */
abstract class BaseSampleApplication : Application() {

    val coreApplicationComponent: CoreApplicationComponent by lazy {
        DaggerSampleCoreComponent.builder()
                .application(this)
                .build()
    }

    abstract fun feature1ApplicationComponent(): FeatureApplicationComponent

    abstract fun feature2ApplicationComponent(): FeatureApplicationComponent

    abstract fun mainApplicationComponent(): FeatureApplicationComponent

}