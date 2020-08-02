package com.yayandroid.independentfeatures

import android.content.Intent
import android.net.Uri
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.yayandroid.independentfeatures.base.Feature
import com.yayandroid.independentfeatures.logger.SampleSharedLogger
import javax.inject.Inject

class MainActivity : AppCompatActivity(), FeatureAdapter.FeatureClickListener {

    @Inject lateinit var features: Set<Feature>
    @Inject lateinit var sampleSharedLogger: SampleSharedLogger

    private val featureAdapter = FeatureAdapter(this)

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val mainComponent = getApplicationComponent()
        mainComponent.inject(this)
        sampleSharedLogger.logSelf()

        featureAdapter.setFeatures(features)
        findViewById<RecyclerView>(R.id.main_recycler).apply {
            setHasFixedSize(true)
            layoutManager = LinearLayoutManager(this@MainActivity)
            adapter = featureAdapter
        }

        sampleSharedLogger.string(mainComponent)
    }

    override fun onFeatureClick(feature: Feature) {
        startActivity(Intent(Intent.ACTION_VIEW).apply {
            data = Uri.Builder().scheme("sample").authority(feature.deeplinkHost).build()
        })
    }

}
