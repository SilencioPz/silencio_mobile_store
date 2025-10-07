package com.example.silenciomobilestore.ui.components

import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.ArrowBack
import androidx.compose.material.icons.filled.Memory
import androidx.compose.material.icons.filled.Speed
import androidx.compose.material.icons.filled.Star
import androidx.compose.material.icons.filled.Whatshot
import androidx.compose.material3.*
import androidx.compose.runtime.Composable
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.silenciomobilestore.data.PhoneDataSource
import com.example.silenciomobilestore.data.Phone

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun PhoneDetailsScreen(
    onBackClick: () -> Unit
) {
    val topPerformancePhones = remember { PhoneDataSource.loadTopPerformancePhones() }

    Scaffold(
        topBar = {
            CenterAlignedTopAppBar(
                title = {
                    Text(
                        "Top 5 Performance",
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
        if (topPerformancePhones.isEmpty()) {
            Column(
                modifier = Modifier
                    .fillMaxSize()
                    .padding(innerPadding)
                    .padding(16.dp),
                horizontalAlignment = Alignment.CenterHorizontally,
                verticalArrangement = Arrangement.Center
            ) {
                Text(
                    "Nenhum celular encontrado",
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
                items(topPerformancePhones) { phone ->
                    PerformancePhoneCard(phone = phone)
                    Spacer(modifier = Modifier.height(12.dp))
                }
            }
        }
    }
}

@Composable
fun PerformancePhoneCard(phone: Phone) {
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
                Column(
                    modifier = Modifier.weight(1f)
                ) {
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

                Column(
                    horizontalAlignment = Alignment.End
                ) {
                    Card(
                        colors = CardDefaults.cardColors(containerColor = Color(0xFFff6b35))
                    ) {
                        Text(
                            "Score: ${phone.benchmarkScore}",
                            modifier = Modifier.padding(horizontal = 8.dp, vertical = 4.dp),
                            color = Color.White,
                            fontWeight = FontWeight.Bold,
                            fontSize = 12.sp
                        )
                    }
                    Spacer(modifier = Modifier.height(4.dp))
                    Text(
                        "Performance",
                        color = Color.Gray,
                        fontSize = 10.sp
                    )
                }
            }

            Spacer(modifier = Modifier.height(12.dp))

            Column {
                PerformanceSpecItem(
                    icon = Icons.Default.Speed,
                    title = "Chipset",
                    value = phone.processor.chipset
                )
                PerformanceSpecItem(
                    icon = Icons.Default.Whatshot,
                    title = "GPU",
                    value = phone.processor.gpu
                )
                PerformanceSpecItem(
                    icon = Icons.Default.Memory,
                    title = "RAM",
                    value = "${phone.memory.ram}GB"
                )
                PerformanceSpecItem(
                    icon = Icons.Default.Star,
                    title = "Tela",
                    value = "${phone.screen.size}\" ${phone.screen.technology} ${phone.screen.refreshRate}Hz"
                )
            }

            Spacer(modifier = Modifier.height(8.dp))

            val hasHeatingIssues = phone.cons.any {
                it.contains("aquecimento", ignoreCase = true) ||
                        it.contains("superaquecimento", ignoreCase = true)
            }

            Row(
                verticalAlignment = Alignment.CenterVertically
            ) {
                if (hasHeatingIssues) {
                    Icon(
                        imageVector = Icons.Default.Whatshot,
                        contentDescription = "Aquecimento",
                        tint = Color(0xFFFFA500),
                        modifier = Modifier.size(16.dp)
                    )
                    Spacer(modifier = Modifier.width(4.dp))
                    Text(
                        "Pode aquecer em uso intensivo",
                        color = Color(0xFFFFA500),
                        fontSize = 12.sp,
                        fontWeight = FontWeight.Medium
                    )
                } else {
                    Icon(
                        imageVector = Icons.Default.Star,
                        contentDescription = "Estável",
                        tint = Color(0xFF00ff88),
                        modifier = Modifier.size(16.dp)
                    )
                    Spacer(modifier = Modifier.width(4.dp))
                    Text(
                        "Temperatura estável",
                        color = Color(0xFF00ff88),
                        fontSize = 12.sp,
                        fontWeight = FontWeight.Medium
                    )
                }
            }

            Spacer(modifier = Modifier.height(8.dp))
            Text(
                "Vantagens:",
                color = Color.Gray,
                fontSize = 12.sp,
                fontWeight = FontWeight.Medium
            )
            phone.pros.take(3).forEach { pro ->
                Text(
                    "• $pro",
                    color = Color(0xFF00ff88),
                    fontSize = 11.sp
                )
            }
        }
    }
}

@Composable
fun PerformanceSpecItem(icon: androidx.compose.ui.graphics.vector.ImageVector, title: String, value: String) {
    Row(
        modifier = Modifier.fillMaxWidth(),
        verticalAlignment = Alignment.Top
    ) {
        Icon(
            imageVector = icon,
            contentDescription = null,
            tint = Color(0xFFff6b35),
            modifier = Modifier.size(16.dp)
        )
        Spacer(modifier = Modifier.width(8.dp))
        Column(
            modifier = Modifier.weight(1f)
        ) {
            Text(
                title,
                color = Color.Gray,
                fontSize = 12.sp
            )
            Text(
                value,
                color = Color.White,
                fontSize = 13.sp,
                fontWeight = FontWeight.Medium,
                maxLines = 2
            )
        }
    }
    Spacer(modifier = Modifier.height(6.dp))
}