package org.example
import java.util.*
var scanner=Scanner(System.`in`)

/**
 * aques codi d'aquí es per fer les comprovacions de la furgoneta
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
    var km:Float=scanner.nextFloat()
    println("Dime el kilometraje de tus ruedas porfavor")
    var kmRuedas:Float=scanner.nextFloat()
    preuFurgo= kmNeumatic(kmRuedas, pPreuFurgo)
    var calculRestaPreu = preuFurgo*(divisor*km)
    var resultatRestaPreu = preuFurgo-calculRestaPreu
    println("Ahora tu furgoneta vale $resultatRestaPreu, originalmente $preuFurgo")
    return resultatRestaPreu
}

fun kmNeumatic(pKm:Float, pPreuFurgo: Float) : Float{
    if (pKm<10000 && pKm>5000){
        return pPreuFurgo-200f
    } else if (pKm>10000.0f){
        return pPreuFurgo-300.0f
    }
    return pPreuFurgo
}
