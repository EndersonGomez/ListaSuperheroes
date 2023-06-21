package com.example.superherolist


fun main() {


    println(suma(10.5,10.2f))

    println(redondeo(suma(10.5,10.3f)))

    println(muestraResultado(suma(10.5,10.3f)))


mostrarSuperheroes(listaSuperheros())
}

fun suma(numDouble: Double, numFloat: Float): Double {
    var resul: Double = numDouble + numFloat.toDouble()
    return resul
}

fun redondeo(numDouble: Double): Double {

    var resul = kotlin.math.ceil(numDouble)
    return resul
}

fun muestraResultado(numero: Double):String{
    var resul = String.format("%.2f",numero)
    return resul
}
