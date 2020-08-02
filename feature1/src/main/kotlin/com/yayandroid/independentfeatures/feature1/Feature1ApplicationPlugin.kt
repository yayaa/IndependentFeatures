package com.yayandroid.independentfeatures.feature1

import android.app.Application
import android.util.Log
import com.yayandroid.independentfeatures.base.ApplicationPlugin

class Feature1ApplicationPlugin : ApplicationPlugin {

    private var initialized: Boolean = false

    override fun apply(application: Application) {
        if (initialized) {
            throw IllegalStateException("It is already initialized, should be called only once.")
        }
        this.initialized = true
        Log.e("Feature1AppPlugin",
                "Feature1ApplicationPlugin "
                        + "instance: $this "
                        + "as initialized: $initialized")
    }

}