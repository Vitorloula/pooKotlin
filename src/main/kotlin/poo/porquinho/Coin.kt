package poo.porquinho

class Coin private constructor(private val value: Double, private val volume: Int) {
    companion object {
        val C10 = Coin(10.0, 1)
        val C25 = Coin(25.0, 2)
        val C50 = Coin(50.0, 3)
        val C100 = Coin(100.0, 4)
    }

    fun getValue(): Double {
        return value
    }

    fun getVolume(): Int {
        return volume
    }

    override fun toString(): String {
        return "$value:$volume"
    }
}