package com.example.gdsc.screens

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.verticalScroll
import androidx.compose.material.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.gdsc.R
import org.intellij.lang.annotations.JdkConstants.HorizontalAlignment

@Composable
fun OverviewScreen(){
    Column(modifier = Modifier
        .verticalScroll(rememberScrollState())) {
        Text(text = "Google Developer Student Clubs Atharva College Of Engineering - Mumbai", Modifier.padding(12.dp), fontWeight = FontWeight.Bold, fontSize = 26.sp, textAlign = TextAlign.Justify)
        Text(text = "Google Developer Student Clubs is a Developers program for university students to learn mobile and web development skills, design thinking skills and leadership skills.", Modifier.padding(12.dp),textAlign = TextAlign.Justify )
//        Image(painter = painterResource(id = R.drawable.gdsc), contentDescription = null)
        Button(onClick = { /*TODO*/ }, elevation = ButtonDefaults.elevation(10.dp), modifier = Modifier.padding(4.dp)) {
            Text(text = "Become a Member", Modifier.background(color = Color.Blue), fontWeight = FontWeight.Bold)
        }
        Card(modifier = Modifier.padding(4.dp),
            shape = RoundedCornerShape(15.dp),
            backgroundColor = MaterialTheme.colors.surface) {
            Row(horizontalArrangement =  Arrangement.Center,
                verticalAlignment = Alignment.CenterVertically){
                Column(
                    modifier = Modifier.padding(10.dp),
                    verticalArrangement = Arrangement.Center,
                    horizontalAlignment = Alignment.CenterHorizontally
                    ) {
                    Image(painter = painterResource(id = R.drawable.ic_launcher_background), contentDescription = "Connect")
                    Text(text = "Connect", fontWeight = FontWeight.Bold, fontSize = 20.sp)
                }
                Text(text = "Meet students interested in developer technologies at your university. All are welcome, including those with diverse backgrounds and different majors.",textAlign = TextAlign.Justify)
            }
        }
        Card(modifier = Modifier.padding(4.dp),
            shape = RoundedCornerShape(10.dp),
            backgroundColor = MaterialTheme.colors.surface) {
            Row(horizontalArrangement =  Arrangement.Center,
                verticalAlignment = Alignment.CenterVertically) {
                Column(modifier = Modifier.padding(10.dp),
                    verticalArrangement = Arrangement.Center,
                    horizontalAlignment = Alignment.CenterHorizontally) {
                    Image(painter = painterResource(id = R.drawable.ic_launcher_background), contentDescription = "Learn")
                    Text(text = "Learn", fontWeight = FontWeight.Bold, fontSize = 20.sp)
                }
                Text(text = "Learn about a range of technical topics and gain new skills through hands-on workshops, events, talks, and project-building activities - both online and in-person.",textAlign = TextAlign.Justify,)
            }
        }
        Card(modifier = Modifier.padding(4.dp),
            shape = RoundedCornerShape(10.dp),
            backgroundColor = MaterialTheme.colors.surface) {
            Row(horizontalArrangement =  Arrangement.Center,
                verticalAlignment = Alignment.CenterVertically) {
                Column(modifier = Modifier.padding(10.dp),
                    verticalArrangement = Arrangement.Center,
                    horizontalAlignment = Alignment.CenterHorizontally) {
                    Image(painter = painterResource(id = R.drawable.ic_launcher_background), contentDescription = "Grow")
                    Text(text = "Grow", fontWeight = FontWeight.Bold, fontSize = 20.sp)
                }
                Text(text = "Apply new learnings to build great solutions for local problems. Advance your skills, career, and network. Give back to your community by helping others learn, too.",textAlign = TextAlign.Justify)
            }
        }
        Text(text = "Opportunities GDSCs provide students with", Modifier.padding(10.dp), fontSize = 25.sp, fontWeight = FontWeight.Bold, textAlign = TextAlign.Justify)
        Text(text = "1. Grow their knowledge on developer technologies and more through peer to peer workshops and events.", Modifier.padding(2.dp), textAlign = TextAlign.Justify)
        Text(text = "2. Gain relevant industry experience by solving problems for local organizations with technology based solutions.",Modifier.padding(2.dp), textAlign = TextAlign.Justify )
        Text(text = "3. Showcase their prototypes and solutions to their local community and industry leaders.",Modifier.padding(2.dp), textAlign = TextAlign.Justify)
        Text(text = "4 .Getting inspiration to become world-class developers and change makers from sharing others' success stories.", Modifier.padding(2.dp), textAlign = TextAlign.Justify)
    }
}


