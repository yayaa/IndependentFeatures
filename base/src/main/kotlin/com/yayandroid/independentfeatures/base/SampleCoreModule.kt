package com.yayandroid.independentfeatures.base

import dagger.Module
import dagger.Provides

@Module
class SampleCoreModule {

    @CoreScope
    @Provides fun providesSampleCoreLogger(): SampleCoreLogger = SampleCoreLogger()

}