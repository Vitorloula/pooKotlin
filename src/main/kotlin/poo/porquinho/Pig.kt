package poo.porquinho

class Pig(private val volumeMax: Int) {
    private var broken: Boolean = false
    private val coins = mutableListOf<Coin>()
    private val items = mutableListOf<Item>()

    fun addCoin(coin: Coin): Boolean {
        if (!broken && coin.getVolume() + getVolume() <= volumeMax) {
            coins.add(coin)
            return true
        }
        return false
    }

    fun addItem(item: Item): Boolean {
        if (!broken && item.getVolume() + getVolume() <= volumeMax) {
            items.add(item)
            return true
        }
        return false
    }

    fun breakPig(): Boolean {
        if (!broken) {
            broken = true
            return true
        }
        return false
    }

    fun extractCoins(): Double {
        return if (broken) {
            val totalValue = coins.sumOf { it.getValue() }
            coins.clear()
            totalValue
        } else {
            0.0
        }
    }

    fun extractItems(): List<String> {
        return if (broken) {
            val itemLabels = items.map { it.getLabel() }
            items.clear()
            itemLabels
        } else {
            emptyList()
        }
    }

    override fun toString(): String {
        val coinStr = coins.joinToString(", ") { it.toString() }
        val itemStr = items.joinToString(", ") { it.toString() }
        val value = getValue()
        val volume = getVolume()
        val volumeRatio = if (broken) "1" else "$volume/${getVolumeMax()}"

        return "state = ${if (isBroken()) "broken" else "intact"} : coins = [$coinStr] : items=[$itemStr] : value = ${"%.2f".format(value)} : volume = $volumeRatio"
    }

    private fun getVolume(): Int {
        return if (broken) {
            0
        } else {
            coins.sumOf { it.getVolume() } + items.sumOf { it.getVolume() }
        }
    }

    fun getValue(): Double {
        return coins.sumOf { it.getValue() }
    }

   private fun getVolumeMax(): Int {
        return volumeMax
   }

    private fun isBroken(): Boolean {
        return broken
    }
}