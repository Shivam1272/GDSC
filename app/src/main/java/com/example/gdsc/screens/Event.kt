package com.example.gdsc.screens

import androidx.compose.runtime.Composable
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.*
import androidx.compose.ui.Modifier
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.gdsc.model.EventDataModel

@Composable
fun EventList(dataModel: List<EventDataModel>){
    LazyColumn{
        items(dataModel) {
                item -> EventScreen(dataModel = item)
        }
    }
}

@Composable
fun EventScreen(dataModel: EventDataModel) {
    Card(modifier = Modifier.padding(16.dp), shape = RoundedCornerShape(12.dp), elevation = 14.dp) {
        Column(verticalArrangement = Arrangement.spacedBy(10.dp)) {
            Image(
                painter = painterResource(dataModel.imageResourceId),
                contentDescription = null,
                modifier = Modifier
                    .fillMaxWidth()
                    .height(380.dp),
                contentScale = ContentScale.Crop
            )
            Row(modifier = Modifier
                .padding(10.dp)
                .fillMaxWidth()) {
                Column {
                    Text(
                        text = LocalContext.current.getString(dataModel.titlestringResourceId),
                        style = TextStyle(fontWeight = FontWeight.Medium, fontSize = 28.sp)
                    )
                    Text(text = LocalContext.current.getString(dataModel.tagResourceId),
                        style = TextStyle(fontSize = 18.sp),
                        textAlign = TextAlign.Justify,
                    )
                }
            }
        }
    }
}