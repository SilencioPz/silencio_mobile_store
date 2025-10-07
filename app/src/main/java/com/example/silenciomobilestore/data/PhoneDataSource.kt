package com.example.silenciomobilestore.data

object PhoneDataSource {
    fun loadPhones(): List<Phone> = listOf(
        Phone(
            id = 1,
            model = "Galaxy S24 Ultra 5G",
            brand = "Samsung",
            releaseYear = 2024,
            screen = ScreenSpecs(
                size = 6.8,
                resolution = "1440x3120",
                technology = "Dynamic AMOLED 2X",
                refreshRate = 120,
                protection = "Gorilla Glass Armor"
            ),
            processor = Processor(
                chipset = "Snapdragon 8 Gen 3",
                cpu = "1x3.39GHz Cortex-X4 + 3x3.1GHz Cortex-A720 + 2x2.9GHz Cortex-A720 + " +
                        "2x2.2GHz Cortex-A520",
                gpu = "Adreno 750"
            ),
            memory = Memory(ram = 12, storage = 512, expandable = false),
            camera = CameraSpecs(
                main = "200MP f/1.7",
                ultraWide = "12MP f/2.2",
                telephoto = "50MP f/3.4 (5x óptico)",
                macro = null,
                depth = "10MP f/2.4 (3x óptico)",
                front = "12MP f/2.2",
                features = listOf("OIS", "PDAF", "Zoom 100x")
            ),
            battery = BatterySpecs(5000, "45W rápido + 15W sem fio",
                true),
            connectivity = Connectivity(
                network = listOf("5G", "4G LTE"),
                wifi = "Wi-Fi 7",
                bluetooth = "5.3",
                nfc = true,
                usb = "USB Type-C 3.2"
            ),
            os = "Android 14 (One UI 6.1)",
            dimensions = Dimensions(232, 8.6, "IP68"),
            benchmarkScore = 1850,
            pros = listOf("Tela excelente", "Câmera versátil", "Performance top"),
            cons = listOf("Muito grande", "Carregamento poderia ser mais rápido")
        ),

        Phone(
            id = 2,
            model = "13T Pro 5G",
            brand = "Xiaomi",
            releaseYear = 2023,
            screen = ScreenSpecs(
                size = 6.67,
                resolution = "1220x2712",
                technology = "CrystalRes AMOLED",
                refreshRate = 144,
                protection = "Gorilla Glass 5"
            ),
            processor = Processor(
                chipset = "MediaTek Dimensity 9200+",
                cpu = "1x3.35GHz Cortex-X3 + 3x3.0GHz Cortex-A715 + 4x2.0GHz Cortex-A510",
                gpu = "Immortalis-G715 MC11"
            ),
            memory = Memory(ram = 12, storage = 512, expandable = false),
            camera = CameraSpecs(
                main = "50MP f/1.7 (Leica)",
                ultraWide = "50MP f/2.2",
                telephoto = "50MP f/2.0 (2x óptico)",
                macro = null,
                depth = null,
                front = "20MP f/2.2",
                features = listOf("OIS", "Leica lenses", "8K vídeo")
            ),
            battery = BatterySpecs(5000, "120W hipercarregamento",
                false),
            connectivity = Connectivity(
                network = listOf("5G", "4G LTE"),
                wifi = "Wi-Fi 7",
                bluetooth = "5.4",
                nfc = true,
                usb = "USB Type-C 2.0"
            ),
            os = "Android 13 (MIUI 14)",
            dimensions = Dimensions(200, 8.5, "IP68"),
            benchmarkScore = 1650,
            pros = listOf("Carregamento ultra-rápido", "Câmera Leica", "Custo-benefício"),
            cons = listOf("MIUI pode não agradar a todos", "Sem carregamento sem fio")
        ),

        Phone(
            id = 3,
            model = "Galaxy A15 5G",
            brand = "Samsung",
            releaseYear = 2023,
            screen = ScreenSpecs(
                size = 6.5,
                resolution = "1080x2340",
                technology = "Super AMOLED",
                refreshRate = 90,
                protection = "Gorilla Glass"
            ),
            processor = Processor(
                chipset = "MediaTek Dimensity 6100+",
                cpu = "2x2.2 GHz Cortex-A76 + 6x2.0 GHz Cortex-A55",
                gpu = "Mali-G57 MC2"
            ),
            memory = Memory(ram = 6, storage = 128, expandable = true),
            camera = CameraSpecs(
                main = "50MP f/1.8",
                ultraWide = "5MP f/2.2",
                telephoto = null,
                macro = "2MP f/2.4",
                depth = null,
                front = "13MP f/2.0",
                features = listOf("LED flash", "HDR", "1080p@30fps")
            ),
            battery = BatterySpecs(5000, "25W rápido", false),
            connectivity = Connectivity(
                network = listOf("5G", "4G LTE"),
                wifi = "Wi-Fi 5",
                bluetooth = "5.3",
                nfc = true,
                usb = "USB Type-C 2.0"
            ),
            os = "Android 14 (One UI 6.0)",
            dimensions = Dimensions(160, 8.3, "IP67"),
            benchmarkScore = 450,
            pros = listOf("5G acessível", "Tela Super AMOLED", "Bateria de 5000mAh"),
            //NFC é usado por cartões por aproximação, tendem a "facilitar" as compras mas...
            cons = listOf("Carregamento lento", "Câmera ultrawide básica", "Ausência de NFC" +
                    " em algumas regiões")
        ),

        Phone(
            id = 4,
            model = "Moto Pad 60 Neo 5G",
            brand = "Motorola",
            releaseYear = 2025,
            screen = ScreenSpecs(
                size = 6.5,
                resolution = "1080x2400",
                technology = "IPS LCD",
                refreshRate = 120,
                protection = "Gorilla Glass 3"
            ),
            processor = Processor(
                chipset = "MediaTek Dimensity 6300",
                cpu = "2x2.4 GHz Cortex-A76 + 6x2.0 GHz Cortex-A55",
                gpu = "Mali-G57 MC2"
            ),
            memory = Memory(ram = 8, storage = 256, expandable = true),
            camera = CameraSpecs(
                main = "50MP f/1.8",
                ultraWide = "8MP f/2.2",
                telephoto = null,
                macro = null,
                depth = null,
                front = "16MP f/2.2",
                features = listOf("PDAF", "HDR", "1080p@30fps")
            ),
            battery = BatterySpecs(5000, "30W TurboPower", false),
            connectivity = Connectivity(
                network = listOf("5G", "4G LTE"),
                wifi = "Wi-Fi 5",
                bluetooth = "5.3",
                nfc = true,
                usb = "USB Type-C 2.0"
            ),
            os = "Android 14",
            dimensions = Dimensions(163, 8.3, "IP52"),
            benchmarkScore = 520,
            pros = listOf("Android puro e atual", "Design leve e confortável", "Preço competitivo"),
            cons = listOf("Tela IPS (menor qualidade que AMOLED)", "Carregamento apenas 30W",
                "Câmera única sem variedade")
        ),

        Phone(
            id = 5,
            model = "Redmi 15C 5G",
            brand = "Xiaomi",
            releaseYear = 2025,
            screen = ScreenSpecs(
                size = 6.79,
                resolution = "1080x2460",
                technology = "IPS LCD",
                refreshRate = 90,
                protection = "Gorilla Glass 3"
            ),
            processor = Processor(
                chipset = "MediaTek Dimensity 6100+",
                cpu = "2x2.2 GHz Cortex-A76 + 6x2.0 GHz Cortex-A55",
                gpu = "Mali-G57 MC2"
            ),
            memory = Memory(ram = 6, storage = 128, expandable = true),
            camera = CameraSpecs(
                main = "50MP f/1.8",
                ultraWide = null,
                telephoto = null,
                macro = "2MP f/2.4",
                depth = null,
                front = "8MP f/2.0",
                features = listOf("LED flash", "HDR", "1080p@30fps")
            ),
            battery = BatterySpecs(5000, "18W rápido", false),
            connectivity = Connectivity(
                network = listOf("5G", "4G LTE"),
                wifi = "Wi-Fi 5",
                bluetooth = "5.3",
                nfc = true,
                usb = "USB Type-C 2.0"
            ),
            os = "Android 14 (MIUI 15)",
            dimensions = Dimensions(168, 8.1, "IP53"),
            benchmarkScore = 480,
            pros = listOf("Entrada 5G mais acessível", "Bateria de longa duração", "Android 14"),
            cons = listOf("Carregamento lento (18W)", "Tela IPS básica", "Câmera única sem ultrawide")
        ),

        Phone(
            id = 6,
            model = "G96 5G",
            brand = "Motorola",
            releaseYear = 2025,
            screen = ScreenSpecs(
                size = 6.6,
                resolution = "1080x2400",
                technology = "IPS LCD",
                refreshRate = 120,
                protection = "Gorilla Glass 3"
            ),
            processor = Processor(
                chipset = "MediaTek Dimensity 7020",
                cpu = "2x2.2 GHz Cortex-A78 + 6x2.0 GHz Cortex-A55",
                gpu = "IMG BXM-8-256"
            ),
            memory = Memory(ram = 8, storage = 256, expandable = true),
            camera = CameraSpecs(
                main = "50MP f/1.8",
                ultraWide = "8MP f/2.2",
                telephoto = null,
                macro = "2MP f/2.4",
                depth = null,
                front = "16MP f/2.2",
                features = listOf("PDAF", "HDR", "1080p@30/60fps")
            ),
            battery = BatterySpecs(5000, "30W TurboPower", false),
            connectivity = Connectivity(
                network = listOf("5G", "4G LTE"),
                wifi = "Wi-Fi 5",
                bluetooth = "5.3",
                nfc = true,
                usb = "USB Type-C 2.0"
            ),
            os = "Android 14",
            dimensions = Dimensions(163, 8.9, "IP52"),
            benchmarkScore = 580,
            pros = listOf("Bom custo-benefício 5G", "Tela de 120Hz", "Android puro"),
            cons = listOf("Tela IPS (não AMOLED)", "Carregamento poderia ser mais rápido", "Câmera ultrawide básica")
        ),

        Phone(
            id = 7,
            model = "Galaxy F17 5G",
            brand = "Samsung",
            releaseYear = 2025,
            screen = ScreenSpecs(
                size = 6.6,
                resolution = "1080x2408",
                technology = "PLS LCD",
                refreshRate = 120,
                protection = "Gorilla Glass 5"
            ),
            processor = Processor(
                chipset = "MediaTek Dimensity 6100+",
                cpu = "2x2.2 GHz Cortex-A76 + 6x2.0 GHz Cortex-A55",
                gpu = "Mali-G57 MC2"
            ),
            memory = Memory(ram = 6, storage = 128, expandable = true),
            camera = CameraSpecs(
                main = "50MP f/1.8",
                ultraWide = "5MP f/2.2",
                telephoto = null,
                macro = "2MP f/2.4",
                depth = null,
                front = "8MP f/2.0",
                features = listOf("LED flash", "HDR", "1080p@30fps")
            ),
            battery = BatterySpecs(5000, "25W rápido", false),
            connectivity = Connectivity(
                network = listOf("5G", "4G LTE"),
                wifi = "Wi-Fi 5",
                bluetooth = "5.3",
                nfc = true,
                usb = "USB Type-C 2.0"
            ),
            os = "Android 14 (One UI 6.0)",
            dimensions = Dimensions(167, 9.2, "IP67"),
            benchmarkScore = 460,
            pros = listOf("5G acessível", "Tela de 120Hz", "Bateria de longa duração"),
            cons = listOf("Tela PLS (não AMOLED)", "Carregamento apenas 25W", "Câmera ultrawide básica")
        ),

        Phone(
            id = 8,
            model = "Redmi Note 15 Pro+ 5G",
            brand = "Xiaomi",
            releaseYear = 2025,
            screen = ScreenSpecs(
                size = 6.67,
                resolution = "1220x2712",
                technology = "OLED",
                refreshRate = 120,
                protection = "Gorilla Glass Victus"
            ),
            processor = Processor(
                chipset = "MediaTek Dimensity 7200 Ultra",
                cpu = "2x2.8 GHz Cortex-A715 + 6x2.0 GHz Cortex-A510",
                gpu = "Mali-G610 MC4"
            ),
            memory = Memory(ram = 12, storage = 512, expandable = false),
            camera = CameraSpecs(
                main = "200MP f/1.7",
                ultraWide = "8MP f/2.2",
                telephoto = "2MP f/2.4",
                macro = null,
                depth = null,
                front = "16MP f/2.2",
                features = listOf("OIS", "PDAF", "8K vídeo", "HDR10+")
            ),
            battery = BatterySpecs(5000, "120W HyperCharge", false),
            connectivity = Connectivity(
                network = listOf("5G", "4G LTE"),
                wifi = "Wi-Fi 6",
                bluetooth = "5.3",
                nfc = true,
                usb = "USB Type-C 2.0"
            ),
            os = "Android 14 (HyperOS)",
            dimensions = Dimensions(161, 8.2, "IP53"),
            benchmarkScore = 1450,
            pros = listOf("Câmera de 200MP", "Carregamento ultra-rápido 120W", "Tela OLED de alta qualidade"),
            cons = listOf(
                "⚠️ ALERTA: Registros de superaquecimento em uso intensivo",
                "Aquecimento significativo durante jogos",
                "Bateria pode degradar mais rápido devido ao calor",
                "Preço elevado para a categoria"
            )
        ),

        Phone(
            id = 9,
            model = "Moto G86 Power 5G",
            brand = "Motorola",
            releaseYear = 2025,
            screen = ScreenSpecs(
                size = 6.7,
                resolution = "1080x2400",
                technology = "pOLED",
                refreshRate = 120,
                protection = "Gorilla Glass 5"
            ),
            processor = Processor(
                chipset = "Snapdragon 4 Gen 2",
                cpu = "2x2.2 GHz Cortex-A78 + 6x2.0 GHz Cortex-A55",
                gpu = "Adreno 613"
            ),
            memory = Memory(ram = 12, storage = 256, expandable = true),
            camera = CameraSpecs(
                main = "50MP f/1.9",
                ultraWide = "8MP f/2.2",
                telephoto = null,
                macro = null,
                depth = null,
                front = "32MP f/2.2",
                features = listOf("PDAF", "OIS", "HDR", "1080p@30/60fps")
            ),
            battery = BatterySpecs(6000, "33W TurboPower", false), // Destaque: BATERIA GIGANTE
            connectivity = Connectivity(
                network = listOf("5G", "4G LTE"),
                wifi = "Wi-Fi 5",
                bluetooth = "5.3",
                nfc = true,
                usb = "USB Type-C 2.0"
            ),
            os = "Android 14",
            dimensions = Dimensions(167, 8.5, "IP53"),
            benchmarkScore = 420,
            pros = listOf(
                "Bateria MONSTRA de 6000mAh",
                "Performance estável sem superaquecer",
                "Câmera principal com OIS",
                "Ótimo custo-benefício"
            ),
            cons = listOf(
                "Performance moderada (chipset de entrada)",
                "Carregamento poderia ser mais rápido",
                "Ausência de câmera macro/telephoto"
            )
        ),

        Phone(
            id = 10,
            model = "Galaxy S25 FE 5G",
            brand = "Samsung",
            releaseYear = 2025,
            screen = ScreenSpecs(
                size = 6.7,
                resolution = "1080 x 2340 pixels",
                technology = "Dynamic AMOLED 2X",
                refreshRate = 120,
                protection = "Corning Gorilla Glass 5"
            ),
            processor = Processor(
                chipset = "Qualcomm SM8650-AC Snapdragon 8 Gen 3 (4 nm)",
                cpu = "Octa-core (1x3.4 GHz Cortex-X4 & 5x3.2 GHz Cortex-A720 & 2x2.3 GHz Cortex-A520)",
                gpu = "Adreno 750"
            ),
            memory = Memory(ram = 12, storage = 256, expandable = true),
            camera = CameraSpecs(
                main = "50 MP, f/1.8, (wide), PDAF, OIS",
                ultraWide = "12 MP, f/2.2, 123˚ (ultrawide)",
                telephoto = null,
                macro = null,
                depth = null,
                front = "32 MP, f/2.2, (wide)",
                features = listOf("LED flash", "HDR", "panorama", "4K@30/60fps")
            ),
            battery = BatterySpecs(6000, "33W TurboPower", false),
            connectivity = Connectivity(
                network = listOf("GSM", "HSPA", "LTE", "5G"),
                wifi = "Wi-Fi 802.11 a/b/g/n/ac/6e",
                bluetooth = "5.3",
                nfc = true,
                usb = "USB Type-C 3.2"
            ),
            os = "Android 15, One UI 7",
            dimensions = Dimensions(167, 8.5, "IP53"),
            benchmarkScore = 420,
            pros = listOf(
                "Tela de alta qualidade com 120Hz",
                "Performance de topo com Snapdragon 8 Gen 3",
                "Câmera principal de 50MP com OIS",
                "Bateria de longa duração de 6000mAh",
                "Resistência básica a água (IP53)"
            ),
            cons = listOf(
                "Carregamento de 33W pode ser considerado lento para a concorrência",
                "Não possui câmera telephoto"
            )
        ),

        Phone(
            id = 11,
            model = "Poco M7 4G",
            brand = "Xiaomi",
            releaseYear = 2025,
            screen = ScreenSpecs(
                size = 6.7,
                resolution = "1080 x 2400 pixels",
                technology = "IPS LCD",
                refreshRate = 120,
                protection = "Corning Gorilla Glass"
            ),
            processor = Processor(
                chipset = "Mediatek MT8781 Helio G99 (6nm)",
                cpu = "Octa-core (2x2.2 GHz Cortex-A76 & 6x2.0 GHz Cortex-A55)",
                gpu = "Mali-G57 MC2"
            ),
            memory = Memory(ram = 12, storage = 256, expandable = true),
            camera = CameraSpecs(
                main = "108 MP, f/1.8, (wide), PDAF",
                ultraWide = "8 MP, f/2.2, 120˚",
                telephoto = null,
                macro = null,
                depth = null,
                front = "16 MP, f/2.5, (wide)",
                features = listOf("LED flash", "HDR", "1080p@30fps")
            ),
            battery = BatterySpecs(6000, "33W TurboPower", false),
            connectivity = Connectivity(
                network = listOf("GSM", "HSPA", "LTE"),
                wifi = "Wi-Fi 802.11 a/b/g/n/ac",
                bluetooth = "5.3",
                nfc = true,
                usb = "USB Type-C 2.0"
            ),
            os = "Android 14, MIUI 15",
            dimensions = Dimensions(167, 8.5, "IP53"),
            benchmarkScore = 420,
            pros = listOf(
                "Câmera principal de 108MP",
                "Bateria de longa duração de 6000mAh",
                "Tela com taxa de atualização de 120Hz"
            ),
            cons = listOf(
                "Não possui suporte a redes 5G",
                "Tela IPS LCD (inferior ao AMOLED)",
                "Chipset de entrada/médio (Helio G99)"
            )
        ),

        Phone(
            id = 12,
            model = "Moto G56 5G",
            brand = "Motorola",
            releaseYear = 2025,
            screen = ScreenSpecs(
                size = 6.6,
                resolution = "1080 x 2400 pixels",
                technology = "IPS LCD",
                refreshRate = 120,
                protection = "Gorilla Glass"
            ),
            processor = Processor(
                chipset = "Mediatek Dimensity 6100+ (6 nm)",
                cpu = "Octa-core (2x2.2 GHz Cortex-A76 & 6x2.0 GHz Cortex-A55)",
                gpu = "Mali-G57 MC2"
            ),
            memory = Memory(ram = 4, storage = 128, expandable = true),
            camera = CameraSpecs(
                main = "50 MP, f/1.8, (wide), PDAF",
                ultraWide = "8 MP, f/2.2, 118˚ (ultrawide)",
                telephoto = null,
                macro = null,
                depth = null,
                front = "16 MP, f/2.4, (wide)",
                features = listOf("LED flash", "HDR", "1080p@30fps")
            ),
            battery = BatterySpecs(5000, "18W wired", false),
            connectivity = Connectivity(
                network = listOf("GSM", "HSPA", "LTE", "5G"),
                wifi = "Wi-Fi 802.11 a/b/g/n/ac",
                bluetooth = "5.2",
                nfc = true,
                usb = "USB Type-C 2.0"
            ),
            os = "Android 14",
            dimensions = Dimensions(164, 8.0, "IP52"),
            benchmarkScore = 420,
            pros = listOf(
                "Suporte 5G com chipset Dimensity 6100+",
                "Tela com 120Hz",
                "Resistência básica a água (IP52)",
                "Design leve e compacto"
            ),
            cons = listOf(
                "Bateria de 5000mAh (menor que os anteriores)",
                "Carregamento lento de apenas 18W",
                "Tela IPS LCD (não é AMOLED)",
                "Memória RAM de apenas 4GB"
            )
        ),

        Phone(
            id = 13,
            model = "Galaxy A07 4G",
            brand = "Samsung",
            releaseYear = 2025,
            screen = ScreenSpecs(
                size = 6.7,
                resolution = "1080x2408 pixels",
                technology = "PLS LCD",
                refreshRate = 90,
                protection = "N/A"
            ),
            processor = Processor(
                chipset = "Qualcomm SM4435 Snapdragon 4 Gen 2",
                cpu = "Octa-core (2x2.4 GHz Cortex-A78 & 6x1.8 GHz Cortex-A55)",
                gpu = "Adreno 613"
            ),
            memory = Memory(ram = 4, storage = 64, expandable = true),
            camera = CameraSpecs(
                main = "50 MP",
                ultraWide = "5 MP",
                telephoto = null,
                macro = null,
                depth = "5 MP",
                front = "8 MP",
                features = listOf("LED flash")
            ),
            battery = BatterySpecs(5000, "25W wired", false),
            connectivity = Connectivity(
                network = listOf("GSM", "HSPA", "LTE"),
                wifi = "Wi-Fi 802.11 a/b/g/n/ac",
                bluetooth = "5.3",
                nfc = true,
                usb = "USB Type-C 2.0"
            ),
            os = "Android 14, One UI",
            dimensions = Dimensions(168, 8.4, "N/A"),
            benchmarkScore = 280,
            pros = listOf(
                "Bateria de longa duração",
                "Tela grande com 90Hz",
                "Carregamento rápido de 25W",
                "Preço acessível"
            ),
            cons = listOf(
                "Câmeras básicas",
                "Sem 5G",
                "Processador entry-level",
                "Ausência de NFC em algumas regiões"
            )
        ),

        Phone(
            id = 14,
            model = "Redmi K80 Ultra 5G",
            brand = "Xiaomi",
            releaseYear = 2025,
            screen = ScreenSpecs(
                size = 6.7,
                resolution = "1440x3200 pixels",
                technology = "LTPO AMOLED",
                refreshRate = 120,
                protection = "Corning Gorilla Glass Victus 2"
            ),
            processor = Processor(
                chipset = "Mediatek Dimensity 9300",
                cpu = "Octa-core (1x3.25 GHz Cortex-X4 & 3x2.85 GHz Cortex-X4 & 4x2.0 GHz Cortex-A720)",
                gpu = "Immortalis-G720 MC12"
            ),
            memory = Memory(ram = 12, storage = 256, expandable = false),
            camera = CameraSpecs(
                main = "50 MP",
                ultraWide = "50 MP",
                telephoto = "50 MP",
                macro = null,
                depth = null,
                front = "32 MP",
                features = listOf("Leica optics", "Dual-LED dual-tone flash", "8K video")
            ),
            battery = BatterySpecs(5500, "120W wired", true),
            connectivity = Connectivity(
                network = listOf("GSM", "CDMA", "HSPA", "EVDO", "LTE", "5G"),
                wifi = "Wi-Fi 802.11 a/b/g/n/ac/6e/7",
                bluetooth = "5.4",
                nfc = true,
                usb = "USB Type-C 3.2"
            ),
            os = "Android 14, HyperOS",
            dimensions = Dimensions(160, 8.5, "IP68"),
            benchmarkScore = 2200,
            pros = listOf(
                "Performance monstro com Dimensity 9300",
                "Tela AMOLED LTPO de alta qualidade",
                "Câmera tripla 50MP com Leica",
                "Carregamento ultra-rápido de 120W",
                "IP68 à prova d'água",
                "Design premium"
            ),
            cons = listOf(
                "Preço elevado (flagship)",
                "Pode esquentar em uso intensivo prolongado",
                "Sem expansão de memória",
                "Bateria pode durar menos que a média em jogos pesados"
            )
        ),

        Phone(
            id = 15,
            model = "Edge (2025) 5G",
            brand = "Motorola",
            releaseYear = 2025,
            screen = ScreenSpecs(
                size = 6.6,
                resolution = "1080x2400 pixels",
                technology = "pOLED",
                refreshRate = 144,
                protection = "Corning Gorilla Glass 3"
            ),
            processor = Processor(
                chipset = "Mediatek Dimensity 7300",
                cpu = "Octa-core (2x2.5 GHz Cortex-A78 & 6x2.0 GHz Cortex-A55)",
                gpu = "Mali-G615 MC2"
            ),
            memory = Memory(ram = 8, storage = 256, expandable = true),
            camera = CameraSpecs(
                main = "50 MP",
                ultraWide = "13 MP",
                telephoto = null,
                macro = "2 MP",
                depth = null,
                front = "32 MP",
                features = listOf("Dual-LED flash", "HDR", "panorama")
            ),
            battery = BatterySpecs(5000, "68W wired", true),
            connectivity = Connectivity(
                network = listOf("GSM", "HSPA", "LTE", "5G"),
                wifi = "Wi-Fi 802.11 a/b/g/n/ac/6",
                bluetooth = "5.3",
                nfc = true,
                usb = "USB Type-C 2.0"
            ),
            os = "Android 14",
            dimensions = Dimensions(162, 7.6, "IP52"),
            benchmarkScore = 650,
            pros = listOf(
                "Tela pOLED com 144Hz - muito fluida",
                "Carregamento super rápido de 68W",
                "Design fino e leve (7.6mm)",
                "5G incluído",
                "Câmera principal de 50MP competente"
            ),
            cons = listOf(
                "Processador intermediário (não é flagship)",
                "Câmera macro de apenas 2MP (simbólica)",
                "Proteção IP52 básica (contra respingos apenas)",
                "Pode esquentar um pouco em jogos pesados"
            )
        ),

        Phone(
            id = 16,
            model = "Galaxy A17 5G",
            brand = "Samsung",
            releaseYear = 2025,
            screen = ScreenSpecs(
                size = 6.6,
                resolution = "1080x2408 pixels",
                technology = "PLS LCD",
                refreshRate = 90,
                protection = "N/A"
            ),
            processor = Processor(
                chipset = "Mediatek Dimensity 6100+",
                cpu = "Octa-core (2x2.2 GHz Cortex-A76 & 6x2.0 GHz Cortex-A55)",
                gpu = "Mali-G57 MC2"
            ),
            memory = Memory(ram = 6, storage = 128, expandable = true),
            camera = CameraSpecs(
                main = "50 MP",
                ultraWide = "5 MP",
                telephoto = null,
                macro = "2 MP",
                depth = null,
                front = "8 MP",
                features = listOf("LED flash", "panorama", "HDR")
            ),
            battery = BatterySpecs(5000, "25W wired", false),
            connectivity = Connectivity(
                network = listOf("GSM", "HSPA", "LTE", "5G"),
                wifi = "Wi-Fi 802.11 a/b/g/n/ac",
                bluetooth = "5.3",
                nfc = true,
                usb = "USB Type-C 2.0"
            ),
            os = "Android 14, One UI 6",
            dimensions = Dimensions(165, 8.8, "N/A"),
            benchmarkScore = 380,
            pros = listOf(
                "Performance sólida para jogos leves/médios",
                "Bateria de longa duração (5000mAh)",
                "Tela com 90Hz fluida",
                "5G por preço acessível",
                "Câmera principal de 50MP decente"
            ),
            cons = listOf(
                "Tela PLS LCD (não é AMOLED)",
                "Câmeras auxiliares básicas (5MP ultra-wide, 2MP macro)",
                "Ausência de NFC em algumas regiões",
                "Design mais simples"
            )
        ),

        Phone(
            id = 17,
            model = "15s Pro 5G",
            brand = "Xiaomi",
            releaseYear = 2025,
            screen = ScreenSpecs(
                size = 6.7,
                resolution = "1440x3200 pixels",
                technology = "LTPO AMOLED",
                refreshRate = 120,
                protection = "Corning Gorilla Glass Victus 3"
            ),
            processor = Processor(
                chipset = "Qualcomm Snapdragon 8 Gen 4",
                cpu = "Octa-core (1x3.8 GHz Cortex-X5 & 5x3.2 GHz Cortex-A8 & 2x2.0 GHz Cortex-A5)",
                gpu = "Adreno 760"
            ),
            memory = Memory(ram = 16, storage = 1024, expandable = false),
            camera = CameraSpecs(
                main = "50 MP",
                ultraWide = "50 MP",
                telephoto = "50 MP",
                macro = null,
                depth = null,
                front = "32 MP",
                features = listOf("Leica optics", "Dual-LED flash", "8K@30fps", "Dolby Vision HDR")
            ),
            battery = BatterySpecs(5500, "120W wired", true),
            connectivity = Connectivity(
                network = listOf("GSM", "CDMA", "HSPA", "EVDO", "LTE", "5G"),
                wifi = "Wi-Fi 802.11 a/b/g/n/ac/6e/7",
                bluetooth = "5.4",
                nfc = true,
                usb = "USB Type-C 3.2"
            ),
            os = "Android 14, HyperOS",
            dimensions = Dimensions(158, 8.2, "IP68"),
            benchmarkScore = 2800,
            pros = listOf(
                "Performance ABSOLUTA - o chipset mais rápido do mercado",
                "Câmera tripla 50MP com Leica - fotos profissionais",
                "Carregamento ultra-rápido de 120W",
                "Tela LTPO AMOLED de alta qualidade",
                "IP68 - resistente à água e poeira",
                "Até 1TB de armazenamento"
            ),
            cons = listOf(
                "Preço extremamente elevado",
                "SUPERAQUECIMENTO DOCUMENTADO em uso intensivo prolongado",
                "Bateria drena rápido em modo performance máximo",
                "Sem slot para expansão de memória",
                "Pode ser desconfortável de segurar durante jogos pesados devido ao calor"
            )
        ),

        Phone(
            id = 18,
            model = "Edge 60 Pro 5G",
            brand = "Motorola",
            releaseYear = 2025,
            screen = ScreenSpecs(
                size = 6.7,
                resolution = "1080x2400 pixels",
                technology = "pOLED",
                refreshRate = 165,
                protection = "Corning Gorilla Glass 5"
            ),
            processor = Processor(
                chipset = "Qualcomm Snapdragon 7s Gen 2",
                cpu = "Octa-core (4x2.4 GHz Cortex-A78 & 4x1.95 GHz Cortex-A55)",
                gpu = "Adreno 710"
            ),
            memory = Memory(ram = 12, storage = 256, expandable = true),
            camera = CameraSpecs(
                main = "50 MP",
                ultraWide = "50 MP",
                telephoto = null,
                macro = "10 MP",
                depth = null,
                front = "50 MP",
                features = listOf("Dual-LED flash", "HDR", "panorama")
            ),
            battery = BatterySpecs(5000, "68W wired", true),
            connectivity = Connectivity(
                network = listOf("GSM", "HSPA", "LTE", "5G"),
                wifi = "Wi-Fi 802.11 a/b/g/n/ac/6",
                bluetooth = "5.3",
                nfc = true,
                usb = "USB Type-C 3.1"
            ),
            os = "Android 14",
            dimensions = Dimensions(162, 7.6, "IP68"),
            benchmarkScore = 580,
            pros = listOf(
                "Tela pOLED com 165Hz - uma das mais fluidas do mercado",
                "Câmeras múltiplas de 50MP (principal, ultra-wide e frontal)",
                "IP68 - à prova d'água completo",
                "Carregamento rápido de 68W",
                "Design premium e fino (7.6mm)",
                "12GB RAM para multitarefa pesada"
            ),
            cons = listOf(
                "Chipset intermediário (não é topo de linha)",
                "Ausência de telephoto/zoom óptico",
                "Alguns relatos de aquecimento moderado em gaming prolongado",
                "Preço um pouco elevado para a categoria"
            )
        ),

        Phone(
            id = 19,
            model = "Galaxy F36 5G",
            brand = "Samsung",
            releaseYear = 2025,
            screen = ScreenSpecs(
                size = 6.7,
                resolution = "1080 x 2408 pixels",
                technology = "PLS LCD",
                refreshRate = 120,
                protection = "Corning Gorilla Glass 5"
            ),
            processor = Processor(
                chipset = "Exynos 1280",
                cpu = "Octa-core (2x2.4 GHz Cortex-A78 & 6x2.0 GHz Cortex-A55)",
                gpu = "Mali-G68"
            ),
            memory = Memory(ram = 12, storage = 256, expandable = true),
            camera = CameraSpecs(
                main = "50 MP",
                ultraWide = "5 MP",
                telephoto = null,
                macro = "2 MP",
                depth = null,
                front = "13 MP",
                features = listOf("LED flash, panorama, HDR")
            ),
            battery = BatterySpecs(5000, "25W wired", true),
            connectivity = Connectivity(
                network = listOf("GSM / HSPA / LTE / 5G"),
                wifi = "Wi-Fi 802.11 a/b/g/n/ac, dual-band",
                bluetooth = "5.3",
                nfc = true,
                usb = "USB Type-C 2.0"
            ),
            os = "Android 14, One UI 6",
            dimensions = Dimensions(162, 7.6, "IP53"),
            benchmarkScore = 580,
            pros = listOf(
                "Bateria de longa duração",
                "Tela com refresh rate de 120Hz",
                "Certificação IP53 contra respingos",
                "Suporte ao 5G"
            ),
            cons = listOf(
                "Carregamento mais lento que a concorrência",
                "Tecnologia de tela PLS LCD inferior a AMOLED",
                "Câmera ultra wide de apenas 5MP"
            )
        ),

        Phone(
            id = 20,
            model = "Civi 5 Pro 5G",
            brand = "Xiaomi",
            releaseYear = 2025,
            screen = ScreenSpecs(
                size = 6.67,
                resolution = "1236 x 2750 pixels",
                technology = "OLED",
                refreshRate = 120,
                protection = "Corning Gorilla Glass Victus 2"
            ),
            processor = Processor(
                chipset = "Qualcomm SM8630 Snapdragon 8s Gen 3",
                cpu = "Octa-core (1x3.0 GHz Cortex-X4 & 4x2.8 GHz Cortex-A720 & 3x2.0 GHz Cortex-A520)",
                gpu = "Adreno 735"
            ),
            memory = Memory(ram = 12, storage = 256, expandable = false),
            camera = CameraSpecs(
                main = "50 MP",
                ultraWide = "50 MP",
                telephoto = "50 MP",
                macro = null,
                depth = null,
                front = "32 MP",
                features = listOf("Dual-LED dual-tone flash, HDR, panorama", "Leica optics")
            ),
            battery = BatterySpecs(5000, "67W wired", true),
            connectivity = Connectivity(
                network = listOf("GSM / CDMA / HSPA / EVDO / LTE / 5G"),
                wifi = "Wi-Fi 802.11 a/b/g/n/ac/6e/7",
                bluetooth = "5.4",
                nfc = true,
                usb = "USB Type-C 3.2"
            ),
            os = "Android 14, HyperOS",
            dimensions = Dimensions(159, 7.5, "IP65"),
            benchmarkScore = 1350,
            pros = listOf(
                "Tripla câmera de 50MP com lentes Leica",
                "Processador Snapdragon 8s Gen 3 de alta performance",
                "Tela OLED de alta qualidade",
                "Carregamento rápido de 67W",
                "Design premium com proteção IP65"
            ),
            cons = listOf(
                "Sem slot para expansão de memória",
                "Pode esquentar sob uso intensivo devido ao chipset potente",
                "Preço mais elevado"
            )
        ),

        Phone(
            id = 21,
            model = "Razr 60 Ultra 5G",
            brand = "Motorola",
            releaseYear = 2025,
            screen = ScreenSpecs(
                size = 6.9,
                resolution = "1080 x 2640 pixels",
                technology = "Foldable LTPO AMOLED, 120Hz",
                refreshRate = 120,
                protection = "Corning Gorilla Glass Victus"
            ),
            processor = Processor(
                chipset = "Qualcomm SM8630 Snapdragon 8s Gen 3",
                cpu = "Octa-core (1x3.0 GHz Cortex-X4 & 4x2.8 GHz Cortex-A720 & 3x2.0 GHz Cortex-A520)",
                gpu = "Adreno 735"
            ),
            memory = Memory(ram = 12, storage = 512, expandable = false),
            camera = CameraSpecs(
                main = "50 MP",
                ultraWide = "50 MP",
                telephoto = null,
                macro = null,
                depth = null,
                front = "32 MP",
                features = listOf("Dual-LED dual-tone flash, HDR, panorama", "Pixel Shift", "Dual-PD")
            ),
            battery = BatterySpecs(4000, "68W wired", true),
            connectivity = Connectivity(
                network = listOf("GSM / CDMA / HSPA / EVDO / LTE / 5G"),
                wifi = "Wi-Fi 802.11 a/b/g/n/ac/6e/7",
                bluetooth = "5.4",
                nfc = true,
                usb = "USB Type-C 3.2"
            ),
            os = "Android 14",
            dimensions = Dimensions(171, 7.1, "IPX8"),
            benchmarkScore = 1320,
            pros = listOf(
                "Design inovador dobrável",
                "Tela externa útil de 4.0 polegadas",
                "Performance excelente com Snapdragon 8s Gen 3",
                "Carregamento super rápido de 68W",
                "Proteção IPX8 contra água",
                "Câmeras de alta qualidade"
            ),
            cons = listOf(
                "Bateria menor devido ao design compacto (4000mAh)",
                "Preço premium",
                "Pode aquecer em uso intensivo prolongado",
                "Sem slot para expansão de memória",
                "Tela dobrável requer cuidados especiais"
            )
        ),

        Phone(
            id = 22,
            model = "Galaxy Z Fold7 5G",
            brand = "Samsung",
            releaseYear = 2025,
            screen = ScreenSpecs(
                size = 7.6,
                resolution = "1856 x 2160 pixels",
                technology = "Foldable Dynamic AMOLED 2X",
                refreshRate = 120,
                protection = "Corning Gorilla Glass Victus 2"
            ),
            processor = Processor(
                chipset = "Qualcomm Snapdragon 8 Gen 3 for Galaxy",
                cpu = "Octa-core (1x3.4 GHz Cortex-X4 & 3x3.15 GHz Cortex-A720 & 2x2.96 GHz Cortex-A720 & 2x2.27 GHz Cortex-A520)",
                gpu = "Adreno 750"
            ),
            memory = Memory(ram = 12, storage = 256, expandable = false),
            camera = CameraSpecs(
                main = "50 MP",
                ultraWide = "12 MP",
                telephoto = "10 MP",
                macro = null,
                depth = null,
                front = "10 MP",
                features = listOf("LED flash, HDR10+, panorama")
            ),
            battery = BatterySpecs(4600, "45W wired", true),
            connectivity = Connectivity(
                network = listOf("GSM / CDMA / HSPA / EVDO / LTE / 5G"),
                wifi = "Wi-Fi 802.11 a/b/g/n/ac/6e/7",
                bluetooth = "5.3",
                nfc = true,
                usb = "USB Type-C 3.2"
            ),
            os = "Android 14, One UI 6.1.1",
            dimensions = Dimensions(155, 6.1, "IP48"),
            benchmarkScore = 2150,
            pros = listOf(
                "Tela interna enorme de 7.6 polegadas ideal para multitarefa",
                "Processador Snapdragon 8 Gen 3 for Galaxy (versão overclocked)",
                "Sistema de câmeras versátil com telephoto",
                "Design premium com proteção IP48",
                "S-Pen support para produtividade",
                "Performance excepcional para jogos e aplicações pesadas"
            ),
            cons = listOf(
                "Preço muito elevado",
                "Bateria poderia ser maior para o tamanho do dispositivo",
                "Carregamento de apenas 45W (inferior à concorrência)",
                "Pode esquentar significativamente em uso intensivo prolongado",
                "Fragilidade inerente ao design dobrável"
            )
        ),

        Phone(
            id = 23,
            model = "Redmi Turbo 4 Pro 5G",
            brand = "Xiaomi",
            releaseYear = 2025,
            screen = ScreenSpecs(
                size = 6.67,
                resolution = "1220 x 2712 pixels",
                technology = "OLED",
                refreshRate = 120,
                protection = "Corning Gorilla Glass Victus"
            ),
            processor = Processor(
                chipset = "Qualcomm Snapdragon 8s Gen 3",
                cpu = "Octa-core (1x3.0 GHz Cortex-X4 & 4x2.8 GHz Cortex-A720 & 3x2.0 GHz Cortex-A520)",
                gpu = "Adreno 735"
            ),
            memory = Memory(ram = 12, storage = 512, expandable = false),
            camera = CameraSpecs(
                main = "50 MP",
                ultraWide = "8 MP",
                telephoto = null,
                macro = null,
                depth = null,
                front = "20 MP",
                features = listOf("LED flash, HDR, panorama")
            ),
            battery = BatterySpecs(5000, "90W wired", true),
            connectivity = Connectivity(
                network = listOf("GSM / CDMA / HSPA / EVDO / LTE / 5G"),
                wifi = "Wi-Fi 802.11 a/b/g/n/ac/6",
                bluetooth = "5.4",
                nfc = true,
                usb = "USB Type-C 2.0"
            ),
            os = "Android 14, HyperOS",
            dimensions = Dimensions(160, 7.8, "IP64"),
            benchmarkScore = 1300,
            pros = listOf(
                "Performance excelente com Snapdragon 8s Gen 3",
                "Carregamento ultra-rápido de 90W",
                "Tela OLED de alta qualidade",
                "Bateria de longa duração",
                "Proteção IP64 contra respingos e poeira",
                "Preço competitivo para as especificações"
            ),
            cons = listOf(
                "Câmera ultra wide básica de apenas 8MP",
                "Pode apresentar aquecimento em jogos pesados",
                "Sem slot para expansão de memória",
                "USB 2.0 (mais lento para transferência de dados)"
            )
        ),

        Phone(
            id = 24,
            model = "Edge 60 Stylus 5G",
            brand = "Motorola",
            releaseYear = 2025,
            screen = ScreenSpecs(
                size = 6.7,
                resolution = "1080 x 2400 pixels",
                technology = "pOLED",
                refreshRate = 120,
                protection = "Corning Gorilla Glass 5"
            ),
            processor = Processor(
                chipset = "MediaTek Dimensity 7030",
                cpu = "Octa-core (2x2.5 GHz Cortex-A78 & 6x2.0 GHz Cortex-A55)",
                gpu = "IMG BXM-8-256"
            ),
            memory = Memory(ram = 8, storage = 256, expandable = true),
            camera = CameraSpecs(
                main = "50 MP",
                ultraWide = "13 MP",
                telephoto = null,
                macro = null,
                depth = null,
                front = "32 MP",
                features = listOf("LED flash, HDR, panorama")
            ),
            battery = BatterySpecs(5000, "68W wired", true),
            connectivity = Connectivity(
                network = listOf("GSM / HSPA / LTE / 5G"),
                wifi = "Wi-Fi 802.11 a/b/g/n/ac/6",
                bluetooth = "5.3",
                nfc = true,
                usb = "USB Type-C 2.0"
            ),
            os = "Android 14",
            dimensions = Dimensions(162, 7.6, "IP68"),
            benchmarkScore = 450,
            pros = listOf(
                "Inclui stylus para produtividade e criatividade",
                "Proteção IP68 completa contra água e poeira",
                "Bateria de longa duração com carregamento rápido de 68W",
                "Design premium e resistente",
                "Câmera principal de 50MP de boa qualidade",
                "Preço acessível para um dispositivo com stylus"
            ),
            cons = listOf(
                "Processador MediaTek intermediário (performance limitada)",
                "Apenas 8GB de RAM (inferior aos concorrentes)",
                "GPU PowerVR menos eficiente para jogos pesados",
                "Pode esquentar um pouco em uso prolongado com o stylus"
            )
        ),

        Phone(
            id = 25,
            model = "Galaxy M36 5G",
            brand = "Samsung",
            releaseYear = 2025,
            screen = ScreenSpecs(
                size = 6.7,
                resolution = "1080 x 2408 pixels",
                technology = "PLS LCD",
                refreshRate = 120,
                protection = "Corning Gorilla Glass 5"
            ),
            processor = Processor(
                chipset = "Exynos 1380",
                cpu = "Octa-core (4x2.4 GHz Cortex-A78 & 4x2.0 GHz Cortex-A55)",
                gpu = "Mali-G68 MP5"
            ),
            memory = Memory(ram = 12, storage = 256, expandable = true),
            camera = CameraSpecs(
                main = "50 MP",
                ultraWide = "8 MP",
                telephoto = null,
                macro = "2 MP",
                depth = null,
                front = "13 MP",
                features = listOf("LED flash, panorama, HDR")
            ),
            battery = BatterySpecs(5000, "25W wired", true),
            connectivity = Connectivity(
                network = listOf("GSM / HSPA / LTE / 5G"),
                wifi = "Wi-Fi 802.11 a/b/g/n/ac/6",
                bluetooth = "5.3",
                nfc = true,
                usb = "USB Type-C 2.0"
            ),
            os = "Android 14, One UI 6.1",
            dimensions = Dimensions(162, 7.6, "IP53"),
            benchmarkScore = 580,
            pros = listOf(
                "Tela de 120Hz",
                "Bateria de longa duração",
                "Carregamento rápido",
                "Resistência a água IP53"
            ),
            cons = listOf(
                "Ausência de carregador na caixa",
                "Tela LCD em vez de AMOLED"
            )
        ),

        Phone(
            id = 26,
            model = "Poco C71",
            brand = "Xiaomi",
            releaseYear = 2025,
            screen = ScreenSpecs(
                size = 6.71,
                resolution = "720 x 1650 pixels",
                technology = "IPS LCD",
                refreshRate = 90,
                protection = "Corning Gorilla Glass"
            ),
            processor = Processor(
                chipset = "Mediatek MT6761 Helio G36",
                cpu = "Octa-core (4x2.2 GHz Cortex-A53 & 4x1.7 GHz Cortex-A53)",
                gpu = "PowerVR GE8320"
            ),
            memory = Memory(ram = 6, storage = 128, expandable = true),
            camera = CameraSpecs(
                main = "50 MP",
                ultraWide = "",
                telephoto = null,
                macro = "",
                depth = null,
                front = "8 MP",
                features = listOf("LED flash, HDR")
            ),
            battery = BatterySpecs(5000, "10W wired", true),
            connectivity = Connectivity(
                network = listOf("GSM / HSPA / LTE"),
                wifi = "Wi-Fi 802.11 a/b/g/n/ac",
                bluetooth = "5.4",
                nfc = false,
                usb = "USB Type-C 2.0"
            ),
            os = "Android 13, MIUI 14",
            dimensions = Dimensions(166, 8.3, "Não possui certificação IP"),
            benchmarkScore = 580,
            pros = listOf(
                "Bateria de longa duração",
                "Câmera principal de 50MP",
                "Design moderno",
                "Preço acessível"
            ),
            cons = listOf(
                "Desempenho limitado do Helio G36",
                "Carregamento lento (10W)",
                "Ausência de NFC",
                "Tela de baixa resolução (HD+)",
                "Histórico de aquecimento em uso intensivo - comum em modelos com Helio G36"
            )
        ),

        Phone(
            id = 27,
            model = "Edge 60s 5G",
            brand = "Motorola",
            releaseYear = 2025,
            screen = ScreenSpecs(
                size = 6.7,
                resolution = "1080 x 2400 pixels",
                technology = "P-OLED",
                refreshRate = 144,
                protection = "Corning Gorilla Glass 5"
            ),
            processor = Processor(
                chipset = "Mediatek Dimensity 7030",
                cpu = "Octa-core (2x2.5 GHz Cortex-A78 & 6x2.0 GHz Cortex-A55)",
                gpu = "IMG BXM-8-256"
            ),
            memory = Memory(ram = 12, storage = 512, expandable = false),
            camera = CameraSpecs(
                main = "50 MP",
                ultraWide = "13 MP",
                telephoto = null,
                macro = "",
                depth = null,
                front = "50 MP",
                features = listOf("Dual-LED flash, HDR, panorama")
            ),
            battery = BatterySpecs(5000, "68W wired", true),
            connectivity = Connectivity(
                network = listOf("GSM / HSPA / LTE / 5G"),
                wifi = "Wi-Fi 802.11 a/b/g/n/ac/6e",
                bluetooth = "5.3",
                nfc = true,
                usb = "USB Type-C 2.0"
            ),
            os = "Android 14",
            dimensions = Dimensions(160, 7.7, "IP68"),
            benchmarkScore = 580,
            pros = listOf(
                "Tela P-OLED de 144Hz",
                "Carregamento super rápido de 68W",
                "Certificação IP68 à prova d'água",
                "Câmera frontal de 50MP",
                "Design premium e leve"
            ),
            cons = listOf(
                "Ausência de carregador sem fio",
                "Processador Dimensity 7030 pode aquecer em uso intensivo prolongado",
                "Armazenamento não expansível"
            )
        ),

        Phone(
            id = 28,
            model = "Galaxy S25 Edge",
            brand = "Samsung",
            releaseYear = 2025,
            screen = ScreenSpecs(
                size = 6.5,
                resolution = "1440 x 3088 pixels",
                technology = "Dynamic LTPO AMOLED 2X",
                refreshRate = 120,
                protection = "Corning Gorilla Glass Victus 3"
            ),
            processor = Processor(
                chipset = "Qualcomm SM8650-AC Snapdragon 8 Gen 4",
                cpu = "Octa-core (1x3.8 GHz & 5x2.8 GHz)",
                gpu = "Adreno 760"
            ),
            memory = Memory(ram = 12, storage = 256, expandable = false),
            camera = CameraSpecs(
                main = "200 MP",
                ultraWide = "50 MP",
                telephoto = "50 MP",
                macro = null,
                depth = null,
                front = "32 MP",
                features = listOf("LED flash, auto-HDR, panorama")
            ),
            battery = BatterySpecs(5200, "65W wired, 25W wireless", true),
            connectivity = Connectivity(
                network = listOf("GSM / CDMA / HSPA / EVDO / LTE / 5G"),
                wifi = "Wi-Fi 802.11 a/b/g/n/ac/6e/7",
                bluetooth = "5.4",
                nfc = true,
                usb = "USB Type-C 3.2"
            ),
            os = "Android 15, One UI 7",
            dimensions = Dimensions(158, 7.9, "IP68"),
            benchmarkScore = 2150,
            pros = listOf(
                "Câmera tripla de alta resolução (200MP + 50MP + 50MP)",
                "Tela Dynamic AMOLED 2X de alta qualidade",
                "Processador Snapdragon 8 Gen 4 top de linha",
                "Carregamento rápido com fio e sem fio",
                "Certificação IP68",
                "Design premium com bordas curvas"
            ),
            cons = listOf(
                "Preço elevado",
                "Bateria poderia ser maior para o hardware",
                "Relatos de aquecimento moderado em uso intensivo com o Snapdragon 8 Gen 4"
            )
        ),

        Phone(
            id = 29,
            model = "Poco F7 Ultra",
            brand = "Xiaomi",
            releaseYear = 2025,
            screen = ScreenSpecs(
                size = 6.8,
                resolution = "1440 x 3200 pixels",
                technology = "AMOLED",
                refreshRate = 120,
                protection = "Corning Gorilla Glass Victus"
            ),
            processor = Processor(
                chipset = "Qualcomm Snapdragon 8s Gen 3",
                cpu = "Octa-core (1x3.0 GHz Cortex-X4 & 4x2.8 GHz Cortex-A720 & 3x2.0 GHz Cortex-A520)",
                gpu = "Adreno 735"
            ),
            memory = Memory(ram = 12, storage = 512, expandable = false),
            camera = CameraSpecs(
                main = "50 MP",
                ultraWide = "8 MP",
                telephoto = "2 MP",
                macro = null,
                depth = null,
                front = "20 MP",
                features = listOf("Dual-LED dual-tone flash, HDR, panorama")
            ),
            battery = BatterySpecs(5000, "120W wired", true),
            connectivity = Connectivity(
                network = listOf("GSM / CDMA / HSPA / EVDO / LTE / 5G"),
                wifi = "Wi-Fi 802.11 a/b/g/n/ac/6e",
                bluetooth = "5.4",
                nfc = true,
                usb = "USB Type-C 2.0"
            ),
            os = "Android 14, HyperOS",
            dimensions = Dimensions(162, 8.1, "IP54"),
            benchmarkScore = 1450,
            pros = listOf(
                "Carregamento ultra rápido de 120W",
                "Tela AMOLED de alta resolução",
                "Processador Snapdragon 8s Gen 3 potente",
                "Design premium",
                "Câmera principal de 50MP"
            ),
            cons = listOf(
                "Câmera ultra wide e telephoto de baixa resolução",
                "Certificação IP54 (apenas resistência a respingos)",
                "Ausência de carregamento sem fio",
                "Aquecimento significativo em uso intensivo - comum em modelos Poco com Snapdragon de alta performance"
            )
        ),

        Phone(
            id = 30,
            model = "Moto G Power (2025)",
            brand = "Motorola",
            releaseYear = 2025,
            screen = ScreenSpecs(
                size = 6.7,
                resolution = "1080 x 2400 pixels",
                technology = "IPS LCD",
                refreshRate = 120,
                protection = "Corning Gorilla Glass 3"
            ),
            processor = Processor(
                chipset = "Mediatek Dimensity 6300",
                cpu = "Octa-core (2x2.4 GHz Cortex-A76 & 6x2.0 GHz Cortex-A55)",
                gpu = "Mali-G57 MC2"
            ),
            memory = Memory(ram = 8, storage = 256, expandable = true),
            camera = CameraSpecs(
                main = "50 MP",
                ultraWide = "8 MP",
                telephoto = null,
                macro = "2 MP",
                depth = null,
                front = "16 MP",
                features = listOf("LED flash, HDR, panorama")
            ),
            battery = BatterySpecs(5000, "30W wired", true),
            connectivity = Connectivity(
                network = listOf("GSM / HSPA / LTE / 5G"),
                wifi = "Wi-Fi 802.11 a/b/g/n/ac",
                bluetooth = "5.0",
                nfc = true,
                usb = "USB Type-C 2.0"
            ),
            os = "Android 14",
            dimensions = Dimensions(167, 8.5, "IP52"),
            benchmarkScore = 420,
            pros = listOf(
                "Bateria de longa duração (foco da linha Power)",
                "Tela com refresh rate de 120Hz",
                "Câmera principal de 50MP",
                "5G compatível",
                "Armazenamento expansível",
                "Preço acessível"
            ),
            cons = listOf(
                "Carregamento lento (30W) para o padrão atual",
                "Tela IPS LCD em vez de AMOLED",
                "Certificação IP52 apenas (resistência básica a respingos)",
                "Aquecimento moderado em uso prolongado com o Dimensity 6300"
            )
        )
    )

    fun loadGamingPhones(): List<Phone> {
        return loadPhones()
            .filter { phone ->
                phone.benchmarkScore > 800 &&
                        phone.screen.refreshRate >= 120 &&
                        phone.processor.chipset.contains("Snapdragon") ||
                        phone.processor.chipset.contains("Dimensity 9") ||
                        phone.processor.chipset.contains("Exynos 1")
            }
            .sortedByDescending { it.benchmarkScore }
            .take(5)
    }

    fun loadTopPerformancePhones(): List<Phone> {
        return loadPhones()
            .sortedByDescending { it.benchmarkScore }
            .take(5)
            .mapIndexed { index, phone ->
                phone
            }
    }
}