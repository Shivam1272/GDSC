package com.example.gdsc.screens

import androidx.compose.foundation.layout.Column
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.sp

@Composable
fun FAQ(){
    Column() {
        Text(text = "Frequently Asked Questions", fontWeight = FontWeight.Bold, fontSize = 30.sp)
        Text(text = "Who can become a member?",fontWeight = FontWeight.Bold,fontSize = 27.sp)
        Text(text = "The clubs is open to any student, ranging from novice developers who are just starting, to advanced developers who want to further their skills.")
        Text(text = "How frequently do events and workshops occur?",fontWeight = FontWeight.Bold,fontSize = 27.sp)
        Text(text = "We have a hands-on session every Tuesday at SG25 from 1800hrs to 2030hrs. We also hold workshops and showcases & we would recommend you to join our community to get updates.")
        Text(text = "What should I carry when attending a workshop?",fontWeight = FontWeight.Bold,fontSize = 27.sp)
        Text(text = "We recommend you carry with you a notebook, pen and a laptop because more often than not we make our hands dirty with code. Most importantly, carry along a healthy dose of curiosity and enthusiasm.")
        Text(text = "Who should I reach out to if I have any questions?",fontWeight = FontWeight.Bold,fontSize = 27.sp)
        Text(text = "If you have any questions or comments, please don't hesitate to contact us by clicking the button below. We would be happy to stay engaged via email even after the event")
    }
}