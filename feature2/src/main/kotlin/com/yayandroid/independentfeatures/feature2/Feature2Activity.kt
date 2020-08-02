package com.yayandroid.independentfeatures.feature2

import android.os.Bundle
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import com.yayandroid.independentfeatures.logger.SampleSharedLogger
import dagger.hilt.android.AndroidEntryPoint
import dagger.hilt.android.EntryPointAccessors
import dagger.hilt.android.components.ActivityComponent
import javax.inject.Inject

@AndroidEntryPoint
class Feature2Activity : AppCompatActivity() {

    @Inject lateinit var sampleSharedLogger: SampleSharedLogger

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_feature_2)

        sampleSharedLogger.logSelf()

        val component = EntryPointAccessors.fromActivity(this, ActivityComponent::class.java)
        findViewById<TextView>(R.id.sampleTextView).apply {
            text = "Component: \n${sampleSharedLogger.string(component)}"
        }

    }
}
