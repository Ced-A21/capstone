package com.example.myapplication.service

import androidx.health.services.client.PassiveListenerService
import androidx.health.services.client.data.DataPointContainer
import androidx.health.services.client.data.DataType
import androidx.health.services.client.data.HealthEvent
import com.example.myapplication.data.FallEventData
import kotlinx.coroutines.runBlocking
import com.example.myapplication.data.FallEventRepository

class PassiveDataService : PassiveListenerService() {
    private val repository = FallEventRepository(this)
    override fun onHealthEventReceived(event: HealthEvent) {
        runBlocking {
            if (event.type == HealthEvent.Type.FALL_DETECTED) {
                TODO()
                repository.updateFall(FallEventData(event.type.toString(), event.eventTime.toString()))
            }
        }
    }
}