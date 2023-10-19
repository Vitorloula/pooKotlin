package poo.carro

fun main() {
    val car = Carro()

    while (true) {
        println(""" 
                    /// Menu ///
            
            -> show = mostra estado do carro
            -> leave = retira uma pessoa do carro
            -> enter = insere uma pessoa no carro
            -> fuel = abastecer carro
            -> drive = dirigir carro
        """.trimMargin())
        val opcao = readln()

        when (opcao) {

            "show" -> {
                println(car.toString())
            }

            "enter" -> {
                car.enter()
            }

            "leave" -> {
                car.leave()
            }

            "drive" -> {
                println("Quantos Km o carro vai andar?")
                val value: Int = readln().toIntOrNull() ?: -1
                car.drive(value)
            }

            "fuel" -> {
                println("Quantos litros vai abastecer o carro?")
                val value: Int = readln().toIntOrNull() ?: -1
                car.fuel(value)
            }

            "end" -> {
                return
            }

            else -> {
                println("fail: comando invalido")
            }
        }
    }
}
