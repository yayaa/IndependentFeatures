package com.yayandroid.independentfeatures

import android.app.Activity
import com.yayandroid.independentfeatures.base.CoreApplicationComponent
import com.yayandroid.independentfeatures.base.FeatureApplicationComponent
import com.yayandroid.independentfeatures.base.di.ActivityScope
import com.yayandroid.independentfeatures.base.di.SampleCoreComponent
import dagger.Component

@ActivityScope
@Component(dependencies = arrayOf(SampleCoreComponent::class))
abstract class MainComponent : FeatureApplicationComponent{

    companion object {
        fun create(coreComponent: CoreApplicationComponent): MainComponent = DaggerMainComponent.builder()
                .sampleCoreComponent(coreComponent as SampleCoreComponent)
                .build()
    }

    abstract fun inject(activity: MainActivity)

}

internal fun Activity.getMainComponent() = (application as SampleApplication).mainApplicationComponent() as MainComponent