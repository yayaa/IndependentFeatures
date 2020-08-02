package com.yayandroid.independentfeatures

import android.app.Activity
import android.app.Application
import com.squareup.anvil.annotations.MergeComponent
import com.yayandroid.independentfeatures.base.ApplicationPlugin
import com.yayandroid.independentfeatures.base.ApplicationScope
import dagger.BindsInstance
import dagger.Component

@ApplicationScope
@MergeComponent(scope = ApplicationScope::class)
interface ApplicationComponent {

    @Component.Builder
    interface Builder {

        @BindsInstance
        fun application(application: Application): Builder
        fun build(): ApplicationComponent
    }

    fun inject(activity: MainActivity)

    fun inject(application: SampleApplication)

}

internal fun Activity.getApplicationComponent() = (application as SampleApplication).applicationComponent.value