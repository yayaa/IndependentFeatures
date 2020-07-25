package com.yayandroid.independentfeatures.base

import android.app.Application
import com.yayandroid.independentfeatures.base.di.DaggerSampleCoreComponent

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