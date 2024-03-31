package org.example

import java.time.LocalDate

class GestorBiblioteca {
    private val catalogo = mutableListOf<Libro>()
    private val registroPrestamos = mutableListOf<Prestamo>()

    fun agregarLibro(libro: Libro) {
        val id = UtilidadesBiblioteca.generarIdentificadorUnico()
        val libroConId = Libro(id, libro.titulo, libro.autor, libro.anoPublicacion, libro.tematica)
        catalogo.add(libroConId)
        println("Libro agregado al catálogo con ID: $id")
    }

    fun eliminarLibro(idLibro: String) {
        val libro = catalogo.find { it.id == idLibro }
        if (libro != null) {
            catalogo.remove(libro)
        } else {
            println("El libro con ID $idLibro no existe en el catálogo.")
        }
    }

    fun registrarPrestamo(idLibro: String, idUsuario: String) {
        val libro = catalogo.find { it.id == idLibro }
        if (libro != null && libro.estado == EstadoLibro.DISPONIBLE) {
            libro.estado = EstadoLibro.PRESTADO
            registroPrestamos.add(Prestamo(libro.id, idUsuario, LocalDate.now()))
        } else {
            println("El libro no está disponible para préstamo.")
        }
    }

    fun devolverLibro(idLibro: String) {
        val libro = catalogo.find { it.id == idLibro }
        if (libro != null && libro.estado == EstadoLibro.PRESTADO) {
            libro.estado = EstadoLibro.DISPONIBLE
        } else {
            println("El libro con ID $idLibro no está prestado.")
        }
    }

    fun consultarDisponibilidad(idLibro: String) {
        val libro = catalogo.find { it.id == idLibro }
        if (libro != null) {
            val estado = if (libro.estado == EstadoLibro.DISPONIBLE) "disponible" else "prestado"
            println("El libro con ID $idLibro está $estado.")
        } else {
            println("El libro con ID $idLibro no existe en el catálogo.")
        }
    }

    fun librosPorEstado(estado: EstadoLibro): List<Libro> {
        return catalogo.filter { it.estado == estado }
    }

    fun mostrarCatalogo() {
        println("Catálogo de libros:")
        for (libro in catalogo) {
            println("ID: ${libro.id}, Título: ${libro.titulo}, Autor: ${libro.autor}, Estado: ${libro.estado}")
        }
    }

}

