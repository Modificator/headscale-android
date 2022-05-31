@file:OptIn(ExperimentalMaterial3Api::class)

package com.github.modificator.headscale.ui

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.material3.*
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Alignment.Companion.CenterHorizontally
import androidx.compose.ui.Alignment.Companion.CenterVertically
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.RectangleShape
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.navigation.NavHostController
import com.github.modificator.headscale.Destinations
import com.github.modificator.headscale.R

@Composable
fun Register(navController: NavHostController) {

    Column(horizontalAlignment = Alignment.CenterHorizontally) {
        Spacer(modifier = Modifier.fillMaxHeight(0.2f))
        Image(
            painter = painterResource(R.drawable.ic_register_logo),
            contentDescription = "",
            modifier = Modifier
                .fillMaxWidth(0.5f)
        )
        Spacer(modifier = Modifier.fillMaxHeight(0.18f))
        Button(onClick = {

        }) {
            Text(text = "Register")
        }
        Spacer(modifier = Modifier.fillMaxHeight(0.1f))
        OutlinedCard(modifier = Modifier.fillMaxWidth(0.8f)) {
            Column {
                Box(
                    modifier = Modifier
                        .defaultMinSize(minHeight = 44.dp)
                        .padding(10.dp)
                ) {
                    Text(text = "")
                }
                Divider(color = Color(0xFFA8A8A8))
                Row {
                    TextButton(
                        onClick = { /*TODO*/ },
                        modifier = Modifier
                            .weight(1f)
                            .height(44.dp)
                            .align(CenterVertically),
                        shape = RectangleShape,
                    ) {
                        Text(text = "Copy")
                    }
                    Box(
                        Modifier
                            .size(1.dp, 44.dp)
                            .background(color = Color(0xFF6D6868))) {}
                    TextButton(
                        onClick = { /*TODO*/ },
                        modifier = Modifier
                            .weight(1f)
                            .height(44.dp)
                            .align(CenterVertically),
                        shape = RectangleShape,
                    ) {
                        Text(text = "Open Browser")
                    }
                }
            }
        }
    }
}