package com.yayandroid.independentfeatures.logger

import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.android.components.ApplicationComponent
import javax.inject.Singleton

@InstallIn(ApplicationComponent::class)
@Module
class SampleSharedModule {

    @Singleton
    @Provides
    fun providesSampleSharedLogger(): com.yayandroid.independentfeatures.logger.SampleSharedLogger = com.yayandroid.independentfeatures.logger.SampleSharedLogger()

}