package org.example

fun main() {
    val biblioteca = GestorBiblioteca(GestorBiblioteca(RegistroPrestamo, Catalogo))
    val registroPrestamos = RegistroPrestamo()
    val catalogo = Catalogo<ElementoBiblioteca>()

    // Agregar libros al catálogo
    biblioteca.agregarLibro(Libro("","El Quijote","Miguel de Cervantes",1605,"Ficcion"))
    biblioteca.agregarLibro(Libro("","La llamada de Cthulhu","H.P. Lovecraft",1928,"Terror"))
    biblioteca.agregarLibro(Libro("","Las aventuras de Sherlock Holmes","Arthur Conan Doyle",1887,"Policiaca"))

    // Realizar préstamos y devoluciones
    biblioteca.registrarPrestamo("1", "usuario1")
    biblioteca.registrarPrestamo("2", "usuario2")
    biblioteca.devolverLibro("1")
    biblioteca.devolverLibro("3")

    // Mostrar los libros
    biblioteca.mostrarCatalogo()
    // Obtener elementos del catálogo y mostrarlos
    val elementosCatalogo = catalogo.obtenerElementos()
    println("Elementos en el catálogo:")
    elementosCatalogo.forEach { println(it) }

    // Filtrar elementos del catálogo por criterio (ejemplo: estado disponible)
    val elementosDisponibles = catalogo.filtrarPorCriterio { it.estado == Estado.DISPONIBLE }
    println("Elementos disponibles en el catálogo:")
    elementosDisponibles.forEach { println(it) }
}