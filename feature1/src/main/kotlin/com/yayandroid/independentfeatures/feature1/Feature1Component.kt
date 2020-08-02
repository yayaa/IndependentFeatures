package com.yayandroid.independentfeatures.feature1

import com.squareup.anvil.annotations.MergeComponent

@Feature1Scope
@MergeComponent(
        scope = Feature1Scope::class,
        dependencies = [Feature1Dependencies::class]
)
interface Feature1Component {

    companion object {
        fun create(feature1Dependencies: Feature1Dependencies): Feature1Component =
                DaggerFeature1Component.builder()
                        .feature1Dependencies(feature1Dependencies)
                        .build()
    }

    fun inject(activity: Feature1Activity)

}