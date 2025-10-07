package com.example.silenciomobilestore.ui.components

import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.ArrowBack
import androidx.compose.material.icons.filled.BatteryFull
import androidx.compose.material.icons.filled.Memory
import androidx.compose.material.icons.filled.Speed
import androidx.compose.material.icons.filled.Tv
import androidx.compose.material3.*
import androidx.compose.runtime.Composable
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.silenciomobilestore.data.Phone
import com.example.silenciomobilestore.data.PhoneDataSource

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun PhoneListScreen(
    onBackClick: () -> Unit
) {

    val gamingPhones = remember { PhoneDataSource.loadGamingPhones() }

    Scaffold(
        topBar = {
            CenterAlignedTopAppBar(
                title = {
                    Text(
                        "Top 5 Celulares Gamers",
                        fontWeight = FontWeight.Bold,
                        color = Color.White
                    )
                },
                colors = TopAppBarDefaults.centerAlignedTopAppBarColors(
                    containerColor = Color(0xFF1a1a1a)
                ),
                navigationIcon = {
                    IconButton(onClick = onBackClick) {
                        Icon(
                            imageVector = Icons.Default.ArrowBack,
                            contentDescription = "Voltar",
                            tint = Color.White
                        )
                    }
                }
            )
        },
        containerColor = Color.Black
    ) { innerPadding ->
        if (gamingPhones.isEmpty()) {
            Column(
                modifier = Modifier
                    .fillMaxSize()
                    .padding(innerPadding)
                    .padding(16.dp),
                horizontalAlignment = Alignment.CenterHorizontally,
                verticalArrangement = Arrangement.Center
            ) {
                Text(
                    "Nenhum celular gamer encontrado",
                    color = Color.White,
                    fontSize = 16.sp
                )
            }
        } else {
            LazyColumn(
                modifier = Modifier
                    .fillMaxSize()
                    .padding(innerPadding)
                    .padding(16.dp)
            ) {
                items(gamingPhones) { phone ->
                    GamingPhoneCard(phone = phone)
                    Spacer(modifier = Modifier.height(12.dp))
                }
            }
        }
    }
}

@Composable
fun GamingPhoneCard(phone: Phone) {
    Card(
        modifier = Modifier.fillMaxWidth(),
        colors = CardDefaults.cardColors(
            containerColor = Color(0xFF2a2a2a)
        ),
        elevation = CardDefaults.cardElevation(defaultElevation = 4.dp)
    ) {
        Column(
            modifier = Modifier.padding(16.dp)
        ) {
            Row(
                modifier = Modifier.fillMaxWidth(),
                horizontalArrangement = Arrangement.SpaceBetween,
                verticalAlignment = Alignment.CenterVertically
            ) {
                Column {
                    Text(
                        "${phone.brand} ${phone.model}",
                        color = Color.White,
                        fontWeight = FontWeight.Bold,
                        fontSize = 18.sp
                    )
                    Text(
                        "Ano: ${phone.releaseYear}",
                        color = Color.Gray,
                        fontSize = 12.sp
                    )
                }
                Card(
                    colors = CardDefaults.cardColors(containerColor = Color(0xFF00ff88))
                ) {
                    Text(
                        "Score: ${phone.benchmarkScore}",
                        modifier = Modifier.padding(horizontal = 8.dp, vertical = 4.dp),
                        color = Color.Black,
                        fontWeight = FontWeight.Bold,
                        fontSize = 12.sp
                    )
                }
            }

            Spacer(modifier = Modifier.height(12.dp))

            Column {
                GamingSpecItem(
                    icon = Icons.Default.Speed,
                    title = "Processador",
                    value = phone.processor.chipset
                )
                GamingSpecItem(
                    icon = Icons.Default.Memory,
                    title = "RAM",
                    value = "${phone.memory.ram}GB"
                )
                GamingSpecItem(
                    icon = Icons.Default.Tv,
                    title = "Tela",
                    value = "${phone.screen.size}\" ${phone.screen.technology} ${phone.screen.refreshRate}Hz"
                )
                GamingSpecItem(
                    icon = Icons.Default.BatteryFull,
                    title = "Bateria",
                    value = "${phone.battery.capacity}mAh - ${phone.battery.charging}"
                )
            }

            Spacer(modifier = Modifier.height(8.dp))

            val hasHeatingIssues = phone.cons.any {
                it.contains("aquecimento", ignoreCase = true) ||
                        it.contains("superaquecimento", ignoreCase = true)
            }

            if (hasHeatingIssues) {
                Text(
                    "⚠️ Pode aquecer em jogos pesados",
                    color = Color(0xFFFFA500),
                    fontSize = 12.sp,
                    fontWeight = FontWeight.Medium
                )
            } else {
                Text(
                    "✅ Temperatura estável",
                    color = Color(0xFF00ff88),
                    fontSize = 12.sp,
                    fontWeight = FontWeight.Medium
                )
            }
        }
    }
}

@Composable
fun GamingSpecItem(icon: ImageVector, title: String, value: String) {
    Row(
        modifier = Modifier.fillMaxWidth(),
        verticalAlignment = Alignment.CenterVertically
    ) {
        Icon(
            imageVector = icon,
            contentDescription = null,
            tint = Color(0xFF00ff88),
            modifier = Modifier.size(16.dp)
        )
        Spacer(modifier = Modifier.width(8.dp))
        Text(
            "$title: ",
            color = Color.Gray,
            fontSize = 14.sp
        )
        Text(
            value,
            color = Color.White,
            fontSize = 14.sp,
            fontWeight = FontWeight.Medium
        )
    }
    Spacer(modifier = Modifier.height(4.dp))
}