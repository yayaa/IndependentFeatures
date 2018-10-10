package com.yayandroid.multipleapplicationcomponent.base.di

import com.yayandroid.multipleapplicationcomponent.base.SampleCoreLogger
import dagger.Module
import dagger.Provides

@Module
class SampleCoreModule {

    @CoreScope
    @Provides fun providesSampleCoreLogger(): SampleCoreLogger = SampleCoreLogger()

}