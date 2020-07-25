package com.yayandroid.independentfeatures

import android.view.LayoutInflater
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.yayandroid.independentfeatures.base.Feature

class FeatureAdapter(private val featureClickListener: FeatureClickListener)
    : RecyclerView.Adapter<FeatureAdapter.ViewHolder>() {

    private var features: List<Feature> = emptyList()

    interface FeatureClickListener {
        fun onFeatureClick(feature: Feature)
    }

    fun setFeatures(list: Set<Feature>) {
        this.features = ArrayList(list)
        notifyDataSetChanged()
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val textView = LayoutInflater.from(parent.context)
                .inflate(R.layout.recycler_item, parent, false) as TextView
        return ViewHolder(textView)
    }

    override fun getItemCount(): Int = features.size

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        holder.bind(features[position])
    }

    inner class ViewHolder(private val textView: TextView) : RecyclerView.ViewHolder(textView) {

        fun bind(feature: Feature) {
            textView.text = feature.title
            textView.setOnClickListener { featureClickListener.onFeatureClick(feature) }
        }
    }
}