package com.yayandroid.independentfeatures.feature1

import android.os.Bundle
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import com.yayandroid.independentfeatures.base.SampleCoreLogger
import javax.inject.Inject

class Feature1Activity : AppCompatActivity() {

    @Inject lateinit var sampleCoreLogger: SampleCoreLogger

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_feature_1)

        val feature1Component = getApplicationComponent()
        feature1Component.inject(this)
        sampleCoreLogger.logSelf()

        findViewById<TextView>(R.id.sampleTextView).apply {
            text = "Component: \n${sampleCoreLogger.string(feature1Component)}"
        }
    }
}
