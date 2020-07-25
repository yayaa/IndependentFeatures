package com.yayandroid.independentfeatures.base.di

import android.app.Application
import com.yayandroid.independentfeatures.base.CoreApplicationComponent
import com.yayandroid.independentfeatures.base.SampleCoreLogger
import dagger.BindsInstance
import dagger.Component

@CoreScope
@Component(modules = arrayOf(SampleCoreModule::class))
interface SampleCoreComponent : CoreApplicationComponent {

    @Component.Builder
    interface Builder {
        @BindsInstance fun application(application: Application): Builder

        fun build(): SampleCoreComponent
    }

    // Expose Logger so depending components can use the same instance
    fun getSampleCoreLogger(): SampleCoreLogger

}
