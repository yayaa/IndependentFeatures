package com.yayandroid.independentfeatures.base

import android.app.Application
import dagger.BindsInstance
import dagger.Component

@CoreScope
@Component(modules = [SampleCoreModule::class])
interface SampleCoreComponent : CoreApplicationComponent {

    @Component.Builder
    interface Builder {
        @BindsInstance fun application(application: Application): Builder

        fun build(): SampleCoreComponent
    }

    // Expose Logger so depending components can use the same instance
    fun getSampleCoreLogger(): SampleCoreLogger

}
