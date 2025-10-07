package com.example.silenciomobilestore.ui.components

import androidx.compose.foundation.*
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.ArrowBack
import androidx.compose.material.icons.filled.Search
import androidx.compose.material3.*
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.silenciomobilestore.data.BenchmarkDataSource
import com.example.silenciomobilestore.data.PhoneBenchmark
import com.example.silenciomobilestore.data.PhoneDataSource

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun PhoneComparisonScreen(
    onBackClick: () -> Unit
) {
    var showSelectionScreen by remember { mutableStateOf(true) }
    var selectedPhones by remember { mutableStateOf<List<com.example.silenciomobilestore.data.Phone>>(emptyList()) }

    if (showSelectionScreen) {
        PhoneSelectionScreen(
            onBackClick = onBackClick,
            onPhonesSelected = { phones ->
                selectedPhones = phones
                showSelectionScreen = false
            }
        )
    } else {
        ComparisonResultsScreen(
            phones = selectedPhones,
            onBackClick = { showSelectionScreen = true },
            onBackToHome = onBackClick
        )
    }
}

@OptIn(ExperimentalMaterial3Api::class)
@Composable
private fun PhoneSelectionScreen(
    onBackClick: () -> Unit,
    onPhonesSelected: (List<com.example.silenciomobilestore.data.Phone>) -> Unit
) {
    val allPhones = remember { PhoneDataSource.loadPhones().filter { it.model.isNotBlank() } }
    var searchQuery by remember { mutableStateOf("") }
    val filteredPhones = remember(searchQuery) {
        if (searchQuery.isBlank()) {
            allPhones
        } else {
            allPhones.filter { phone ->
                phone.model.contains(searchQuery, ignoreCase = true) ||
                        phone.brand.contains(searchQuery, ignoreCase = true)
            }
        }
    }

    var selectedPhones by remember { mutableStateOf<Set<com.example.silenciomobilestore.data.Phone>>(emptySet()) }

    Scaffold(
        topBar = {
            CenterAlignedTopAppBar(
                title = {
                    Text(
                        "Selecionar Celulares",
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
        floatingActionButton = {
            // Remove o FAB tradicional e usa o bottomBar
        },
        bottomBar = {
            if (selectedPhones.isNotEmpty()) {
                Surface(
                    modifier = Modifier
                        .fillMaxWidth()
                        .height(80.dp),
                    color = Color(0xFF1a1a1a),
                    shadowElevation = 8.dp
                ) {
                    Row(
                        modifier = Modifier
                            .fillMaxSize()
                            .padding(horizontal = 16.dp, vertical = 8.dp),
                        verticalAlignment = Alignment.CenterVertically
                    ) {
                        Text(
                            text = "${selectedPhones.size}/2 selecionados",
                            color = Color.White,
                            fontSize = 14.sp,
                            modifier = Modifier.weight(1f)
                        )

                        Button(
                            onClick = { onPhonesSelected(selectedPhones.toList()) },
                            colors = ButtonDefaults.buttonColors(
                                containerColor = Color(0xFF4CAF50)
                            ),
                            modifier = Modifier
                                .weight(2f)
                                .height(50.dp)
                        ) {
                            Text(
                                    text = "COMPARAR CELULARES",
                                color = Color.White,
                                fontSize = 16.sp,
                                fontWeight = FontWeight.Bold
                            )
                        }
                    }
                }
            }
        },
        containerColor = Color.Black
    ) { innerPadding ->
        Column(
            modifier = Modifier
                .padding(innerPadding)
                .fillMaxSize()
        ) {
            SearchBar(
                query = searchQuery,
                onQueryChange = { searchQuery = it },
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(16.dp)
            )

            SelectionHeader(
                selectedCount = selectedPhones.size,
                onClearSelection = { selectedPhones = emptySet() },
                modifier = Modifier.padding(horizontal = 16.dp)
            )

            LazyColumn(
                modifier = Modifier
                    .fillMaxSize()
                    .padding(16.dp)
            ) {
                items(filteredPhones) { phone ->
                    PhoneSelectionItem(
                        phone = phone,
                        isSelected = selectedPhones.contains(phone),
                        onSelectionChanged = { selected ->
                            selectedPhones = if (selected) {
                                if (selectedPhones.size < 2) {
                                    selectedPhones + phone
                                } else {
                                    selectedPhones
                                }
                            } else {
                                selectedPhones - phone
                            }
                        },
                        modifier = Modifier.padding(vertical = 4.dp)
                    )
                }
            }
        }
    }
}

@Composable
private fun SearchBar(
    query: String,
    onQueryChange: (String) -> Unit,
    modifier: Modifier = Modifier
) {
    TextField(
        value = query,
        onValueChange = onQueryChange,
        leadingIcon = {
            Icon(
                imageVector = Icons.Default.Search,
                contentDescription = "Pesquisar",
                tint = Color.Gray
            )
        },
        placeholder = {
            Text("Pesquisar celulares...", color = Color.Gray)
        },
        colors = TextFieldDefaults.colors(
            focusedContainerColor = Color(0xFF1a1a1a),
            unfocusedContainerColor = Color(0xFF1a1a1a),
            focusedTextColor = Color.White,
            unfocusedTextColor = Color.White,
            cursorColor = Color(0xFF4CAF50),
            focusedIndicatorColor = Color(0xFF4CAF50),
            unfocusedIndicatorColor = Color(0xFF333333)
        ),
        modifier = modifier
    )
}

@Composable
private fun SelectionHeader(
    selectedCount: Int,
    onClearSelection: () -> Unit,
    modifier: Modifier = Modifier
) {
    Row(
        modifier = modifier.fillMaxWidth(),
        horizontalArrangement = Arrangement.SpaceBetween,
        verticalAlignment = Alignment.CenterVertically
    ) {
        Text(
            text = when (selectedCount) {
                0 -> "Selecione 2 celulares para comparar"
                1 -> "Selecione mais 1 celular"
                else -> "Pronto para comparar!"
            },
            color = if (selectedCount == 2) Color(0xFF4CAF50) else Color.White,
            fontWeight = FontWeight.Medium
        )

        if (selectedCount > 0) {
            TextButton(onClick = onClearSelection) {
                Text("Limpar", color = Color(0xFFFF6B6B))
            }
        }
    }

    Spacer(modifier = Modifier.height(8.dp))
}

@Composable
private fun PhoneSelectionItem(
    phone: com.example.silenciomobilestore.data.Phone,
    isSelected: Boolean,
    onSelectionChanged: (Boolean) -> Unit,
    modifier: Modifier = Modifier
) {
    val borderColor = if (isSelected) Color(0xFF4CAF50) else Color(0xFF333333)
    val backgroundColor = if (isSelected) Color(0xFF1a3a1a) else Color(0xFF1a1a1a)

    Card(
        modifier = modifier
            .fillMaxWidth()
            .border(2.dp, borderColor, RoundedCornerShape(12.dp)),
        colors = CardDefaults.cardColors(containerColor = backgroundColor)
    ) {
        Row(
            modifier = Modifier
                .fillMaxWidth()
                .padding(16.dp)
                .clickable { onSelectionChanged(!isSelected) },
            verticalAlignment = Alignment.CenterVertically,
            horizontalArrangement = Arrangement.SpaceBetween
        ) {
            Row(verticalAlignment = Alignment.CenterVertically) {
                Box(
                    modifier = Modifier
                        .size(50.dp)
                        .clip(RoundedCornerShape(8.dp))
                        .background(Color.DarkGray),
                    contentAlignment = Alignment.Center
                ) {
                    Text(text = "📱", fontSize = 20.sp)
                }

                Spacer(modifier = Modifier.width(12.dp))

                Column {
                    Text(
                        text = "${phone.brand} ${phone.model}",
                        color = Color.White,
                        fontWeight = FontWeight.Bold,
                        fontSize = 14.sp
                    )
                    Text(
                        text = "${phone.releaseYear} • ${phone.screen.size}\" • ${phone.battery.capacity}mAh",
                        color = Color.Gray,
                        fontSize = 12.sp
                    )
                    Text(
                        text = "Score: ${phone.benchmarkScore} • RAM: ${phone.memory.ram}GB",
                        color = Color.LightGray,
                        fontSize = 11.sp
                    )
                }
            }

            Box(
                modifier = Modifier
                    .size(24.dp)
                    .border(2.dp, borderColor, CircleShape)
                    .background(if (isSelected) Color(0xFF4CAF50) else Color.Transparent),
                contentAlignment = Alignment.Center
            ) {
                if (isSelected) {
                    Text("✓", color = Color.White, fontSize = 12.sp, fontWeight = FontWeight.Bold)
                }
            }
        }
    }
}

@OptIn(ExperimentalMaterial3Api::class)
@Composable
private fun ComparisonResultsScreen(
    phones: List<com.example.silenciomobilestore.data.Phone>,
    onBackClick: () -> Unit,
    onBackToHome: () -> Unit
) {
    val benchmarks = remember {
        phones.map { phone ->
            BenchmarkDataSource.getBenchmarkForPhone(phone.id)
        }
    }

    Scaffold(
        topBar = {
            CenterAlignedTopAppBar(
                title = {
                    Text(
                        "Comparando ${phones.getOrNull(0)?.model ?: ""} vs ${phones.getOrNull(1)?.model ?: ""}",
                        fontWeight = FontWeight.Bold,
                        color = Color.White,
                        fontSize = 16.sp,
                        maxLines = 1,
                        modifier = Modifier.padding(end = 16.dp)
                    )
                },
                colors = TopAppBarDefaults.centerAlignedTopAppBarColors(
                    containerColor = Color(0xFF1a1a1a)
                ),
                navigationIcon = {
                    IconButton(onClick = onBackClick) {
                        Icon(
                            imageVector = Icons.Default.ArrowBack,
                            contentDescription = "Voltar à seleção",
                            tint = Color.White
                        )
                    }
                },
                actions = {
                    IconButton(onClick = onBackToHome) {
                        Text("Início", color = Color.White, fontSize = 12.sp)
                    }
                }
            )
        },
        containerColor = Color.Black
    ) { innerPadding ->
        if (phones.size == 2) {
            ComparisonContent(
                phones = phones,
                benchmarks = benchmarks,
                modifier = Modifier.padding(innerPadding)
            )
        } else {
            Box(
                modifier = Modifier
                    .fillMaxSize()
                    .padding(innerPadding),
                contentAlignment = Alignment.Center
            ) {
                Text("Selecione exatamente 2 celulares para comparar", color = Color.White)
            }
        }
    }
}

@Composable
private fun ComparisonContent(
    phones: List<com.example.silenciomobilestore.data.Phone>,
    benchmarks: List<PhoneBenchmark?>,
    modifier: Modifier = Modifier
) {
    val scrollState = rememberScrollState()

    val bestBatteryPhones = remember { BenchmarkDataSource.getBestBatteryPhones() }
    val fastestChargingPhones = remember { BenchmarkDataSource.getFastestChargingPhones() }
    val mostEfficientPhones = remember { BenchmarkDataSource.getMostEfficientBatteryPhones() }
    val bestGamingBatteryPhones = remember { BenchmarkDataSource.getBestGamingBatteryPhones() }

    Column(
        modifier = modifier
            .fillMaxSize()
            .verticalScroll(scrollState)
    ) {
        QuickSummarySection(phones = phones)

        Spacer(modifier = Modifier.height(16.dp))

        BatteryAnalysisSection(phones = phones, benchmarks = benchmarks)

        Spacer(modifier = Modifier.height(16.dp))

        BatteryHighlightsSection(
            phones = phones,
            benchmarks = benchmarks,
            bestBatteryPhones = bestBatteryPhones,
            fastestChargingPhones = fastestChargingPhones,
            mostEfficientPhones = mostEfficientPhones,
            bestGamingBatteryPhones = bestGamingBatteryPhones
        )

        Spacer(modifier = Modifier.height(16.dp))

        Column(
            modifier = Modifier.padding(16.dp)
        ) {
            benchmarks[0]?.let { benchmark1 ->
                benchmarks[1]?.let { benchmark2 ->
                    ComparisonSection("DESEMPENHO (BENCHMARK)") {
                        ComparisonRow("Pontuação Total", benchmark1.overallScore.toString(), benchmark2.overallScore.toString(), isHighlighted = true)
                        ComparisonRow("CPU", benchmark1.cpuScore.toString(), benchmark2.cpuScore.toString())
                        ComparisonRow("GPU", benchmark1.gpuScore.toString(), benchmark2.gpuScore.toString())
                        ComparisonRow("Memória", benchmark1.memoryScore.toString(), benchmark2.memoryScore.toString())
                        ComparisonRow("UX", benchmark1.uxScore.toString(), benchmark2.uxScore.toString())
                    }
                }
            }

            ComparisonSection("TELA - DETALHES") {
                ComparisonRow("Resolução", phones[0].screen.resolution, phones[1].screen.resolution)
                ComparisonRow("Tecnologia", phones[0].screen.technology, phones[1].screen.technology)
                ComparisonRow("Refresh Rate", "${phones[0].screen.refreshRate}Hz", "${phones[1].screen.refreshRate}Hz")
                ComparisonRow("Proteção", phones[0].screen.protection, phones[1].screen.protection)
            }

            ComparisonSection("PROCESSADOR - DETALHES") {
                ComparisonRow("Chipset", phones[0].processor.chipset, phones[1].processor.chipset)
                ComparisonRow("CPU", formatCpuInfo(phones[0].processor.cpu), formatCpuInfo(phones[1].processor.cpu))
                ComparisonRow("GPU", phones[0].processor.gpu, phones[1].processor.gpu)
            }

            ComparisonSection("CÂMERA - DETALHES") {
                ComparisonRow("Principal", phones[0].camera.main, phones[1].camera.main)
                ComparisonRow("Ultra Wide", phones[0].camera.ultraWide ?: "-", phones[1].camera.ultraWide ?: "-")
                ComparisonRow("Telefoto", phones[0].camera.telephoto ?: "-", phones[1].camera.telephoto ?: "-")
                ComparisonRow("Macro", phones[0].camera.macro ?: "-", phones[1].camera.macro ?: "-")
                ComparisonRow("Profundidade", phones[0].camera.depth ?: "-", phones[1].camera.depth ?: "-")
                ComparisonRow("Frontal", phones[0].camera.front, phones[1].camera.front)
                ComparisonRow("Recursos", phones[0].camera.features.joinToString(", "), phones[1].camera.features.joinToString(", "))
            }

            benchmarks[0]?.let { benchmark1 ->
                benchmarks[1]?.let { benchmark2 ->
                    ComparisonSection("BATERIA - DETALHES") {
                        ComparisonRow("Capacidade", "${phones[0].battery.capacity}mAh", "${phones[1].battery.capacity}mAh", isHighlighted = true)
                        ComparisonRow("Carregamento", phones[0].battery.charging, phones[1].battery.charging)
                        ComparisonRow("Tempo de Tela", "${benchmark1.batteryMetrics.screenOnTime}h", "${benchmark2.batteryMetrics.screenOnTime}h", isHighlighted = true)
                        ComparisonRow("Drenagem (Jogos)", "${benchmark1.batteryMetrics.gamingDrain}%/h", "${benchmark2.batteryMetrics.gamingDrain}%/h")
                        ComparisonRow("Drenagem (Vídeo)", "${benchmark1.batteryMetrics.videoStreamingDrain}%/h", "${benchmark2.batteryMetrics.videoStreamingDrain}%/h")
                        ComparisonRow("Carregamento 0-100%", "${benchmark1.batteryMetrics.chargingTime}min", "${benchmark2.batteryMetrics.chargingTime}min", isHighlighted = true)
                        ComparisonRow("Eficiência", "${benchmark1.batteryMetrics.efficiencyScore}/100", "${benchmark2.batteryMetrics.efficiencyScore}/100", isHighlighted = true)
                    }
                }
            }

            ComparisonSection("CONECTIVIDADE - DETALHES") {
                ComparisonRow("Rede", phones[0].connectivity.network.joinToString(), phones[1].connectivity.network.joinToString())
                ComparisonRow("Wi-Fi", phones[0].connectivity.wifi, phones[1].connectivity.wifi)
                ComparisonRow("Bluetooth", phones[0].connectivity.bluetooth, phones[1].connectivity.bluetooth)
                ComparisonRow("NFC", if (phones[0].connectivity.nfc) "Sim" else "Não",
                    if (phones[1].connectivity.nfc) "Sim" else "Não")
                ComparisonRow("USB", phones[0].connectivity.usb, phones[1].connectivity.usb)
            }

            ComparisonSection("ANÁLISE") {
                ComparisonRow("Prós", phones[0].pros.joinToString(" • "), phones[1].pros.joinToString(" • "))
                ComparisonRow("Contras", phones[0].cons.joinToString(" • "), phones[1].cons.joinToString(" • "))
            }
        }

        Spacer(modifier = Modifier.height(32.dp))
    }
}

@Composable
private fun QuickSummarySection(phones: List<com.example.silenciomobilestore.data.Phone>) {
    Card(
        modifier = Modifier
            .fillMaxWidth()
            .padding(16.dp),
        colors = CardDefaults.cardColors(containerColor = Color(0xFF1a1a1a))
    ) {
        Column(modifier = Modifier.padding(16.dp)) {
            Text(
                text = "RESUMO DA COMPARAÇÃO",
                color = Color(0xFF4CAF50),
                fontSize = 18.sp,
                fontWeight = FontWeight.Bold,
                modifier = Modifier.padding(bottom = 16.dp)
            )

            Row(
                modifier = Modifier.fillMaxWidth(),
                horizontalArrangement = Arrangement.SpaceBetween
            ) {
                phones.forEachIndexed { index, phone ->
                    QuickSummaryPhoneHeader(phone = phone, modifier = Modifier.weight(1f))
                    if (index < phones.size - 1) {
                        Spacer(modifier = Modifier.width(8.dp))
                    }
                }
            }

            Spacer(modifier = Modifier.height(16.dp))

            QuickSummaryRow("Lançamento", "${phones[0].releaseYear}", "${phones[1].releaseYear}")
            QuickSummaryRow("Peso", "${phones[0].dimensions.weight}g", "${phones[1].dimensions.weight}g")
            QuickSummaryRow("Espessura", "${phones[0].dimensions.thickness}mm", "${phones[1].dimensions.thickness}mm")
            QuickSummaryRow("Sistema", formatOsInfo(phones[0].os), formatOsInfo(phones[1].os))
            QuickSummaryRow("Armazenamento", "${phones[0].memory.storage}GB", "${phones[1].memory.storage}GB", isHighlighted = true)
            QuickSummaryRow("Tela", "${phones[0].screen.size}\"", "${phones[1].screen.size}\"", isHighlighted = true)
            QuickSummaryRow("Câmera Principal", formatCameraInfo(phones[0].camera.main), formatCameraInfo(phones[1].camera.main), isHighlighted = true)
            QuickSummaryRow("RAM", "${phones[0].memory.ram}GB", "${phones[1].memory.ram}GB", isHighlighted = true)
            QuickSummaryRow("Bateria", "${phones[0].battery.capacity}mAh", "${phones[1].battery.capacity}mAh", isHighlighted = true)
            QuickSummaryRow("Resistência", phones[0].dimensions.waterResistance ?: "Não", phones[1].dimensions.waterResistance ?: "Não")
        }
    }
}

@Composable
private fun QuickSummaryPhoneHeader(phone: com.example.silenciomobilestore.data.Phone, modifier: Modifier = Modifier) {
    Column(
        modifier = modifier,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Box(
            modifier = Modifier
                .size(80.dp)
                .clip(RoundedCornerShape(12.dp))
                .background(Color.DarkGray),
            contentAlignment = Alignment.Center
        ) {
            Text(
                text = "📱",
                fontSize = 32.sp
            )
        }

        Spacer(modifier = Modifier.height(8.dp))

        Text(
            text = phone.brand,
            color = Color.Gray,
            fontSize = 12.sp,
            fontWeight = FontWeight.Medium
        )

        Text(
            text = phone.model,
            color = Color.White,
            fontSize = 14.sp,
            fontWeight = FontWeight.Bold,
            textAlign = TextAlign.Center,
            maxLines = 2
        )
    }
}

@Composable
private fun QuickSummaryRow(label: String, value1: String, value2: String, isHighlighted: Boolean = false) {
    Row(
        modifier = Modifier
            .fillMaxWidth()
            .padding(vertical = 6.dp),
        horizontalArrangement = Arrangement.SpaceBetween
    ) {
        Text(
            text = label,
            color = Color.Gray,
            fontSize = 14.sp,
            fontWeight = FontWeight.Medium,
            modifier = Modifier.weight(2f)
        )

        Text(
            text = value1,
            color = if (isHighlighted) Color(0xFF4CAF50) else Color.White,
            fontSize = if (isHighlighted) 15.sp else 14.sp,
            fontWeight = if (isHighlighted) FontWeight.Bold else FontWeight.Normal,
            textAlign = TextAlign.Center,
            modifier = Modifier.weight(1.5f)
        )

        Text(
            text = value2,
            color = if (isHighlighted) Color(0xFF4CAF50) else Color.White,
            fontSize = if (isHighlighted) 15.sp else 14.sp,
            fontWeight = if (isHighlighted) FontWeight.Bold else FontWeight.Normal,
            textAlign = TextAlign.Center,
            modifier = Modifier.weight(1.5f)
        )
    }

    Divider(
        color = Color(0xFF333333),
        thickness = 0.5.dp,
        modifier = Modifier.padding(vertical = 2.dp)
    )
}

private fun formatOsInfo(os: String): String {
    return os.split("\\(")[0].trim()
}

private fun formatCameraInfo(camera: String): String {
    return camera.split(" ")[0]
}

private fun formatCpuInfo(cpu: String): String {
    return cpu.split("\\+")[0].replace("x", "×")
}

@Composable
private fun ComparisonSection(title: String, content: @Composable () -> Unit) {
    Card(
        modifier = Modifier
            .fillMaxWidth()
            .padding(vertical = 8.dp),
        colors = CardDefaults.cardColors(containerColor = Color(0xFF1a1a1a))
    ) {
        Column(modifier = Modifier.padding(16.dp)) {
            Text(
                text = title,
                color = Color(0xFF4CAF50),
                fontSize = 16.sp,
                fontWeight = FontWeight.Bold,
                modifier = Modifier.padding(bottom = 12.dp)
            )
            content()
        }
    }
}

@Composable
private fun ComparisonRow(label: String, value1: String, value2: String, isHighlighted: Boolean = false) {
    Row(
        modifier = Modifier
            .fillMaxWidth()
            .padding(vertical = 6.dp),
        horizontalArrangement = Arrangement.SpaceBetween
    ) {
        Text(
            text = label,
            color = Color.Gray,
            fontSize = 14.sp,
            fontWeight = FontWeight.Medium,
            modifier = Modifier.weight(2f)
        )

        Text(
            text = value1,
            color = if (isHighlighted) Color(0xFF4CAF50) else Color.White,
            fontSize = 14.sp,
            fontWeight = if (isHighlighted) FontWeight.Bold else FontWeight.Normal,
            textAlign = TextAlign.Center,
            modifier = Modifier.weight(1.5f)
        )

        Text(
            text = value2,
            color = if (isHighlighted) Color(0xFF4CAF50) else Color.White,
            fontSize = 14.sp,
            fontWeight = if (isHighlighted) FontWeight.Bold else FontWeight.Normal,
            textAlign = TextAlign.Center,
            modifier = Modifier.weight(1.5f)
        )
    }

    Divider(
        color = Color(0xFF333333),
        thickness = 1.dp,
        modifier = Modifier.padding(vertical = 4.dp)
    )
}

@Composable
private fun BatteryAnalysisSection(phones: List<com.example.silenciomobilestore.data.Phone>,
                                   benchmarks: List<
                                           PhoneBenchmark?>) {
    benchmarks[0]?.let { benchmark1 ->
        benchmarks[1]?.let { benchmark2 ->
            val winner = when {
                benchmark1.batteryMetrics.screenOnTime > benchmark2.batteryMetrics.screenOnTime -> 1
                benchmark2.batteryMetrics.screenOnTime > benchmark1.batteryMetrics.screenOnTime -> 2
                else -> 0
            }

            Card(
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(16.dp),
                colors = CardDefaults.cardColors(containerColor = Color(0xFF1a1a1a))
            ) {
                Column(modifier = Modifier.padding(16.dp)) {
                    Text(
                        text = "🏆 ANÁLISE DA BATERIA",
                        color = Color(0xFFFFD700),
                        fontSize = 16.sp,
                        fontWeight = FontWeight.Bold,
                        modifier = Modifier.padding(bottom = 8.dp)
                    )

                    when (winner) {
                        1 -> Text(
                            text = "${phones[0].model} vence em duração: ${benchmark1.
                            batteryMetrics.screenOnTime}h vs ${benchmark2.
                            batteryMetrics.screenOnTime}h",
                            color = Color(0xFF4CAF50),
                            fontSize = 14.sp
                        )
                        2 -> Text(
                            text = "${phones[1].model} vence em duração: ${benchmark2.
                            batteryMetrics.screenOnTime}h vs ${benchmark1.
                            batteryMetrics.screenOnTime}h",
                            color = Color(0xFF4CAF50),
                            fontSize = 14.sp
                        )
                        else -> Text(
                            text = "Empate em duração da bateria: ${benchmark1.
                            batteryMetrics.screenOnTime}h",
                            color = Color.Gray,
                            fontSize = 14.sp
                        )
                    }

                    Spacer(modifier = Modifier.height(4.dp))

                    Text(
                        text = "Dica: Acima de 10h é excelente, 8-10h é bom, abaixo de 7h é moderado",
                        color = Color.Gray,
                        fontSize = 12.sp,
                        fontStyle = FontStyle.Italic
                    )
                }
            }
        }
    }
}

@Composable
private fun BatteryHighlightsSection(
    phones: List<com.example.silenciomobilestore.data.Phone>,
    benchmarks: List<PhoneBenchmark?>,
    bestBatteryPhones: List<PhoneBenchmark>,
    fastestChargingPhones: List<PhoneBenchmark>,
    mostEfficientPhones: List<PhoneBenchmark>,
    bestGamingBatteryPhones: List<PhoneBenchmark>
) {
    Card(
        modifier = Modifier
            .fillMaxWidth()
            .padding(16.dp),
        colors = CardDefaults.cardColors(containerColor = Color(0xFF1a1a1a))
    ) {
        Column(modifier = Modifier.padding(16.dp)) {
            Text(
                text = "🏆 DESTAQUES DE BATERIA",
                color = Color(0xFFFFD700),
                fontSize = 18.sp,
                fontWeight = FontWeight.Bold,
                modifier = Modifier.padding(bottom = 16.dp)
            )

            benchmarks[0]?.let { benchmark1 ->
                benchmarks[1]?.let { benchmark2 ->
                    val phone1Rank = bestBatteryPhones.indexOfFirst { it.phoneId == phones[0].id } + 1
                    val phone2Rank = bestBatteryPhones.indexOfFirst { it.phoneId == phones[1].id } + 1

                    HighlightRow(
                        icon = "🔋",
                        title = "Duração da Bateria",
                        value1 = "${benchmark1.batteryMetrics.screenOnTime}h (#${phone1Rank})",
                        value2 = "${benchmark2.batteryMetrics.screenOnTime}h (#${phone2Rank})",
                        isBetter = benchmark1.batteryMetrics.screenOnTime > benchmark2.batteryMetrics.screenOnTime
                    )
                }
            }

            benchmarks[0]?.let { benchmark1 ->
                benchmarks[1]?.let { benchmark2 ->
                    val phone1Rank = fastestChargingPhones.indexOfFirst { it.phoneId == phones[0].id } + 1
                    val phone2Rank = fastestChargingPhones.indexOfFirst { it.phoneId == phones[1].id } + 1

                    HighlightRow(
                        icon = "⚡",
                        title = "Carregamento Rápido",
                        value1 = "${benchmark1.batteryMetrics.chargingTime}min (#${phone1Rank})",
                        value2 = "${benchmark2.batteryMetrics.chargingTime}min (#${phone2Rank})",
                        isBetter = benchmark1.batteryMetrics.chargingTime < benchmark2.batteryMetrics.chargingTime
                    )
                }
            }

            benchmarks[0]?.let { benchmark1 ->
                benchmarks[1]?.let { benchmark2 ->
                    val phone1Rank = mostEfficientPhones.indexOfFirst { it.phoneId == phones[0].id } + 1
                    val phone2Rank = mostEfficientPhones.indexOfFirst { it.phoneId == phones[1].id } + 1

                    HighlightRow(
                        icon = "📊",
                        title = "Eficiência Energética",
                        value1 = "${benchmark1.batteryMetrics.efficiencyScore}/100 (#${phone1Rank})",
                        value2 = "${benchmark2.batteryMetrics.efficiencyScore}/100 (#${phone2Rank})",
                        isBetter = benchmark1.batteryMetrics.efficiencyScore > benchmark2.batteryMetrics.efficiencyScore
                    )
                }
            }

            benchmarks[0]?.let { benchmark1 ->
                benchmarks[1]?.let { benchmark2 ->
                    val phone1Rank = bestGamingBatteryPhones.indexOfFirst { it.phoneId == phones[0].id } + 1
                    val phone2Rank = bestGamingBatteryPhones.indexOfFirst { it.phoneId == phones[1].id } + 1

                    HighlightRow(
                        icon = "🎮",
                        title = "Desempenho em Jogos",
                        value1 = "${benchmark1.batteryMetrics.gamingDrain}%/h (#${phone1Rank})",
                        value2 = "${benchmark2.batteryMetrics.gamingDrain}%/h (#${phone2Rank})",
                        isBetter = benchmark1.batteryMetrics.gamingDrain < benchmark2.batteryMetrics.gamingDrain
                    )
                }
            }

            Spacer(modifier = Modifier.height(8.dp))

            Text(
                text = "*Ranking entre todos os ${bestBatteryPhones.size} celulares do app",
                color = Color.Gray,
                fontSize = 10.sp,
                fontStyle = FontStyle.Italic
            )
        }
    }
}

@Composable
private fun HighlightRow(icon: String, title: String, value1: String, value2: String, isBetter: Boolean) {
    Row(
        modifier = Modifier
            .fillMaxWidth()
            .padding(vertical = 8.dp),
        horizontalArrangement = Arrangement.SpaceBetween,
        verticalAlignment = Alignment.CenterVertically
    ) {
        Row(verticalAlignment = Alignment.CenterVertically) {
            Text(
                text = icon,
                fontSize = 16.sp,
                modifier = Modifier.width(24.dp)
            )
            Text(
                text = title,
                color = Color.White,
                fontSize = 14.sp,
                fontWeight = FontWeight.Medium,
                modifier = Modifier.width(120.dp)
            )
        }

        Text(
            text = value1,
            color = if (isBetter) Color(0xFF4CAF50) else Color.White,
            fontSize = 12.sp,
            fontWeight = if (isBetter) FontWeight.Bold else FontWeight.Normal,
            textAlign = TextAlign.Center,
            modifier = Modifier.weight(1f)
        )

        Text(
            text = value2,
            color = if (!isBetter) Color(0xFF4CAF50) else Color.White,
            fontSize = 12.sp,
            fontWeight = if (!isBetter) FontWeight.Bold else FontWeight.Normal,
            textAlign = TextAlign.Center,
            modifier = Modifier.weight(1f)
        )
    }

    Divider(color = Color(0xFF333333), thickness = 0.5.dp)
}

///floatingActionButton = {
//    if (selectedPhones.isNotEmpty()) {
//        ExtendedFloatingActionButton (
//            onClick = { onPhonesSelected(selectedPhones.toList()) },
//            containerColor = Color(0xFF4CAF50),
//            modifier = Modifier
//                .fillMaxWidth()
//                .padding(horizontal = 16.dp, vertical = 8.dp)
//        ) {
//            Text(
//                text = "Comparar\n${selectedPhones.size}/2 CELULARES",
//                color = Color.White,
//                fontSize = 16.sp,
//                textAlign = TextAlign.Center,
//                fontWeight = FontWeight.Bold
//            )
//        }
//    }
//},