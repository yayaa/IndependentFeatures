package com.yayandroid.independentfeatures.logger

import android.util.Log

class SampleSharedLogger {

    fun logSelf() = Log.e("SampleSharedLogger", "SampleSharedLogger instance: $this with hashcode: ${this.hashCode()}")

    fun string(component: Any) = "${component.javaClass.simpleName} ${component.hashCode()}"

}