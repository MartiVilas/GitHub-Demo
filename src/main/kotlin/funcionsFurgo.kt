package org.example
import java.util.*
var scanner=Scanner(System.`in`)

/**
 * asdasdas
 * {@code calcPreuFurgo()}
 */
fun calcPreuFurgo():Float{
    var preuFurgo:Float=73490.0f

    println("Introduce (1)Volkswagen Gran California o (2) Volkwagen Grand California Full Equip")
    var comprobarFurgo:Float= llegirFloat()

    if (comprobarFurgo==1.0f){
        preuFurgo+=0

    } else if (comprobarFurgo==2.0f){
        preuFurgo+=20000
    } else {
        scanner.nextLine()
    }
    println("El precio de tu furgo es de: ${preuFurgo}")
    return preuFurgo

}

fun calcDevaluacion(pPreuFurgo: Float): Float{
    var preuFurgo = pPreuFurgo
    var divisor:Float=0.00001f
    println("Dime el kilometraje de tu vehículo porfavor")
    var km:Int=scanner.nextInt()
    var calculRestaPreu = preuFurgo*(divisor*km)/100
    var resultatRestaPreu = preuFurgo-calculRestaPreu
    println("Ahora tu furgoneta vale $resultatRestaPreu menos que originalmente $preuFurgo")
    return resultatRestaPreu
}


