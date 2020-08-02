package com.yayandroid.independentfeatures.feature1

import android.os.Bundle
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import com.yayandroid.independentfeatures.logger.SampleSharedLogger
import javax.inject.Inject

class Feature1Activity : AppCompatActivity() {

    @Inject lateinit var sampleSharedLogger: SampleSharedLogger
    @Inject lateinit var dependencyNeedToHaveApplicationLifecycle: DependencyNeedToHaveApplicationLifecycle

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_feature_1)

        val feature1Component = Feature1Component.create(getDependencies())
        feature1Component.inject(this)
        sampleSharedLogger.logSelf()
        dependencyNeedToHaveApplicationLifecycle.logApplication()

        findViewById<TextView>(R.id.sampleTextView).apply {
            text = "Component: \n${sampleSharedLogger.string(feature1Component)}"
        }
    }
}
