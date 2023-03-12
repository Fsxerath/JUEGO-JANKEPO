package Modelo

import kotlin.random.Random

class JANKEPO {
    var rand = Random.nextInt(3)
    var equival = when(rand){
        0 -> "Piedra"
        1 -> "Papel"
        2 -> "Tijera"
        else -> "NULL"
    }
    fun imprimir(): String{
        return " $rand , $equival \n"
    }
    fun game (player1: JANKEPO, player2: JANKEPO): String{
        var resultado = when{
            player1.rand == 0 && player2.rand == 2 -> "JUGADOR 1 GANA"
            player2.rand == 0 && player1.rand == 2 -> "JUGADOR 2 GANA"
            player1.rand > player2.rand -> "JUGADOR 1 Gana"
            player2.rand > player1.rand -> "JUGADOR 2 Gana"
            else -> "LOS JUGADORES EMPATAN"
        }
        return resultado
    }
}
fun main() {
    val x = JANKEPO()
    val y = JANKEPO()
    println("Jugador1: "+x.imprimir() + "Jugador2: "+y.imprimir())
    println(x.game(x,y))
}
