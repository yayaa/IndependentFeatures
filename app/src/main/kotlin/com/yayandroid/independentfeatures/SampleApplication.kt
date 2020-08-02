package com.yayandroid.independentfeatures

import android.app.Application
import com.yayandroid.independentfeatures.base.ApplicationPlugin
import com.yayandroid.independentfeatures.base.FeatureDependencyProvider
import javax.inject.Inject

class SampleApplication : Application(), FeatureDependencyProvider {

    val applicationComponent = lazy {
        DaggerApplicationComponent.builder()
                .application(this)
                .build()
    }

    @Inject
    lateinit var applicationPlugins: Set<@JvmSuppressWildcards ApplicationPlugin>

    override fun onCreate() {
        super.onCreate()

        applicationComponent.value.inject(this)
        applicationPlugins.forEach { it.apply(this) }
    }

    @Suppress("UNCHECKED_CAST")
    override fun <T> dependencies(): T {
        return applicationComponent.value as? T
                ?: throw IllegalStateException("Feature does not provide its dependencies to the ApplicationScope.")
    }

}