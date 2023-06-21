package com.example.superherolist

data class SuperHero (val superhero:String,
                      val publisher:String,
                      val realName:String,
                      var photo:String){







}

fun listaSuperheros(): List<SuperHero> {
    val superheroes = mutableListOf<SuperHero>()
    var cerrar = false

    while (!cerrar) {
        println("Ingrese el nombre del superhéroe:")
        val nombre: String = readLine().toString()

        println("Ingrese el editor/publisher del superhéroe:")
        val publisher = readLine().toString()

        println("Ingrese el nombre real del superhéroe:")
        val nombreReal = readLine().toString()

        println("Ingrese la foto del superhéroe:")
        val foto = readLine().toString()

        val superhero = SuperHero(nombre, publisher, nombreReal, foto)
        superheroes.add(superhero)

        println("¿Desea ingresar otro superhéroe? (Si/No)")
        val opcion = readLine()?.lowercase()
        cerrar = opcion.equals("no")

        println()
    }

    return superheroes
}

fun mostrarSuperheroes(superheroes: List<SuperHero>) {
    println("Lista de Superhéroes:")
    superheroes.forEachIndexed { index, superhero ->
        println("Superhéroe ${index + 1}:")
        println("Nombre: ${superhero.superhero}")
        println("Editor/Publisher: ${superhero.publisher}")
        println("Nombre real: ${superhero.realName}")
        println("Foto: ${superhero.photo}")
        println()
    }
}