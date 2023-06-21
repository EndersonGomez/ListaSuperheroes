package com.example.superherolist
//Creamos la clase para poder crear objetos con su constructor
data class SuperHero (val superhero:String,
                      val publisher:String,
                      val realName:String,
                      var photo:String){
}

//Creamos la primera funcion que devolvera un arrray con los objetos creados de nuestra clase.
fun listaSuperheros(): List<SuperHero> {
    //Declaramos la lista del tipo mutable sobre la clase creada anteriormente.
    val superheroes = mutableListOf<SuperHero>()
    //Creamos una variable boleeana para crear un ciclo y asi poder cerrarlo.
    var cerrar = false

    //Creamos un ciclo que mientras nuestra variable sea falsa siga reiniciandose.
    while (!cerrar) {
        //Preguntamos los datos al usuario y guardamos los resultados en variables para luego construir los objetos de la clase.
        println("Ingrese el nombre del superheroe:")
        val nombre: String = readLine().toString()

        println("Ingrese el editor/publisher del superhéroe:")
        val publisher = readLine().toString()

        println("Ingrese el nombre real del superhéroe:")
        val nombreReal = readLine().toString()

        println("Ingrese la foto del superhéroe:")
        val foto = readLine().toString()

        //Creamos una instancia de nuestra clase y la agregamos al arraylist.
        val superhero = SuperHero(nombre, publisher, nombreReal, foto)
        superheroes.add(superhero)

        //Preguntamos si desea continuar ingresando datos de ser negativo cerramos el ciclo.
        println("¿Desea ingresar otro superhéroe? (Si/No)")
        val opcion = readLine()?.lowercase()
        cerrar = opcion.equals("no")

        println()
    }

    return superheroes
}

//Funcion que imprime nuestros datos en el arraylist.
fun mostrarSuperheroes(superheroes: List<SuperHero>) {
    println("Lista de Superhéroes:")
    //Creamos un ciclo para iterar la lista e ir imprimiendo todos los datos de la misma.
    superheroes.forEachIndexed { index, superhero ->
        println("Superhéroe ${index + 1}:")
        println("Nombre: ${superhero.superhero}")
        println("Editor/Publisher: ${superhero.publisher}")
        println("Nombre real: ${superhero.realName}")
        println("Foto: ${superhero.photo}")
        println()
    }
}