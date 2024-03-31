package org.example

fun main() {
    val gestorBiblioteca = GestorBiblioteca()

    // Agregar libros al catálogo
    gestorBiblioteca.agregarLibro(Libro("1","El Quijote","Miguel de Cervantes",1605,"Ficcion"))
    gestorBiblioteca.agregarLibro(Libro("2","La llamada de Cthulhu","H.P. Lovecraft",1928,"Terror"))
    gestorBiblioteca.agregarLibro(Libro("3","Las aventuras de Sherlock Holmes","Arthur Conan Doyle",1887,"Policiaca"))

    // Realizar préstamos y devoluciones
    gestorBiblioteca.registrarPrestamo("1", "usuario1")
    gestorBiblioteca.registrarPrestamo("2", "usuario2")
    gestorBiblioteca.devolverLibro("1")
    gestorBiblioteca.devolverLibro("3")

    // Mostrar los libros
    gestorBiblioteca.mostrarCatalogo()
}