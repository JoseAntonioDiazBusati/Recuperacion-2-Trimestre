package org.example

fun main() {
    val gestorBiblioteca = GestorBiblioteca()
    val biblioteca = GestorBiblioteca()

    // Agregar libros al catálogo
    biblioteca.agregarLibro(Libro("","El Quijote","Miguel de Cervantes",1605,"Ficcion"))
    biblioteca.agregarLibro(Libro("","La llamada de Cthulhu","H.P. Lovecraft",1928,"Terror"))
    biblioteca.agregarLibro(Libro("","Las aventuras de Sherlock Holmes","Arthur Conan Doyle",1887,"Policiaca"))

    // Realizar préstamos y devoluciones
    gestorBiblioteca.registrarPrestamo("1", "usuario1")
    gestorBiblioteca.registrarPrestamo("2", "usuario2")
    gestorBiblioteca.devolverLibro("1")
    gestorBiblioteca.devolverLibro("3")

    // Mostrar los libros
    gestorBiblioteca.mostrarCatalogo()
}