package poo.porquinho

class Item(private var label: String, private var volume: Int) {
    fun getLabel(): String {
        return label
    }

    fun getVolume(): Int {
        return volume
    }

    fun setLabel(label: String) {
        this.label = label
    }

    fun setVolume(volume: Int) {
        this.volume = volume
    }

    override fun toString(): String {
        return "$label:$volume"
    }
}