package com.yayandroid.independentfeatures.feature2

import android.os.Bundle
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import com.yayandroid.independentfeatures.logger.SampleSharedLogger
import javax.inject.Inject

class Feature2Activity : AppCompatActivity() {

    @Inject
    lateinit var sampleSharedLogger: SampleSharedLogger

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_feature_2)

        val feature2Component = Feature2Component.create(getDependencies())
        feature2Component.inject(this)
        sampleSharedLogger.logSelf()

        findViewById<TextView>(R.id.sampleTextView).apply {
            text = "Component: \n${sampleSharedLogger.string(feature2Component)}"
        }
    }
}
