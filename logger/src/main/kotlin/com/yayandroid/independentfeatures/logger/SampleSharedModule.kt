package com.yayandroid.independentfeatures.logger

import com.squareup.anvil.annotations.ContributesTo
import com.yayandroid.independentfeatures.base.ApplicationScope
import dagger.Module
import dagger.Provides

@ContributesTo(ApplicationScope::class)
@Module
class SampleSharedModule {

    @ApplicationScope
    @Provides
    fun providesSampleSharedLogger(): SampleSharedLogger = SampleSharedLogger()

}