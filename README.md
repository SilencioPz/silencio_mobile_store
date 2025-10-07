📱 SILENCIO MOBILE STORE
APP DEFINITIVO PARA COMPARAR CELULARES E ENCONTRAR SEU ATUAL E PERFEITO!

(Porque escolher celular não é brincadeira - é investimento! 💰📊)

---------------------------------------------------------------------------------------
🎯 FUNCIONALIDADES PRINCIPAIS
📋 LISTA COMPLETA DE CELULARES

    30+ modelos das principais marcas (Samsung, Xiaomi, Motorola)

    Dados técnicos completos e atualizados (2023-2025)

    Filtros por marca, ano, preço e especificações

---------------------------------------------------------------------------------------
⚖️ COMPARAÇÃO AVANÇADA 1×1

    Compare dois celulares lado a lado

    Análise detalhada de todas as especificações

    Benchmarks reais e métricas de performance

    Destaques automáticos das diferenças principais
    
---------------------------------------------------------------------------------------
🔋 ANÁLISE ESPECIALIZADA DE BATERIA

    Duração em horas de tela

    Velocidade de carregamento

    Eficiência energética

    Desempenho em jogos

    Rankings comparativos entre todos os modelos
    
---------------------------------------------------------------------------------------
📊 MÉTRICAS TÉCNICAS COMPLETAS

    Processador, RAM, armazenamento

    Câmeras (principal, ultra-wide, telephoto, frontal)

    Tela (tecnologia, resolução, refresh rate)

    Conectividade (5G, Wi-Fi, Bluetooth, NFC)

    Bateria e carregamento

---------------------------------------------------------------------------------------
🛠️ TECNOLOGIAS UTILIZADAS

Componente	Tecnologia

Linguagem	Kotlin 100%

UI Framework	Jetpack Compose

Design System	Material 3

Arquitetura	MVVM com Estado Compose

Navegação	Gerenciamento próprio de telas

Compatibilidade	Android 7.0+ (API 24)

---------------------------------------------------------------------------------------
🗂️ ESTRUTURA DO PROJETO
text

SilencioMobileStore/

├── app/

│   ├── src/main/java/com/example/silenciomobilestore/

│   │   ├── ui/

│   │   │   ├── components/           # Componentes de UI

│   │   │   │   ├── MainMenuScreen.kt

│   │   │   │   ├── PhoneListScreen.kt

│   │   │   │   ├── PhoneComparisonScreen.kt

│   │   │   │   └── PhoneDetailsScreen.kt

│   │   │   ├── AppScreen.kt          # Navegação

│   │   │   └── theme/                # Tema e cores

│   │   ├── data/                     # Fontes de dados

│   │   │   ├── PhoneDataSource.kt    # 30 celulares

│   │   │   ├── Phone.kt              # Modelo principal

│   │   │   └── PhoneBenchmark.kt     # Modelo de benchmark

│   │   └── MainActivity.kt           # Ponto de entrada

├── build.gradle.kts                  # Configurações do projeto

└── gradle.properties                 # Propriedades do build

---------------------------------------------------------------------------------------
📊 MODELOS DE DADOS
📱 Phone (Celular)
kotlin

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
    val cons: List<String>
)

🔋 BatterySpecs (Bateria)
kotlin

data class BatterySpecs(
    val capacity: Int,          // mAh
    val charging: String,       // Tecnologia de carregamento
    val wireless: Boolean       // Carregamento sem fio
)

---------------------------------------------------------------------------------------
🎮 Recursos Especiais

    Detecção de superaquecimento ⚠️

    Alertas de problemas conhecidos

    Rankings de eficiência energética

    Análise de custo-benefício
---------------------------------------------------------------------------------------
🎨 DESIGN E UX
🎯 Princípios de Design

    Tema escuro profissional - ideal para comparações longas

    Cores semânticas - verde para vantagens, vermelho para alertas

    Tipografia hierárquica - fácil leitura e escaneamento

    Layout responsivo - adaptável a diferentes tamanhos de tela

---------------------------------------------------------------------------------------
✨ Componentes Personalizados

    Cards de comparação com highlights automáticos

    Barras de progresso para métricas numéricas

    Ícones intuitivos para categorias técnicas

---------------------------------------------------------------------------------------
⚙️ CONFIGURAÇÃO TÉCNICA
📋 Versões Críticas

    Gradle: 8.12

    JDK: 11 (Requisito do Kotlin)

    Android Studio: Electric Eel ou superior

    Min SDK: 24 (Android 7.0)

    Target SDK: 36 (Android 14)

    Kotlin: 1.9.0+

---------------------------------------------------------------------------------------
🔧 Dependências Principais
kotlin

// Jetpack Compose
implementation(libs.androidx.activity.compose)
implementation(platform(libs.androidx.compose.bom))
implementation(libs.androidx.compose.material3)

// AndroidX Core
implementation(libs.androidx.core.ktx)
implementation(libs.androidx.lifecycle.runtime.ktx)

// Ícones
implementation("androidx.compose.material:material-icons-core")
implementation("androidx.compose.material:material-icons-extended")

---------------------------------------------------------------------------------------
🚀 COMO EXECUTAR
Terminal (Linux/macOS):
bash

git clone https://github.com/seu-usuario/SilencioMobileStore.git
cd SilencioMobileStore
./gradlew assembleDebug

---------------------------------------------------------------------------------------
PowerShell (Windows):
bash

git clone https://github.com/seu-usuario/SilencioMobileStore.git
cd SilencioMobileStore
.\gradlew.bat assembleDebug

---------------------------------------------------------------------------------------
Android Studio:

    Abra o projeto

    Build > Make Project

    Execute no emulador (Recomendado: Pixel 5 com API 34+)

---------------------------------------------------------------------------------------
🎯 PÚBLICO-ALVO

    🤓 Entusiastas de tecnologia que amam dados

    🛒 Compradores conscientes que pesquisam antes de comprar

    📊 Analistas técnicos que precisam de comparações precisas

    🎮 Gamers mobile que buscam performance

    🔋 Usuários power que valorizam bateria

---------------------------------------------------------------------------------------
📄 LICENÇA

Open-source sob GNU GPL v3.0

    Use, modifique e contribua

    Mantenha o código livre para todos

    Derivações devem usar a mesma licença

---------------------------------------------------------------------------------------
👨‍💻 DESENVOLVIMENTO

Feito com café ☕ e paixão por tecnologia em Rondonópolis/MT!

"Porque escolher celular deveria ser baseado em dados, não em marketing!" 📱✨

*Versão 1.0 - Compilado com dados de 30+ modelos reais do mercado* 📊🎯
