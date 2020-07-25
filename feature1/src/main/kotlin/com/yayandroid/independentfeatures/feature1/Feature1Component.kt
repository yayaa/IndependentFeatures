package com.yayandroid.independentfeatures.feature1

import android.app.Activity
import com.yayandroid.independentfeatures.base.BaseSampleApplication
import com.yayandroid.independentfeatures.base.CoreApplicationComponent
import com.yayandroid.independentfeatures.base.FeatureApplicationComponent
import com.yayandroid.independentfeatures.base.SampleCoreComponent
import dagger.Component

@Feature1Scope
@Component(dependencies = [SampleCoreComponent::class])
interface Feature1Component : FeatureApplicationComponent {

    companion object {
        fun create(coreApplicationComponent: CoreApplicationComponent): Feature1Component
                = DaggerFeature1Component.builder()
                .sampleCoreComponent(coreApplicationComponent as SampleCoreComponent)
                .build()
    }

    fun inject(activity: Feature1Activity)

}

internal fun Activity.getApplicationComponent()
        = (application as BaseSampleApplication).feature1ApplicationComponent() as Feature1Component