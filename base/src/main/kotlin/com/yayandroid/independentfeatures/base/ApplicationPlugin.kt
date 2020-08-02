package com.yayandroid.independentfeatures.base

import android.app.Application

/**
 * Read more about it
 * https://medium.com/@yahyabayramoglu/how-big-is-your-application-4c89377c51d
 */
interface ApplicationPlugin {

    fun apply(application: Application)

}