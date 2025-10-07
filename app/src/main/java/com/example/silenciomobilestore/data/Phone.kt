package com.example.silenciomobilestore.data

data class Phone(
    val id: Int,
    val model: String,
    val brand: String,
    val releaseYear: Int,
    val screen: ScreenSpecs,
    val processor: Processor,
    val memory: Memory,
    val camera: CameraSpecs,
    val battery: BatterySpecs,
    val connectivity: Connectivity,
    val os: String,
    val dimensions: Dimensions,
    val benchmarkScore: Int,
    val pros: List<String>,
    val cons: List<String>,
    val imageUrl: String = "" // Para futuras imagens
)

data class ScreenSpecs(
    val size: Double, // Em polegadas
    val resolution: String, // Ex: "1080x2340"
    val technology: String, // AMOLED, IPS LCD, etc.
    val refreshRate: Int, // Hz
    val protection: String // Gorilla Glass, etc.
)

data class Processor(
    val chipset: String,
    val cpu: String,
    val gpu: String
)

data class Memory(
    val ram: Int, // GB
    val storage: Int, // GB
    val expandable: Boolean
)

data class CameraSpecs(
    val main: String,
    val ultraWide: String?,
    val telephoto: String?,
    val macro: String?,
    val depth: String?,
    val front: String,
    val features: List<String> // OIS, PDAF, etc.
)

data class BatterySpecs(
    val capacity: Int, // mAh
    val charging: String, // Ex: "25W rápido"
    val wireless: Boolean
)

data class Connectivity(
    val network: List<String>, // 5G, 4G, etc.
    val wifi: String,
    val bluetooth: String,
    val nfc: Boolean,
    val usb: String
)

data class Dimensions(
    val weight: Int, // gramas
    val thickness: Double, // mm
    val waterResistance: String? // IP68, etc.
)