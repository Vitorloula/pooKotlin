package poo.carro

class Carro {
    private var pass: Int = 0
    private var passMax: Int = 2
    private var gas: Int = 0
    private var gasMax: Int = 100
    private var km: Int = 0

    init {
        pass = 0
        gas = 0
        km = 0
    }

    fun enter(){
        if(pass < passMax){
            pass++
        }else {
            println("Limite de passageiros preenchido: $pass")
        }
    }

    fun leave(){
        if(pass > 0){
            pass--
        }else{
            println("Nao tem passageiros pra sair: $pass")
        }
    }

    fun drive(qtdKm:Int){
        if(qtdKm <= gas && pass > 0){
            gas -= qtdKm
            km = qtdKm
        }else if (pass == 0){
            println("Nao tem ninguem no carro")
        }else if (qtdKm> gas){
            println("Nao tem combustivel suficiente")
        }
    }

    fun fuel(qtdLt:Int){
        if(gas + qtdLt > gasMax){
            gas = gasMax
        }else{
            gas += qtdLt
        }
    }

    override fun toString(): String {
        return ("pass: $pass, gas: $gas, km: $km")
    }

}

