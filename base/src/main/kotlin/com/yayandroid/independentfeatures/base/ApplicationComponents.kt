package com.yayandroid.independentfeatures.base

/**
 * Components that will be kept alive during application.
 */
interface ApplicationComponent

/**
 * ApplicationComponent that will contain shared dependencies / modules for the entire application
 * and among all the features.
 */
interface CoreApplicationComponent : ApplicationComponent

/**
 * ApplicationComponent that will be created and used by any feature to store and retrieve
 * their own application level dependencies / modules.
 */
interface FeatureApplicationComponent : ApplicationComponent