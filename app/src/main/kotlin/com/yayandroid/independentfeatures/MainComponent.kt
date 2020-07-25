package com.yayandroid.independentfeatures

import android.app.Activity
import com.yayandroid.independentfeatures.base.CoreApplicationComponent
import com.yayandroid.independentfeatures.base.FeatureApplicationComponent
import com.yayandroid.independentfeatures.base.ActivityScope
import com.yayandroid.independentfeatures.base.SampleCoreComponent
import com.yayandroid.independentfeatures.feature1.Feature1ModuleToApplication
import com.yayandroid.independentfeatures.feature2.Feature2ModuleToApplication
import dagger.Component

@ActivityScope
@Component(
        modules = [
            Feature1ModuleToApplication::class,
            Feature2ModuleToApplication::class
        ],
        dependencies = [SampleCoreComponent::class]
)
abstract class MainComponent : FeatureApplicationComponent {

    companion object {
        fun create(coreComponent: CoreApplicationComponent): MainComponent = DaggerMainComponent.builder()
                .sampleCoreComponent(coreComponent as SampleCoreComponent)
                .build()
    }

    abstract fun inject(activity: MainActivity)

}

internal fun Activity.getMainComponent() = (application as SampleApplication).mainApplicationComponent() as MainComponent