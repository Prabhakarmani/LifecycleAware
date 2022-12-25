package com.example.lifecycleaware

import android.util.Log
import android.widget.Toast
import androidx.lifecycle.Lifecycle
import androidx.lifecycle.LifecycleObserver
import androidx.lifecycle.OnLifecycleEvent

class Observer : LifecycleObserver
{
    @OnLifecycleEvent(Lifecycle.Event.ON_CREATE)
    fun onCreate()
    {
        Log.d("Main","Observer OnCreate")

    }

    @OnLifecycleEvent(Lifecycle.Event.ON_RESUME)
    fun onResume()
    {
        Log.d("Main","Observer onResume")
    }

    @OnLifecycleEvent(Lifecycle.Event.ON_PAUSE)
    fun onPause()
    {
        Log.d("Main","Observer onPause")
    }

    @OnLifecycleEvent(Lifecycle.Event.ON_STOP)
    fun onStop()
    {
        Log.d("Main","Observer onStop")
    }

    @OnLifecycleEvent(Lifecycle.Event.ON_DESTROY)
    fun onDestroy()
    {
        Log.d("Main","Observer onDestroy")
    }
}