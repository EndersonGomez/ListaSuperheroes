package com.example.superherolist


fun main() {

    //Llamamos a la funcion suma.
    println(suma(10.5,10.2f))

    //Llamaoms a funcion suma dentro de la funcion redondeo.
    println(redondeo(suma(10.5,10.3f)))

    //Llamamos a la funcion sumadentro de muestra resultado para darle formato.
    println(muestraResultado(suma(10.5,10.3f)))

    //Llamamos a la funcion listasuperheros dentro de mostrar superheroes para que primero
    // nos pida los datos y luego los imprima por consola.
    mostrarSuperheroes(listaSuperheros())
}
//Creamos una funcion para sumar dos tipos de datos diferentes.
fun suma(numDouble: Double, numFloat: Float): Double {
    //Convertimos el resultado a double para poder sumarlos.
    var resul: Double = numDouble + numFloat.toDouble()
    return resul
}

//Creamos una funcion que redondee al numero entero mayor.
fun redondeo(numDouble: Double): Double {

    //Utilizamos el metodo ceil de la libreria math para hacerlo.
    var resul = kotlin.math.ceil(numDouble)
    return resul
}

//Creamos una funcion para pasar el resultado a string y darle formato deseado.
fun muestraResultado(numero: Double):String{
    var resul = String.format("%.2f",numero)
    return resul
}
