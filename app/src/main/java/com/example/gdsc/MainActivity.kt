package com.example.gdsc

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.example.gdsc.data.EventDataSource
import com.example.gdsc.data.TeamDataSource
import com.example.gdsc.data.TechDatasrc
import com.example.gdsc.screens.*
import com.example.gdsc.ui.theme.GDSCTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            GDSCTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colors.background
                ) {
//                    OverviewScreen()
//                    Technology(dataModel = TechDatasrc().loadDataModels())
//                    EventList(dataModel = EventDataSource().loadDataModels())
//                    Team(dataModel = TeamDataSource().loadDataModels())
                    FAQ()
                }

            }
        }
    }
}

@Preview(showBackground = true, showSystemUi = true)
@Composable
fun DefaultPreview() {
    GDSCTheme {
//        OverviewScreen()
//        Technology(dataModel = TechDatasrc().loadDataModels())
//        EventList(dataModel = EventDataSource().loadDataModels())
//        Team(dataModel = TeamDataSource().loadDataModels())
        FAQ()
    }
}