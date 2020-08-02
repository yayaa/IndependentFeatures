package com.yayandroid.independentfeatures.feature2

import com.squareup.anvil.annotations.MergeComponent

@Feature2Scope
@MergeComponent(
        scope = Feature2Scope::class,
        dependencies = [Feature2Dependencies::class]
)
interface Feature2Component {

    companion object {
        fun create(feature2Dependencies: Feature2Dependencies): Feature2Component =
                DaggerFeature2Component.builder()
                        .feature2Dependencies(feature2Dependencies)
                        .build()
    }

    fun inject(activity: Feature2Activity)

}