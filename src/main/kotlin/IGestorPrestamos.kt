package org.example

interface IGestorPrestamos {
    fun registrarPrestamo(prestamo: Prestamo)
    fun devolverLibro(libro: Libro, usuario: Usuario)
    fun consultarHistorialPrestamosLibro(libro: Libro): List<Prestamo>
    fun consultarHistorialPrestamosUsuario(usuario: Usuario): List<Prestamo>
}