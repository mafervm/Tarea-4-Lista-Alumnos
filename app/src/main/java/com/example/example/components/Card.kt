package com.example.example.components

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavHostController
import androidx.navigation.compose.rememberNavController
import com.example.example.R
import com.example.example.models.Person

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun DataCard(navController: NavHostController, person: Person, color: Color) {
    val message = "No afortunado"

    Card(
        colors = CardDefaults.cardColors(containerColor = color),
        onClick = {
            navController.navigate("AlumnView" +
                    "/$message" +
                    "/${person.id}" +
                    "/${person.nombre}" +
                    "/${person.correo}" +
                    "/${person.semestre}" +
                    "/${person.carrera}" +
                    "/${person.becado}" +
                    "/${person.promedio}" +
                    "/${person.boletos}" +
                    "/${person.img}"
            )
        }
    ) {
        Row(
            modifier = Modifier
                .fillMaxWidth()
                .padding(horizontal = 10.dp, vertical = 20.dp),
            horizontalArrangement = Arrangement.Center,
            verticalAlignment = Alignment.CenterVertically
        ) {
            Image(
                painter = painterResource(id = person.img),
                contentDescription = "AlumnPic",
                contentScale = ContentScale.Crop,
                modifier = Modifier.size(100.dp)
            )

            Spacer(modifier = Modifier.width(18.dp))

            Column (

            ) {
                Text(
                    text = "${person.id} | ${person.nombre}",
                    fontWeight = FontWeight.Bold,
                    fontSize = 16.sp
                )

                Spacer(modifier = Modifier.height(10.dp))

                Text(
                    text = "${person.correo}",
                    color = Color(0xFFD4A73C),
                    fontSize = 11.sp
                )

                Spacer(modifier = Modifier.height(10.dp))

                Text(
                    text = "${person.carrera}",
                    fontSize = 11.sp
                )
            }
        }
    }
}

@Preview(showBackground = true)
@Composable
fun PreviewCard() {
    DataCard(
        navController = rememberNavController(),
        person = Person(R.drawable.student_icon, 21767, "María Fernanda Villarreal Mar", "maria.villarreal02@iest.edu.mx", 8, "ISND", true, 94,0),
        color = Color(0xFFF2F2F2)
    )
}