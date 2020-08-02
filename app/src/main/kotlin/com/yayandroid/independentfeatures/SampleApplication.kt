package com.yayandroid.independentfeatures

import android.app.Application
import com.yayandroid.independentfeatures.base.ApplicationPlugin
import dagger.hilt.android.HiltAndroidApp
import javax.inject.Inject

@HiltAndroidApp
class SampleApplication : Application() {

    @Inject
    lateinit var applicationPlugins: Set<@JvmSuppressWildcards ApplicationPlugin>

    override fun onCreate() {
        super.onCreate()

        applicationPlugins.forEach { it.apply(this) }
    }

}