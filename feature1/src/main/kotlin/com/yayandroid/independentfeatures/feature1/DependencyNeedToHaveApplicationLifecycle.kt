package com.yayandroid.independentfeatures.feature1

import android.app.Application
import android.util.Log

class DependencyNeedToHaveApplicationLifecycle(private val application: Application) {

    fun logApplication() = Log.e("DependencyAppLifecycle",
            "DependencyRequiresToHaveAppLifecycle instance: $this with application: $application")

}