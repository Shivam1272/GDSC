package com.example.gdsc.data

import com.example.gdsc.R
import com.example.gdsc.model.TeamDataModel
import com.example.gdsc.model.Techdatamodel

class TeamDataSource {
    fun loadDataModels(): List<TeamDataModel> {
        return listOf<TeamDataModel>(
            TeamDataModel(R.drawable.amey, R.string.Amey, R.string.ameyRole),
            TeamDataModel(R.drawable.mahendra, R.string.mahendra, R.string.mahendraRole),
            TeamDataModel(R.drawable.hitanshu, R.string.hitanshu, R.string.hitanshuRole),
        )
    }
}