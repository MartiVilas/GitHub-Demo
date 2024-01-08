package org.example
import java.util.*


/**
 * Aquest document .kt es el document destinat a les funciones de lectura d'entrada de dades.
 * @author Martí Vilàs Ruano.
 * @param llegirInt llegeix els números en format enter
 * @param llegirIntMissatge llegeix els números en format enters amb missatges d'entrada i d'error.
 * @param llegirDouble llegeix els números en format double
 * @param llegirLong llegeix els números en format long
 * @param llegirWord llegeix una cadena de Strings.
 * @param llegirChar llegeix un cadena de caràcters.
 */
fun llegirInt():Int {
    var scanner=Scanner(System.`in`)
    var num:Int=0
    var error = true
    do {if (scanner.hasNextInt()){
        num=scanner.nextInt()
        error=false
    }else {
        scanner.nextLine()
    }
    }while (error)
    return num
}

fun llegirIntMissatge(pMissatgeEntrada:String, pMissatgeError: String ):Int {
    var scanner=Scanner(System.`in`)
    var num:Int=0
    var error = true
    do {if (scanner.hasNextInt()){
        num=scanner.nextInt()
        error=false
    }else {
        scanner.nextLine()
    }
    }while (error)
    return num
}


fun llegirDouble():Double {
    var scanner=Scanner(System.`in`)
    var num:Double=0.0
    var error = true
    do {if (scanner.hasNextDouble()){
        num=scanner.nextDouble()
        error=false
    }else {
        scanner.nextLine()
    }
    }while (error)
    return num
}

fun llegirFloat():Float {
    var scanner=Scanner(System.`in`)
    var num:Float = 0.0f
    var error = true
    do {if (scanner.hasNextFloat()){
        num=scanner.nextFloat()
        error=false
    }else {
        scanner.nextLine()
    }
    }while (error)
    return num
}

fun llegirLong():Long {
    var scanner=Scanner(System.`in`)
    var num:Long=0
    var error = true
    do {if (scanner.hasNextLong()){
        num=scanner.nextLong()
        error=false
    }else {
        scanner.nextLine()
    }
    }while (error)
    return num
}

fun llegirWord(pMessageIn: String, pMessageErrorDT: String): String {
    var outputValue: String
    do {
        println(pMessageIn)
        if (!scanner.hasNext()) {
            println("ERROR: $pMessageErrorDT")
            scanner.next()
        } else {
            outputValue = scanner.next()
            scanner.nextLine()
            return outputValue
        }
    } while (true)
}

fun llegirChar(pMessageIn: String, pMessageErrorDT: String, pCase: Int = -1): Char {
    var outputValue: Char
    do {
        println(pMessageIn)
        if (!scanner.hasNext()) {
            println("ERROR: $pMessageErrorDT")
            scanner.next()
        } else {
            outputValue = scanner.next()[0]
            scanner.nextLine() // clear buffer
            when (pCase) {
                0 -> return outputValue.lowercaseChar()
                1 -> return outputValue.uppercaseChar()
                else -> return outputValue
            }
        }
    } while (true)
}

fun readBoolean(pMessageIn: String, pMessageError: String): Boolean{
    var outputValue: Boolean = false
    var correctDataType: Boolean = false

    do{
        println(pMessageIn)
        correctDataType = scanner.hasNextBoolean()

        if (!correctDataType){
            println(PURPLE_BACKGROUND_BRIGHT + "ERROR: " + pMessageError + RESET)
        }else{
            outputValue = scanner.nextBoolean()
        }
        scanner.nextLine()
    }while(!correctDataType)

    return outputValue
}

fun arropdoniment(numero: Double): Double {
    return (Math.round(numero * 100) / 100).toDouble()
}