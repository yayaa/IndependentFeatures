package com.yayandroid.independentfeatures.feature2

import android.app.Activity
import com.squareup.anvil.annotations.ContributesTo
import com.yayandroid.independentfeatures.base.ApplicationScope
import com.yayandroid.independentfeatures.base.FeatureDependencyProvider
import com.yayandroid.independentfeatures.logger.SampleSharedLogger

@ContributesTo(ApplicationScope::class)
interface Feature2Dependencies {
    fun sampleSharedLogger(): SampleSharedLogger
}

internal fun Activity.getDependencies() = (application as FeatureDependencyProvider).dependencies<Feature2Dependencies>()