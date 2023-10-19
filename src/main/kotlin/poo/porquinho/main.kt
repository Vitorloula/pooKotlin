package poo.porquinho

fun main() {
    var pig: Pig? = null // Inicializa um porquinho nulo

    while (true) {
        val line = readlnOrNull() ?: ""
        val args = line.split(" ")

        when (args[0]) {
            "end" -> break
            "addCoin" -> {
                when (args[1]) {
                    "10" -> pig?.addCoin(Coin.C10)
                    "25" -> pig?.addCoin(Coin.C25)
                    "50" -> pig?.addCoin(Coin.C50)
                    "100" -> pig?.addCoin(Coin.C100)
                }
            }
            "init" -> {
                val volumeMax = args[1].toIntOrNull()
                if (volumeMax != null && volumeMax > 0) {
                    pig = Pig(volumeMax)
                } else {
                    println("fail: volume máximo inválido")
                }
            }
            "addItem" -> {
                pig?.addItem(Item(args[1], args[2].toInt()))
            }
            "break" -> {
                pig?.breakPig()
            }
            "extractCoins" -> {
                val coins = pig?.extractCoins() ?: 0.0
                println(coins)
            }
            "extractItems" -> {
                val items = pig?.extractItems()?.joinToString(", ") ?: ""
                println(items)
            }
            "show" -> {
                println(pig)
            }
            else -> {
                println("fail: comando inválido")
            }
        }
    }
}

