package com.yayandroid.multipleapplicationcomponent.feature2

import android.app.Activity
import com.yayandroid.multipleapplicationcomponent.base.BaseSampleApplication
import com.yayandroid.multipleapplicationcomponent.base.CoreApplicationComponent
import com.yayandroid.multipleapplicationcomponent.base.FeatureApplicationComponent
import com.yayandroid.multipleapplicationcomponent.base.di.SampleCoreComponent
import dagger.Component

@Feature2Scope
@Component(dependencies = arrayOf(SampleCoreComponent::class))
interface Feature2Component : FeatureApplicationComponent {

    companion object {
        fun create(coreApplicationComponent: CoreApplicationComponent): Feature2Component
                = DaggerFeature2Component.builder()
                .sampleCoreComponent(coreApplicationComponent as SampleCoreComponent)
                .build()
    }

    fun inject(activity: Feature2Activity)

}

internal fun Activity.getApplicationComponent()
        = (application as BaseSampleApplication).feature2ApplicationComponent() as Feature2Component