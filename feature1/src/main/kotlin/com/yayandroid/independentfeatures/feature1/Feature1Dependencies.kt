package com.yayandroid.independentfeatures.feature1

import android.app.Activity
import com.squareup.anvil.annotations.ContributesTo
import com.yayandroid.independentfeatures.base.ApplicationScope
import com.yayandroid.independentfeatures.base.FeatureDependencyProvider
import com.yayandroid.independentfeatures.logger.SampleSharedLogger

@ContributesTo(ApplicationScope::class)
interface Feature1Dependencies {
    fun sampleSharedLogger(): SampleSharedLogger
    fun dependencyNeedToHaveApplicationLifecycle(): DependencyNeedToHaveApplicationLifecycle
}

internal fun Activity.getDependencies() = (application as FeatureDependencyProvider).dependencies<Feature1Dependencies>()