package org.example


/**
 * Este código calcula utiliza la función calcPreuFurgo en el cual tu has de introducir un número entre uno o dos
 * para que la función lea que tipo de furgoneta tienes en el caso de introducir 1 te dará el precio base de la Volkswagen
 * Grand California, en caso de poner 2 te dara el precio actualizado de la versión full equip de esta.
 * @author Martí Vilàs Ruano
 * @version 1.0.2
 * @see calcPreuFurgo
 */
fun main() {
    var preuFurgo = calcPreuFurgo()
    var preuFurgoDevaluat = calcDevaluacion(preuFurgo)
}