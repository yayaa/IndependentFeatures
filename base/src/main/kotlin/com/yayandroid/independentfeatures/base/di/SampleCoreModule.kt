package com.yayandroid.independentfeatures.base.di

import com.yayandroid.independentfeatures.base.SampleCoreLogger
import dagger.Module
import dagger.Provides

@Module
class SampleCoreModule {

    @CoreScope
    @Provides fun providesSampleCoreLogger(): SampleCoreLogger = SampleCoreLogger()

}