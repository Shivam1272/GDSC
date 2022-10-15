package com.example.gdsc.data

import com.example.gdsc.R
import com.example.gdsc.model.Techdatamodel

class TechDatasrc {
    fun loadDataModels(): List<Techdatamodel> {
        return listOf<Techdatamodel>(
            Techdatamodel(R.drawable.app, R.string.TechDataModelT1, R.string.TechDataModelD1),
            Techdatamodel(R.drawable.web, R.string.TechDataModelT2, R.string.TechDataModelD2),
        )
    }
}