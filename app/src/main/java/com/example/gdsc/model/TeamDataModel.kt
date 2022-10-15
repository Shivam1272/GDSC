package com.example.gdsc.model

import androidx.annotation.DrawableRes
import androidx.annotation.StringRes

data class TeamDataModel(
    @DrawableRes val imageResourceId: Int,
    @StringRes val nameResourceId: Int,
    @StringRes val fieldResourceId: Int,
)
