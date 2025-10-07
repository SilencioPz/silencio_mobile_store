package com.example.silenciomobilestore.data

data class PhoneBenchmark(
    val phoneId: Int,
    val overallScore: Int,
    val cpuScore: Int,
    val gpuScore: Int,
    val memoryScore: Int,
    val uxScore: Int,
    val batteryMetrics: BatteryMetrics
)

data class BatteryMetrics(
    val screenOnTime: Int,
    val gamingDrain: Int,
    val videoStreamingDrain: Int,
    val standbyDrain: Int,
    val chargingTime: Int,        // Tempo para carregar 0-100% em minutos
    val efficiencyScore: Int
)

object BenchmarkDataSource {
    fun getBenchmarkData(): List<PhoneBenchmark> = listOf(
        PhoneBenchmark(
            phoneId = 1,
            overallScore = 1850,
            cpuScore = 450,
            gpuScore = 520,
            memoryScore = 480,
            uxScore = 400,
            batteryMetrics = BatteryMetrics(
                screenOnTime = 8,
                gamingDrain = 25,
                videoStreamingDrain = 12,
                standbyDrain = 2,
                chargingTime = 65,
                efficiencyScore = 85
            )
        ),
        PhoneBenchmark(
            phoneId = 2,
            overallScore = 1650,
            cpuScore = 420,
            gpuScore = 460,
            memoryScore = 430,
            uxScore = 340,
            batteryMetrics = BatteryMetrics(
                screenOnTime = 6,
                gamingDrain = 35,
                videoStreamingDrain = 18,
                standbyDrain = 3,
                chargingTime = 19, // Destaque do carregamento de 120W
                efficiencyScore = 75
            )
        ),
        PhoneBenchmark(
            phoneId = 3,
            overallScore = 450,
            cpuScore = 120,
            gpuScore = 110,
            memoryScore = 100,
            uxScore = 120,
            batteryMetrics = BatteryMetrics(
                screenOnTime = 9,
                gamingDrain = 28,
                videoStreamingDrain = 14,
                standbyDrain = 2,
                chargingTime = 90,
                efficiencyScore = 80
            )
        ),
        PhoneBenchmark(
            phoneId = 4,
            overallScore = 520,
            cpuScore = 140,
            gpuScore = 130,
            memoryScore = 120,
            uxScore = 130,
            batteryMetrics = BatteryMetrics(
                screenOnTime = 8,
                gamingDrain = 26,
                videoStreamingDrain = 13,
                standbyDrain = 2,
                chargingTime = 70,
                efficiencyScore = 78
            )
        ),
        PhoneBenchmark(
            phoneId = 5,
            overallScore = 480,
            cpuScore = 130,
            gpuScore = 120,
            memoryScore = 110,
            uxScore = 120,
            batteryMetrics = BatteryMetrics(
                screenOnTime = 10,
                gamingDrain = 24,
                videoStreamingDrain = 12,
                standbyDrain = 2,
                chargingTime = 95,
                efficiencyScore = 82
            )
        ),
        PhoneBenchmark(
            phoneId = 6,
            overallScore = 580,
            cpuScore = 160,
            gpuScore = 150,
            memoryScore = 130,
            uxScore = 140,
            batteryMetrics = BatteryMetrics(
                screenOnTime = 8,
                gamingDrain = 25,
                videoStreamingDrain = 13,
                standbyDrain = 2,
                chargingTime = 75,
                efficiencyScore = 79
            )
        ),
        PhoneBenchmark(
            phoneId = 7,
            overallScore = 460,
            cpuScore = 125,
            gpuScore = 115,
            memoryScore = 105,
            uxScore = 115,
            batteryMetrics = BatteryMetrics(
                screenOnTime = 9,
                gamingDrain = 27,
                videoStreamingDrain = 14,
                standbyDrain = 2,
                chargingTime = 85,
                efficiencyScore = 81
            )
        ),
        PhoneBenchmark(
            phoneId = 8,
            overallScore = 1450,
            cpuScore = 380,
            gpuScore = 400,
            memoryScore = 350,
            uxScore = 320,
            batteryMetrics = BatteryMetrics(
                screenOnTime = 7, // Menor duração devido ao superaquecimento
                gamingDrain = 40, // Drenagem alta em jogos
                videoStreamingDrain = 20,
                standbyDrain = 4,
                chargingTime = 18, // Carregamento ultra-rápido
                efficiencyScore = 65 // Baixa eficiência devido ao calor
            )
        ),
        PhoneBenchmark(
            phoneId = 9,
            overallScore = 420,
            cpuScore = 180,
            gpuScore = 150,
            memoryScore = 90,
            uxScore = 80,
            batteryMetrics = BatteryMetrics(
                screenOnTime = 12, // Destaque: BATERIA MONSTRA
                gamingDrain = 18,
                videoStreamingDrain = 10,
                standbyDrain = 1,
                chargingTime = 85,
                efficiencyScore = 92
            )
        ),
        PhoneBenchmark(
            phoneId = 10,
            overallScore = 1650,
            cpuScore = 380,
            gpuScore = 350,
            memoryScore = 320,
            uxScore = 300,
            batteryMetrics = BatteryMetrics(
                screenOnTime = 11,
                gamingDrain = 22,
                videoStreamingDrain = 11,
                standbyDrain = 1,
                chargingTime = 75,
                efficiencyScore = 88
            )
        ),
        PhoneBenchmark(
            phoneId = 11,
            overallScore = 420,
            cpuScore = 160,
            gpuScore = 140,
            memoryScore = 120,
            uxScore = 85,
            batteryMetrics = BatteryMetrics(
                screenOnTime = 13, // Excelente duração com chipset eficiente
                gamingDrain = 20,
                videoStreamingDrain = 9,
                standbyDrain = 1,
                chargingTime = 80,
                efficiencyScore = 90
            )
        ),
        PhoneBenchmark(
            phoneId = 12,
            overallScore = 380,
            cpuScore = 150,
            gpuScore = 130,
            memoryScore = 100,
            uxScore = 85,
            batteryMetrics = BatteryMetrics(
                screenOnTime = 8,
                gamingDrain = 30,
                videoStreamingDrain = 15,
                standbyDrain = 2,
                chargingTime = 95, // Carregamento lento de 18W
                efficiencyScore = 76
            )
        )
    )

    fun getBenchmarkForPhone(phoneId: Int): PhoneBenchmark? {
        return getBenchmarkData().find { it.phoneId == phoneId }
    }

    fun getBestBatteryPhones(): List<PhoneBenchmark> {
        return getBenchmarkData().sortedByDescending { it.batteryMetrics.screenOnTime }
    }

    fun getBestGamingBatteryPhones(): List<PhoneBenchmark> {
        return getBenchmarkData().sortedBy { it.batteryMetrics.gamingDrain }
    }

    fun getFastestChargingPhones(): List<PhoneBenchmark> {
        return getBenchmarkData().sortedBy { it.batteryMetrics.chargingTime }
    }

    fun getMostEfficientBatteryPhones(): List<PhoneBenchmark> {
        return getBenchmarkData().sortedByDescending { it.batteryMetrics.efficiencyScore }
    }
}