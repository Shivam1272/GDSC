package com.example.gdsc.data

import com.example.gdsc.R
import com.example.gdsc.model.EventDataModel

class EventDataSource {
    fun loadDataModels(): List<EventDataModel> {
        return listOf<EventDataModel>(
            EventDataModel(R.drawable.jetpack, R.string.EventTitle, R.string.CampLevel),
        )
    }
}