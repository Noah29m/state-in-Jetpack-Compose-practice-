package com.project.states

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.padding
import androidx.compose.material.Button
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp

@Composable
fun WaterCounter(){
    Column(modifier = Modifier.padding(16.dp))
    { var count =0
    Text(text = "You've had $count glasses.")
    Button(onClick = {count++ }, modifier = Modifier.padding(top = 8.dp)

        ) {
        Text(text = "Add one ")
        
    }
}
}