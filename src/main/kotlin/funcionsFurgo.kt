package org.example
import java.util.*
var scanner=Scanner(System.`in`)
fun calcPreuFurgo():Int{
    var preuFurgo:Int=73490

    println("Introduce (1)Volkswagen Gran California o (2) Volkwagen Grand California Full Equip")
    var comprobarFurgo= llegirInt()

    if (comprobarFurgo==1){
        preuFurgo+=0

    } else if (comprobarFurgo==2){
        preuFurgo+=20000
    } else {
        scanner.nextLine()
    }
    println("El precio de tu furgo es de: ${preuFurgo}")
    return preuFurgo

}

fun calcDevaluacion():Double{
    var preuFugo= calcPreuFurgo()
    var divisor:Double=0.00001
}


fun preuActualitzatKm():Double{
    var preuActual= calcPreuFurgo()

}