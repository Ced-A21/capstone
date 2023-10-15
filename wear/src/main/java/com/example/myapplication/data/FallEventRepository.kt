package com.example.myapplication.data

import android.content.Context
import androidx.datastore.core.DataStore
import androidx.datastore.preferences.core.Preferences
import androidx.datastore.preferences.core.booleanPreferencesKey
import androidx.datastore.preferences.core.doublePreferencesKey
import androidx.datastore.preferences.core.edit
import androidx.datastore.preferences.preferencesDataStore
import androidx.lifecycle.MutableLiveData
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.map
import com.example.myapplication.data.FallEventData

val Context.FallEventDataStore: DataStore<Preferences> by preferencesDataStore(name = "fall_event_data")

class FallEventRepository(private val context: Context) {

    suspend fun storeLatestHeartRate(heartRate: Double) {
        TODO()
        }
    // should be moved in ViewModel
    val fallEvent: MutableLiveData<FallEventData> by lazy {
        MutableLiveData<FallEventData>()
    }
    suspend fun updateFall(eventData: FallEventData) {
        fallEvent.value = eventData
    }
}
