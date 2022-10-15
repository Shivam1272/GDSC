package com.example.gdsc.screens

import androidx.compose.runtime.Composable
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.gdsc.model.TeamDataModel

@Composable
fun Team(dataModel: List<TeamDataModel>){
    LazyColumn{
        items(dataModel) {
                item -> TeamScreen(dataModel = item)
        }
    }
}

@Composable
fun TeamScreen(dataModel: TeamDataModel) {
    Card(modifier = Modifier.padding(16.dp), shape = RoundedCornerShape(12.dp), elevation = 14.dp) {
        Column(verticalArrangement = Arrangement.spacedBy(10.dp)) {
            Box(Modifier.background(color = Color.Blue).fillMaxWidth().height(280.dp),
                contentAlignment = Alignment.Center
                ) {
                Image(
                    painter = painterResource(dataModel.imageResourceId),
                    contentDescription = null,
                    modifier = Modifier.clip(shape = CircleShape).size(200.dp),
                    contentScale = ContentScale.Crop
                )
            }
            Row(modifier = Modifier
                .padding(10.dp)
                .fillMaxWidth()) {
                Column {
                    Text(
                        text = LocalContext.current.getString(dataModel.nameResourceId),
                        style = TextStyle(fontWeight = FontWeight.Medium, fontSize = 28.sp)
                    )
                    Text(text = LocalContext.current.getString(dataModel.fieldResourceId),
                        style = TextStyle(fontSize = 18.sp),
                        textAlign = TextAlign.Justify,
                    )
                }
            }
        }
    }
}